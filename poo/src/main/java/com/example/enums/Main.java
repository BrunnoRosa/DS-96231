package com.example.enums;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Bruno Rosa", Pedido.ABERTO);
;
       //System.out.println("Nome do cliente: " + cliente1.getNome());
        // System.out.println("Status do pedido: " + cliente1.getPedido());
        System.out.println(cliente1.toString());
    }
}
