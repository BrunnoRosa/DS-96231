package com.example.atividadepontuada.controller;

import com.example.atividadepontuada.model.ProdutoModel;
import com.example.atividadepontuada.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<ProdutoModel> listar (){
        return service.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<Object, String>> salvar (@RequestBody ProdutoModel model){
        service.salvarProduto(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("Mensagem", "Produto cadastrado com sucesso. ✅"));
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar (@PathVariable Long id, @RequestBody ProdutoModel model){
        service.atualizarProduto(id, model);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem", "Produto atualizado com sucesso! ✅"));
    }
    @DeleteMapping ("/{id}")
    public ResponseEntity<Map<String, Object>> excluir (@PathVariable Long id){
        service.excluir(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Mensagem","Produto excluído com sucesso! ✅" ));
    }
}
