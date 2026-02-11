package org.example.atividade3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.print("Informe o nome do Aluno: ");
        String nome = ler.nextLine();



        double [] notas = new double[2];
        int soma = 0;
        for (int i = 0; i < 2; i++) {
            do {
                System.out.println("Digite a " + (i + 1) + "°" + " nota:");
                notas[i] = ler.nextDouble();

                if (notas[i] < 0 || notas[i] >10);{
                    System.out.println("\n A nota deve ser entre 0 e 10");
                }
            }while(notas[i] < 0 || notas[i] >10);



             {
                 soma += notas[i];
            }
        }

        double media = soma / notas.length;
        System.out.println("Nome do aluno: " + nome);
        System.out.println("\nExibindo as notas: ");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }
        System.out.println("A média arimética: " + media);
        ler.close();
    }
}
