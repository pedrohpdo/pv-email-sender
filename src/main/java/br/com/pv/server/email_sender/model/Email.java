package br.com.pv.server.email_sender.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;
import lombok.experimental.FieldDefaults;
import lombok.extern.jackson.Jacksonized;

@Value
@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Jacksonized
@Builder
@Entity
@Table(name = "emails")
public class Email {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Column(name = "destino", nullable = false)
	String destino;

	@Column(name = "assunto", nullable = false)
	String assunto;

	@Column(name = "status", nullable = true)
	String status;

	@Column(name = "criadoEm", nullable = false)
	final String criadoEm = LocalDateTime.now().toString();

	@Column(name = "enviadoEm", nullable = true)
	String enviadoEm;
}
