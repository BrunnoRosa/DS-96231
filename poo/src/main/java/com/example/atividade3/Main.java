package com.example.atividade3;

public class Main {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario("001", "Bruno Rosa", "Rua Matias de Albuquerque",
                "71992613761", "bruno@gmail.com",new ContaBancaria("Nubank", "9696-1",
                "1332563-5", "Conta-corrente", 10000, "100.000,00"));

        System.out.println("Funcionário: "+ func1.getNome() + " com o saldo em conta de R$ "
                + func1.getContaBanco().getSaldoAtual() + " Limite para Empréstimo " + func1.getContaBanco().getLimiteDisponivel());
    }
}
