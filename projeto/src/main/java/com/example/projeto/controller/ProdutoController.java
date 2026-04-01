package com.example.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto.model.ProdutoModel;
import com.example.projeto.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final ClienteController clienteController;
    @Autowired
    private ProdutoRepository repository;

    ProdutoController(ClienteController clienteController) {
        this.clienteController = clienteController;
    }

    @GetMapping
    public List<ProdutoModel> listarTodos(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<ProdutoModel> salvar (@RequestBody ProdutoModel produto){
        repository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }

}
