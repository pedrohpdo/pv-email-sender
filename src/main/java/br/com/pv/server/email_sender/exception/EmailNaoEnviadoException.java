package br.com.pv.server.email_sender.exception;

public class EmailNaoEnviadoException extends RuntimeException {

	public EmailNaoEnviadoException(String message) {
		super(message);
	}
	
}
