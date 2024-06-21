package com.bandeira.clinica_alves_oliveira.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "queries")
@Table(name = "queries")
public class Query {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String namePatient;

    private String nameProfessional;

    private LocalDateTime time;

    private Integer duration;

    private StatusQuery statusQuery;

    private Integer patientCel;
}
