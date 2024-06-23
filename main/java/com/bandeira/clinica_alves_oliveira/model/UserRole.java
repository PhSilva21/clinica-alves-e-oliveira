package com.bandeira.clinica_alves_oliveira.model;

import lombok.Getter;

@Getter
public enum UserRole {

    ADMIN("user"),

    USER("user");

    private String role;

    UserRole(String role) {
        this.role = role;
    }
}
