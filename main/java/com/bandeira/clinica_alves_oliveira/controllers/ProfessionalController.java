package com.bandeira.clinica_alves_oliveira.controllers;

import com.bandeira.clinica_alves_oliveira.dtos.ProfessionalRequest;
import com.bandeira.clinica_alves_oliveira.dtos.UpdateProfessionalDTO;
import com.bandeira.clinica_alves_oliveira.model.Professional;
import com.bandeira.clinica_alves_oliveira.model.Query;
import com.bandeira.clinica_alves_oliveira.services.ProfessionalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("professional")
public class ProfessionalController {

    @Autowired
    private ProfessionalService professionalService;

    @PostMapping("/create")
    public ResponseEntity<ProfessionalRequest> createProfessional(@RequestBody @Valid ProfessionalRequest
                                                                professionalRequest) throws IOException {
        var response = professionalService.createProfessional(professionalRequest);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/findByQueries")
    public ResponseEntity<List<Query>> findByQueriesByProfessional(@RequestParam @Param("nameProfessional")
                                                             String nameProfessional){
        var response = professionalService.queryLIst(nameProfessional);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Professional>> findAll(){
        var response = professionalService.findAll();
        return  ResponseEntity.ok().body(response);
    }

    @PutMapping("/update")
    public ResponseEntity<Void> updateById(@PathVariable Long id,
                                           UpdateProfessionalDTO updateProfessionalDTO) throws IOException {
        professionalService.update(id, updateProfessionalDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        professionalService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
