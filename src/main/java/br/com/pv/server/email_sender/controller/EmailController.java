package br.com.pv.server.email_sender.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pv.server.email_sender.model.EmailRequest;
import br.com.pv.server.email_sender.model.EmailResponse;
import br.com.pv.server.email_sender.service.EmailService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/pvserver-email-sender")
@RequiredArgsConstructor
public class EmailController implements OpenApiController {

	private final EmailService emailService;

	@Override
	@PostMapping("/enviar-email")
	public ResponseEntity<EmailResponse> enviarEmail(@RequestBody @Valid EmailRequest emailRequest) {
		return ResponseEntity.ok().body(emailService.enviarEmail(emailRequest));
	}
	
}
