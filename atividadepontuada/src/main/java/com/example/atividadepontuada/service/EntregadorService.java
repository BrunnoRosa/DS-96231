package com.example.atividadepontuada.service;


import com.example.atividadepontuada.model.EntregadorModel;
import com.example.atividadepontuada.model.FuncionarioModel;
import com.example.atividadepontuada.repository.EntregadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregadorService {
    @Autowired
    private EntregadorRepository repository;

    public List<EntregadorModel> listarTodos (){
        return repository.findAll();
    }

    public EntregadorModel salvarEntregador (EntregadorModel model){
        if (repository.findByEmail(model.getEmail()).isPresent()){
            throw new IllegalArgumentException("Entregador já cadastrado.❌");
        }
        return repository.save(model);
    }

    public EntregadorModel atualizarEntregador (Long id, EntregadorModel model){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Entregador não Encontrado ❌");
        }
        model.setId(id);
        return repository.save(model);
    }

    public void excluir (Long id){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Entregador não encontrdo. 🔎");
        }
        repository.deleteById(id);
    }
}
