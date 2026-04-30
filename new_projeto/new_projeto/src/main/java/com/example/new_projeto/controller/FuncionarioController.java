package com.example.new_projeto.controller;

import com.example.new_projeto.dto.FuncionarioRequestDTO;
import com.example.new_projeto.dto.FuncionarioResponseDTO;
import com.example.new_projeto.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @GetMapping
    public ResponseEntity<List<FuncionarioResponseDTO>> listar(){
        return ResponseEntity.status(HttpStatus.OK).body(service.listarTodos());
    }
    @GetMapping
    public ResponseEntity<Map<String, Object>> salvar (@Valid @RequestBody FuncionarioRequestDTO funcionarioDTO){
        service.salvarFuncionario(funcionarioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Mensagem", "Funcionário cadastrado com sucesso. ✅"));
    }
}
