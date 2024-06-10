package br.com.pv.server.email_sender.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.pv.server.email_sender.model.EmailRequest;
import br.com.pv.server.email_sender.model.EmailResponse;
import io.swagger.v3.oas.annotations.Operation;

public interface OpenApiController {

	@Operation(summary = "Enviar Email")
	public ResponseEntity<EmailResponse> enviarEmail(@RequestBody EmailRequest emailRequest);
}
