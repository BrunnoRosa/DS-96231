package com.example.atividadeEnum;

public class Main {
    public static void main(String[] args) {
      Funcionario funcionario1 = new Funcionario("001", "Bruno Rosa",
              10000, Setor.MARKETING, Sexo.MASCULINO, 35);
      Funcionario funcionario2 = new Funcionario("002", "Queila Leal",
              5000, Setor.RECURSOS_HUMANOS, Sexo.FEMININO, 38);
      Funcionario funcionario3 = new Funcionario("003", "Geovane Paixão",
              9000, Setor.FINANCEIRO, Sexo.MASCULINO, 40);
      Funcionario funcionario4 = new Funcionario("004", "Álvaro Coelho",
              20000, Setor.PRESIDENTE, Sexo.MASCULINO,28);

        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
        System.out.println(funcionario3.toString());
        System.out.println(funcionario4.toString());
    }

}
