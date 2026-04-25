package com.example.atividadepontuada.repository;

import com.example.atividadepontuada.model.EntregadorModel;
import org.aspectj.apache.bcel.classfile.EnclosingMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EntregadorRepository extends JpaRepository<EntregadorModel, Long> {
    Optional<EntregadorModel> findByEmail(String email);
}
