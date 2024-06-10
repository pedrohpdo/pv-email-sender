package br.com.pv.server.email_sender.constantes;

public class Constantes {
	private Constantes(){}

	public static final String EMAIL_ENVIADO_COM_SUCESSO = "Notificação enviada com sucesso.";
	public static final String EMAIL_ENVIADO_FALHA = "Houve algum problema com o envio do email. Tente novamente.";

	// Constantes para validação de EmailRequest
	public static final String CAMPO_ORIGEM_OBRIGATORIO = "Campo ORIGEM obrigatório";
	public static final String CAMPO_EMAIL_DESTINO_OBRIGATORIO = "Campo EMAIL-DESTINO obrigatório";
	public static final String CAMPO_ASSUNTO_OBRIGATORIO = "Campo ASSUNTO obrigatório";
	public static final String CAMPO_MESSAGEM_OBRIGATORIO = "Campo MENSAGEM obrigatório";
}

