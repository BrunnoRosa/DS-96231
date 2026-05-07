package com.example.aula.service;

import com.example.aula.model.FuncionarioModel;
import com.example.aula.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List <FuncionarioModel> listarTodos () {
        return repository.findAll();

    }
    public FuncionarioModel salvarFuncionario (FuncionarioModel model) {
        if (repository.findByEmail(model.getEmail()).isPresent()){
            throw  new RuntimeException("Funcionário já cadastrado ✅");
        }
        return repository.save(model);
    }

    public FuncionarioModel atualizarFuncionario(Long id, FuncionarioModel model) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Funcionário não Encontrado ❌");
        }
        model.setId(id);
        return repository.save(model);
    }

    public void excluir(Long id) {
        if (!repository.existsById(id)) {
                throw new IllegalArgumentException("Funcionário não encontrdo. 🔎");
            }
            repository.deleteById(id);
        }

    }