package org.example.tipagem;

public class Main {
    public static void main(String[] args) {
        //Declaração de variaveis

        String nome = "Bruno";
        int idade = 35;
        double peso = 77;
        double altura = 1.82;

        // Declaração de constantes
        final String CPF = "000.000.00-00";

        // exibindo resultado
        // Concatenando com o sinal de "+"
        System.out.println("O nome do usuário é: " + nome);
        System.out.println("O CPF do Usuário é:" + CPF);
        System.out.println("A idade do usuário é:  " + idade +" anos ");
        System.out.println("O peso do usuário é: " + peso+ "Kg");
        System.out.println("A altura do usuário é: " + altura + " m");
    }
}