package com.example.new_projeto.service;

import com.example.new_projeto.dto.FuncionarioRequestDTO;
import com.example.new_projeto.dto.FuncionarioResponseDTO;
import com.example.new_projeto.model.FuncionarioModel;
import com.example.new_projeto.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioResponseDTO> listarTodos(){
        return repository.findAll().stream()
                .map(funcionario  -> new FuncionarioResponseDTO(funcionario
                .getNome(), funcionario.getEmail(), funcionario
                .getTelefone())).toList();
    }
    public FuncionarioModel salvarFuncionario (FuncionarioRequestDTO funcionarioDTO){
        if (repository.findByEmail(funcionarioDTO.getEmail()).isPresent()){
            throw new RuntimeException("Funcionário já cadastrado. ⚠️");
        }

        FuncionarioModel novoFuncionario = new FuncionarioModel();
        novoFuncionario.setNome(funcionarioDTO.getNome());
        novoFuncionario.setEmail(funcionarioDTO.getEmail());
        novoFuncionario.setTelefone(funcionarioDTO.getTelefone());
        novoFuncionario.setSenha(passwordEncoder.encode(funcionarioDTO.getSenha()));

        return repository.save(novoFuncionario);
    }
}
