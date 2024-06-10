package br.com.pv.server.email_sender.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class EmailResponse {
	@JsonProperty("status")
	String status;

	@JsonProperty("mensagem")
	String mensagem;
}
