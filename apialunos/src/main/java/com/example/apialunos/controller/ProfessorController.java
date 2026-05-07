package com.example.apialunos.controller;

import com.example.apialunos.model.ProfessorModel;
import com.example.apialunos.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    @Autowired
    private ProfessorRepository repository;

    @GetMapping
    public List<ProfessorModel> listarProfessores (){
        return  repository.findAll();
    }

    @PostMapping
    public ResponseEntity<ProfessorModel> salvar (@RequestBody ProfessorModel model){
        repository.save(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(model);
    }

}
