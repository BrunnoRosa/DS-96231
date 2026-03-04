package com.example.revisao;

public class Main {
    public static void main(String[] args) {

        // Instanciar a classe professor.

        Professor p1 = new Professor("Desenvolvimento de Sistemas", "Carlos Anderson");

        System.out.println("Nome do professor: " + p1.getNome());
        System.out.println("Disciplina: " + p1.getDisciplina());

        Professor p2 = new Professor("Lógica", "Washigton");

        System.out.println("Nome do Professor: " + p2.getNome());
        System.out.println("Disciplina: " + p2.getDisciplina());



    }
}
