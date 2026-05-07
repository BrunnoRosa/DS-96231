package com.example.atividadepontuada.controller;


import com.example.atividadepontuada.model.EntregadorModel;
import com.example.atividadepontuada.service.EntregadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/entregadores")
public class EntregadorController {

    @Autowired
    private EntregadorService service;

    @GetMapping
    public List<EntregadorModel> listar (){
        return service.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<Object, String>> salvar (@RequestBody EntregadorModel model){
        service.salvarEntregador(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Mensagem", "Entregador cadastrado com sucesso. ✅"));
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar (@PathVariable Long id, @RequestBody EntregadorModel model){
        service.atualizarEntregador(id, model);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Entregador atualizado com sucesso! ✅"));
    }
    @DeleteMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> excluir (@PathVariable Long id){
        service.excluir(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem","Entregador excluído com sucesso! ✅" ));
    }
}
