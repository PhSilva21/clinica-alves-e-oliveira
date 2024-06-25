package com.bandeira.clinica_alves_oliveira.dtos;

import com.bandeira.clinica_alves_oliveira.model.StatusBudget;

import java.time.LocalDate;

public record UpdateBudgetDTO(

         LocalDate dateRegister,

         StatusBudget statusBudget,

         String namePatient,

         String nameProfessional,

         String nameProcedure
) {
}
