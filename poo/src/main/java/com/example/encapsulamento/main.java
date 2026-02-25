package com.example.encapsulamento;

public class main {
    public static void main(String[] args) {

        // POO programação orientada objeto
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Bruno");
        cliente1.setIdade(35);
        cliente1.setEmail("bruno@senai.com");
        
        System.out.println("---------------------------");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Email: " + cliente1.getEmail());

        Pet pet1 = new Pet();
        pet1.setNome("Mabru");
        pet1.setIdade(5);
        pet1.setRaca("Pitbull");

        System.out.println("---------------------------");
        System.out.println("Nome: " + pet1.getNome());
        System.out.println("Idade: " + pet1.getIdade());
        System.out.println("Raça: " + pet1.getRaca());

        Livro livro1 = new Livro();
        livro1.setNome("O preço do amanhã");
        livro1.setPreco(39.99);
        livro1.setAutor("Não sei...");

        System.out.println("---------------------------");
        System.out.println("Nome: " + livro1.getNome());
        System.out.println("Preço: " + livro1.getPreco());
        System.out.println("Autor: " + livro1.getAutor());

        
        Funcionario f1 = new Funcionario();
        f1.setNome("Bruno Rosa");
        f1.setCargo("Presidente");
        f1.setSalario(10.000f);

        System.out.println("---------------------------------");
        System.out.println("Nome Funcionário: " + f1.getNome());
        System.out.println("Cargo Funcionário: " + f1.getCargo());
        System.out.println("Sálario Semanal: " + f1.getSalario() + " K");




    }
}
