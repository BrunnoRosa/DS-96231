package org.example.sobrecargademetodos;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Métodos com mesmo nome, mas com assinaturas diferentes.

        System.out.println(calc.calcular(2,2));
        System.out.println(calc.calcular(2,2));
        System.out.println(calc.calcular("calc","ular"));
    }
}
