package com.bandeira.clinica_alves_oliveira.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "patients")
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String cpf;

    private String rg;

    private LocalDate dateOfBirth;

    private String cep;

    private String state;

    private String city;

    private String street;

    private String number;

    private String neighborhood;

    private String complement;

    private String email;

    private Integer cel;

    private Integer tel;

    private String responsible;

    private String cpfOfResposible;

    private Double outstandingBalance;

    private Double valueUsed;

    private Double amountReceived;

    public Patient(String name, String cpf, String rg, LocalDate dateOfBirth, String cep, String state,
                   String city, String street, String number, String neighborhood, String complement,
                   String email, Integer cel, Integer tel, String responsible, String cpfOfResposible) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.dateOfBirth = dateOfBirth;
        this.cep = cep;
        this.state = state;
        this.city = city;
        this.street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.complement = complement;
        this.email = email;
        this.cel = cel;
        this.tel = tel;
        this.responsible = responsible;
        this.cpfOfResposible = cpfOfResposible;
    }

}
