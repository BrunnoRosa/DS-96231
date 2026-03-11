package org.example.atividade3;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua Matias de Alburquerque", "153", "1 andar", "40450105", "Salvador");
        Engenheiro engenheiro1 = new Engenheiro("Bruno Rosa", "bruo@gmail.com",
                10000,endereco1,"BR1209");
        Medico medico1 = new Medico("Giovane Paixão", "geovane@gmail.com",
                20000, new Endereco("Rua não sei",
                "41", "Casa", "40450000",
                "Salvador"), "GP2605");

        System.out.println(engenheiro1.toString());
        System.out.println(medico1.toString());

    }
}
