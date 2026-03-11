package org.example.exemplo1;

import org.example.exemplo2.Cliente;
import org.example.exemplo2.Funcionario;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Bruno Rosa", 35, "10/03/2026", "Crédito");
        Funcionario func1 = new Funcionario("Bruno Rosa", 35, "23125", "Supervisor", 10000);

        System.out.println(cliente1.toString());
        System.out.println(func1.toString());


    }
}