package org.example.metodos;

import java.util.Scanner;

public class ExercicioAtualizado {
    public static void main(String[] args) {


        Scanner scanner  = new Scanner(System.in);
        String loginSalvo= "Bruno";
        String senhaSalva = "Br123";
        String login;
        String senha;


    do {
        System.out.println("Informe o nome do usuário: ");
        login = scanner.nextLine();

        System.out.println("Digite a senha do sistema: ");
        senha = scanner.nextLine();


        if (login.equals(loginSalvo) && senha.equals(senhaSalva)) {
            System.out.println("Acesso Concedido!! Seja bem vindo!!");
        }else {
            System.out.println("Nome de usuário ou senha inválidos.");
        }
    } while (!login.equals(loginSalvo) || !senha.equals(senhaSalva));
    }
}

