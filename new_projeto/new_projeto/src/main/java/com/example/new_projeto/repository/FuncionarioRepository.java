package com.example.new_projeto.repository;

import com.example.new_projeto.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
    Optional <FuncionarioModel> findByEmail(String email);
}
