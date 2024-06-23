package com.bandeira.clinica_alves_oliveira.dtos;

import com.bandeira.clinica_alves_oliveira.model.UserRole;

public record RegisterDTO(

        String username,

        String password,

        UserRole role) {
}
