package com.example.encapsulamento;

public class Main {
    public static void main(String[] args) {

        // POO programação orientada objeto
        // Instanciar a classe
        Cliente cliente1 = new Cliente("Bruno", 35, "bruno@senai.com");

        // cliente1.setNome("Bruno");
        // cliente1.setIdade(35);
        // cliente1.setEmail("bruno@senai.com");
        
        System.out.println("---------------------------");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Email: " + cliente1.getEmail());

        Veiculo v1 = new Veiculo("NRB-0B15", "Cinza-Platina", 5, 
        60.0, 240, 7.5);

        System.out.println("Placa do Veículo: " + v1.getPlaca());
        System.out.println("Cor do Veículo: " + v1.getCor());
        System.out.println("Quantidade de passageiros: " + v1.getNumeroPassageiros());
        System.out.println("Capacidade do Tanque de combustível: " + v1.getCapacidadeTanque() + "Litros");
        System.out.println("Velocidade Máxima: " + v1.getVelocidadeMaxima()+ "Km/h");
        System.out.println("Consumo médio de combustível: " + v1.getConsumoMedio()+ "Km/L");


        Pet pet1 = new Pet("Mabru", 5, "Pitbull", "Médio-Grande", "Ração + Próteina");
        Pet pet2 = new Pet("Group", 10, "Pitbull + Labrador", "Médio/grande", "Ração/próteina");

        // pet1.setNome("Mabru");
        // pet1.setIdade(5);
        // pet1.setRaca("Pitbull");

        System.out.println("---------------------------");
        System.out.println("Nome: " + pet1.getNome());
        System.out.println("Idade: " + pet1.getIdade());
        System.out.println("Raça: " + pet1.getRaca());
        System.out.println("Porte: "+ pet1.getPorte());
        System.out.println("Alimentação: " + pet1.getAlimentacao());
        System.out.println("---------------------------");
        System.out.println("Nome: " + pet2.getNome());
        System.out.println("Idade: " + pet2.getIdade());
        System.out.println("Raça: " + pet2.getRaca());
        System.out.println("Porte: "+ pet2.getPorte());
        System.out.println("Alimentação: " + pet2.getAlimentacao());

    Livro livro1 = new Livro("O preço do amanhã", "Jeff Booth", "9786583143075", 196, 39.99);

        // livro1.setNome("O preço do amanhã");
        // livro1.setPreco(39.99);
        // livro1.setAutor("Não sei...");

        System.out.println("---------------------------");
        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("ISBN: " + livro1.getIsbn());
        System.out.println("Número de páginas: " + livro1.getNumeroPaginas() );
        System.out.println("Preço: " + livro1.getPreco());

        
        Funcionario f1 = new Funcionario("Bruno Rosa", "Presidente", 10000.00f);


        // f1.setNome("Bruno Rosa");
        // f1.setCargo("Presidente"); 
        // f1.setSalario(10.000f);

        System.out.println("---------------------------------");
        System.out.println("Nome Funcionário: " + f1.getNome());
        System.out.println("Cargo Funcionário: " + f1.getCargo());
        System.out.println("Sálario Semanal: " + f1.getSalario() + " K");

        Aluno aluno1 = new Aluno("Alvaro Coelho", "a.coelho@gmail.com", 27);

        System.out.println("---------------------------------");
        System.out.println("Aluno de DS: " + aluno1.getNome());
        System.out.println("Email: " + aluno1.getEmail());
        System.out.println("Idade: " + aluno1.getIdade());


    }
}
