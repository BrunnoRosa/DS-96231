package com.example.relacionamento;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1, "Bruno rosa", 35, "71 992613761",
                "bruno@gmail.com", Sexo.MASCULINO,new Endereco("Rua Matias de alburquerque", "153",
                "1 Andar", "40450105", "Salvador",UnidadeFederativa.BAHIA));
        Pessoa pessoa2 = new Pessoa(2, "Geovane Paixão", 40, "71 92256358",
                "geovane@gmail.com", Sexo.MASCULINO,new Endereco("Rua não sei o que", "225",
                "Térreo", "40450000", "Salvador",UnidadeFederativa.BAHIA));



        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
    }
}
