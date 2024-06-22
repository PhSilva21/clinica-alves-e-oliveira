package com.bandeira.clinica_alves_oliveira.repositories;

import com.bandeira.clinica_alves_oliveira.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
