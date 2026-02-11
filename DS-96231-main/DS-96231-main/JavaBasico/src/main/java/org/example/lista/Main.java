package org.example.lista;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner (System.in);
        ArrayList<Double> notas  = new ArrayList<>();
        String resposta;
        do {
            System.out.println("Digite uma nota: ");
            notas.add (ler.nextDouble());
            System.out.println("\n Deseja inserir mais uma nota? ");
            System.out.println("\n Pressione a tecla N para sair.");
            resposta = ler.next();
        } while (!resposta.equalsIgnoreCase("n"));

        System.out.println("\n Exibindo as notas: ");
        for (double nota: notas) {
            System.out.println("Nota: " + nota);
        }


        }
    }

