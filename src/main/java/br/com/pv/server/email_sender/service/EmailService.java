package br.com.pv.server.email_sender.service;

import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import static br.com.pv.server.email_sender.constantes.Constantes.EMAIL_ENVIADO_COM_SUCESSO;
import static br.com.pv.server.email_sender.constantes.Constantes.EMAIL_ENVIADO_FALHA;
import static br.com.pv.server.email_sender.mapper.EmailMapper.mapToEntity;

import br.com.pv.server.email_sender.exception.EmailNaoEnviadoException;
import br.com.pv.server.email_sender.model.Email;
import br.com.pv.server.email_sender.model.EmailRequest;
import br.com.pv.server.email_sender.model.EmailResponse;
import br.com.pv.server.email_sender.repository.EmailRepository;
import br.com.pv.server.email_sender.utils.Util;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "EMAIL_SERVICE")
@Service
@RequiredArgsConstructor
public class EmailService {

	private final JavaMailSender mailSender;
	private final EmailRepository emailRepository;

	public EmailResponse enviarEmail(EmailRequest emailRequest) {
		
		
		
		try {
			MimeMessage emailSchema = buildEmail(emailRequest);
			
			Email email = mapToEntity(emailRequest);
			mailSender.send(emailSchema);
			
			email.setStatus("SUCESSO");
			email.setEnviadoEm(Util.getAtualData());
			emailRepository.save(email);
			
			
			log.info(EMAIL_ENVIADO_COM_SUCESSO);
			return EmailResponse.builder().status("sucesso").mensagem("Email enviado com sucesso").build();
			
		} catch (MailException | MessagingException e) {
			Email email = mapToEntity(emailRequest);
			email.setStatus("FALHA ");
			emailRepository.save(email);

			log.error(EMAIL_ENVIADO_FALHA);
			throw new EmailNaoEnviadoException(EMAIL_ENVIADO_FALHA);
		}
	}

	private MimeMessage buildEmail(EmailRequest emailRequest) throws MessagingException {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper emailSchema = new MimeMessageHelper(message, true);

		emailSchema.setFrom("noresponse@gmail.com");
		emailSchema.setTo(emailRequest.getEmailDestino());
		emailSchema.setSubject(emailRequest.getConteudo().getAssunto());
		emailSchema.setText(emailRequest.getConteudo().getMessagem());

		return message;
	}	
}
