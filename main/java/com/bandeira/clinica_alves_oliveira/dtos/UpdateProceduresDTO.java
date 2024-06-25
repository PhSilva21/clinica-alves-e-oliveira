package com.bandeira.clinica_alves_oliveira.dtos;

import com.bandeira.clinica_alves_oliveira.model.Specialty;

public record UpdateProceduresDTO(

        String description,

        Specialty specialty,

        Double value) {
}
