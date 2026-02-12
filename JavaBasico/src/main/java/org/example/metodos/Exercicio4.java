package org.example.metodos;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {


        Scanner scanner  = new Scanner(System.in);

        System.out.println("Informe o nome do usuário: ");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Digite a senha do sistema: ");
        String senhaUsuario = scanner.nextLine();

        boolean resultadoNome  = nomeUsuario.equals("Bruno");
        boolean resultadoSenha = (senhaUsuario == "582");

        if (resultadoNome && resultadoSenha == true){
            System.out.println("Acesso Concedido!! Seja bem vindo!!");
        } else {
            System.out.println("Nome de usuário ou senha inválidos.");
        }

    }
}

