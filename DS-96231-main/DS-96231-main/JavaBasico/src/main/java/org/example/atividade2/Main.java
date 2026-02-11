package org.example.atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a primeira nota: ");
        int n1 = scanner.nextInt();

        System.out.print("Informe a segunda nota: ");
        int n2 = scanner.nextInt();

        int mediaAluno = (n1 + n2) / 2;

        if (mediaAluno >= 7){
            System.out.println (" Aluno(a) " + nome + " APROVADO com nota: " + mediaAluno);
        } else {
            System.out.println(nome + "Aluno(a) " + nome +" REPROVADO com nota: " + mediaAluno );
        }



    }
}
