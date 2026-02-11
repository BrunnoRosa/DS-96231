package org.example.lacorepeticao;

import java.util.Scanner;


public class While {
    public static void main(String[] args) {

        Scanner ler  = new Scanner (System.in);

        System.out.print("Digite sua idade: ");
        int idade  = ler.nextInt();

        while(idade<18){
            System.out.println("Acesso Negado.");
            System.out.println("Confirme a sua idade:");
            idade = ler.nextInt();

        }
        System.out.println("Acesso Permitido.");
        System.out.println("Carregando...");
    }
}
