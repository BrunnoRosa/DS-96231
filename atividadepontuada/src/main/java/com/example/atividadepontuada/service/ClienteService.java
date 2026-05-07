package com.example.atividadepontuada.service;


import com.example.atividadepontuada.model.ClienteModel;
import com.example.atividadepontuada.model.FuncionarioModel;
import com.example.atividadepontuada.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<ClienteModel> listarTodos (){
        return  repository.findAll();
    }

    public  ClienteModel salvarCliente (ClienteModel model) {
        if (repository.findByEmail(model.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Cliente já cadastrado.❌");
        }
        return repository.save(model);
    }

    public ClienteModel atualizarCliente (Long id, ClienteModel model){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Cliente não Encontrado ❌");
        }
        model.setId(id);
        return repository.save(model);
    }

    public void excluir (Long id){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Cliente não encontrdo. 🔎");
        }
        repository.deleteById(id);
    }
}
