package com.example.revisao;

public class Professor {

    // Atributos

    private String nome;
    private String disciplina;

    // Construtor


    public Professor(String disciplina, String nome) {
        this.disciplina = disciplina;
        this.nome = nome;
    }

    // Métodos de acesso


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
