package br.com.pv.server.email_sender.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pv.server.email_sender.model.Email;

public interface EmailRepository extends JpaRepository<Email, Integer> {
}
