package com.example.atividadepontuada.controller;


import com.example.atividadepontuada.model.ClienteModel;
import com.example.atividadepontuada.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public List<ClienteModel> listar (){
        return service.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<Object, String>> salvar (@RequestBody ClienteModel model){
        service.salvarCliente(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Mensagem", "Cliente cadastrado com sucesso. ✅"));
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar (@PathVariable Long id, @RequestBody ClienteModel model){
        service.atualizarCliente(id, model);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Cliente atualizado com sucesso! ✅"));
    }
    @DeleteMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> excluir (@PathVariable Long id){
        service.excluir(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem","Cliente excluído com sucesso! ✅" ));
    }
}
