package org.example.exercicio2;

public class Main {
    public static void main(String[] args) {

        Motoboy motoboy1 = new Motoboy("Geovane Paxão", "26/05/1985",Sexo.MASCULINO, Setor.OPERACOES, 5000, "1236547852");
        Diretor diretor1 = new Diretor("Bruno Rosa",
                "12/09/1990", Sexo.MASCULINO, Setor.FINANCEIRO, 10000);

        System.out.println(diretor1.toString());
        System.out.println(motoboy1.toString());

        diretor1.admitir(motoboy1);
        diretor1.demitir(diretor1);
    }
}