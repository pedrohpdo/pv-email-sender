package br.com.pv.server.email_sender.mapper;

import br.com.pv.server.email_sender.model.Email;
import br.com.pv.server.email_sender.model.EmailRequest;

public class EmailMapper {
	private EmailMapper() {
	}

	public static Email mapToEntity(EmailRequest emailRequest) {
		return Email.builder()
			.destino(emailRequest.getEmailDestino())
			.assunto(emailRequest.getConteudo().getAssunto())
		.build();
	}

}
