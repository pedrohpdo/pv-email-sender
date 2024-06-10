package br.com.pv.server.email_sender.model;

import static br.com.pv.server.email_sender.constantes.Constantes.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Jacksonized
@Builder
public class EmailRequest {

  @NotBlank(message = CAMPO_ORIGEM_OBRIGATORIO)
  @JsonProperty("origem")
  String origem;
  
  @NotBlank(message = CAMPO_EMAIL_DESTINO_OBRIGATORIO)
  @JsonProperty("email-destino")
  String emailDestino;

  @Valid
  @JsonProperty("conteudo")
  ConteudoEmail conteudo;
  
  @Value
  @Jacksonized
  @Builder
  public static class ConteudoEmail {
    @NotBlank(message = CAMPO_ASSUNTO_OBRIGATORIO)
    @JsonProperty("assunto")
    String assunto;
    
    @NotBlank(message = CAMPO_MESSAGEM_OBRIGATORIO)
    @JsonProperty("mensagem")
    String messagem;
  }
}
