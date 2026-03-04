package com.example.atividade1;

public class Main {
    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("Rua Não sei..", "153", "Salvador");
        Cliente c1 = new Cliente("Bruno Rosa", 35,endereco1 );

        System.out.println("Nome do cliente: " + c1.getNome());
        System.out.println("Endereço do cliente: " + c1.getEndereco().getCidade());
    }
}
