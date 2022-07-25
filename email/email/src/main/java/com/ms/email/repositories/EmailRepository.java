package com.ms.email.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

	Optional<EmailModel> findById(UUID emailId);
}
