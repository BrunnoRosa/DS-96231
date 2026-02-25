package com.example.encapsulamento;

public class Pet {

    // ATRIBUTOS DA CLASSE
    private String nome;
    private int idade;
    private String raca;

    // MÉTODOS DE ACESSO (GETTERS E SETTERS)
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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
