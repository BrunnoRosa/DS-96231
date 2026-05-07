package com.example.atividadepontuada.service;


import com.example.atividadepontuada.model.ProdutoModel;
import com.example.atividadepontuada.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<ProdutoModel> listarTodos(){
        return repository.findAll();
    }

    public ProdutoModel salvarProduto (ProdutoModel model){
        if (repository.findByLote(model.getLote()).isPresent()){
            throw new RuntimeException ("Produto já cadastrado ❌");
        }
        return repository.save(model);
    }

    public ProdutoModel atualizarProduto(Long id, ProdutoModel model) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Produto não Encontrado ❌");
        }
        model.setId(id);
        return repository.save(model);
    }

    public void excluir (Long id) {
      if (!repository.existsById(id)){
          throw new IllegalArgumentException("Produto não encontrado. 🔎");
      }
      repository.deleteById(id);
    }
}
