package org.example.exercicio3;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("Geovane Paixão", "12365478952", "26/05/1985", 1500.0, "ouy-3145");
        Gerente gerente = new Gerente("Bruno Rosa", "04521463598", "12/09/1990", 2500.0,Bonificacao.GERENTE);

        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());

        gerente.admitir(motoboy);
        gerente.demitir(motoboy);
    }
}
