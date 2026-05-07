package com.example.api.controller;

import com.example.api.model.FornecedoresModel;
import com.example.api.repository.FornecedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")

public class FornecedoresController {
    @Autowired
    private FornecedoresRepository repository;

    @GetMapping
    public List<FornecedoresModel> listarFornecedores(){
        return  repository.findAll();
    }
    @PostMapping
    public ResponseEntity<FornecedoresModel> salvar(@RequestBody FornecedoresModel fornecedores){
        repository.save(fornecedores);
        return ResponseEntity.status(HttpStatus.CREATED).body(fornecedores);
    }
}
