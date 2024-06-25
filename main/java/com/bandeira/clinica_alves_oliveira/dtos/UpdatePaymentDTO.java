package com.bandeira.clinica_alves_oliveira.dtos;

import com.bandeira.clinica_alves_oliveira.model.FormOfPayment;

import java.time.LocalDateTime;

public record UpdatePaymentDTO(

         Double value,

         String namePatient,

         LocalDateTime dateRegister,

         FormOfPayment formOfPayment,

         String nameProfessional
    ) {
}
