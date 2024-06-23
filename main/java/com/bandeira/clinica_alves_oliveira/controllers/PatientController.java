package com.bandeira.clinica_alves_oliveira.controllers;

import com.bandeira.clinica_alves_oliveira.dtos.PatientRequest;
import com.bandeira.clinica_alves_oliveira.dtos.UpdatePatientDTO;
import com.bandeira.clinica_alves_oliveira.model.Patient;
import com.bandeira.clinica_alves_oliveira.services.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/create")
    public ResponseEntity<PatientRequest> create(@RequestBody @Valid PatientRequest patientRequest) throws IOException {
        var response = patientService.createPatient(patientRequest);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/findAll")
    public List<Patient> findAll(){
        return patientService.findAll();
    }

    @GetMapping("/birthDays")
    public List<Patient> ani(){
        return patientService.birthDays();
    }

    @PostMapping("/{id}")
    public ResponseEntity<Void> updatePatient(@PathVariable ("id") Long id,
                                                   @RequestBody UpdatePatientDTO updatePatientDTO) throws IOException {
        patientService.update(id, updatePatientDTO);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable ("id") Long id){
        patientService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("{nome}")
    public ResponseEntity<Patient>finByNome(@PathVariable ("name") String name){
        var response = patientService.findByName(name);
        return ResponseEntity.ok().body(response);
    }

}

