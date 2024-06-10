package br.com.pv.server.email_sender.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {
	private Util() {}

	public static String getAtualData() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm dd/MM/yyyy"));
	}
}
