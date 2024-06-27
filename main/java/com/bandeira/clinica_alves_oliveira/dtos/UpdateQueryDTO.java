package com.bandeira.clinica_alves_oliveira.dtos;

import com.bandeira.clinica_alves_oliveira.model.StatusQuery;

import java.time.LocalDateTime;

public record UpdateQueryDTO(

         String namePatient,

         String nameProfessional,

         LocalDateTime time,

         Integer duration,

         StatusQuery statusQuery) {
}
