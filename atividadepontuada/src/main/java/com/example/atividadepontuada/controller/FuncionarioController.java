package com.example.atividadepontuada.controller;

import com.example.atividadepontuada.model.FuncionarioModel;
import com.example.atividadepontuada.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @GetMapping
    public List<FuncionarioModel> listar (){
        return service.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<Object, String>> salvar (@RequestBody FuncionarioModel model){
        service.salvarFuncionario(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Mensagem", "Funcionário cadastrado com sucesso. ✅"));
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar (@PathVariable Long id, @RequestBody FuncionarioModel model){
        service.atualizarFuncionario(id, model);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Funcionário atualizado com sucesso! ✅"));
    }
    @DeleteMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> excluir (@PathVariable Long id){
        service.excluir(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem","Funcionário excluído com sucesso! ✅" ));
    }
}
