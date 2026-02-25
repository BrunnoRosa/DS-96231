package com.example.encapsulamento;

public class Funcionario {

    // ATRIBUTOS DA CLASSE
    private String nome;
    private String cargo;
    private float salario;

    // MÉTODOS DE ACESSO (GETTERS E SETTERS)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
