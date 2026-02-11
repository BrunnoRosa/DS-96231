package org.example.atividade01;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner brs  = new Scanner (System.in);

        System.out.print("Informe o Valor da compra:  ");
        double valorTotal = brs.nextDouble();

        double valorPrestacao = valorTotal / 5;

        System.out.println("LOJA MAMÃO COM AÇUCAR\n");
        System.out.println("Valor total da compra: R$" + valorTotal);
        System.out.println("Valor das prestações: R$" + valorPrestacao);




    }
}
