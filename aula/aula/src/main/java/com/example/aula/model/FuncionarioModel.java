package com.example.aula.model;

import com.example.aula.model.enums.Setor;
import com.example.aula.model.enums.Sexo;
import jakarta.persistence.*;

@Entity
@Table(name="tab_funcionarios")
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int idade;
    private double salario;

    @Enumerated(EnumType.STRING)
    private Setor setor;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    private String email;

    public FuncionarioModel() {
    }

    public FuncionarioModel(Long id, String nome, int idade, double salario, Setor setor, Sexo sexo, String email) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
