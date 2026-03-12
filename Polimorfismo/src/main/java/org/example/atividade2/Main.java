package org.example.atividade2;

public class Main {
    public static void main(String[] args) {

        Soma soma1 = new Soma();
        Subtracao sub1 = new Subtracao();
        Divisao div1 = new Divisao();
        Multiplicacao mult1 = new Multiplicacao();

        System.out.println("Soma: " + soma1.calcular(6, 6));
        System.out.println("Subtração: " + sub1.calcular(10,5));
        System.out.println("Divisão: " + div1.calcular(10,5));
        System.out.println("Multiplicação: " + mult1.calcular(10,2));
    }
}
