package org.example.exercicio4;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("Geovane Paixão", "12345678952","12365478",
                Sexo.MASCULINO, 2000.0,"26/05/1985", "18/03/2026", "brn-3415" );
        Gerente gerente = new Gerente("Queila Leal", "23658974100", "65987412",
                Sexo.FEMININO, 3500.0, "03/07/1984", "18/03/2026",Bonificacao.GERENTE);
        Diretor diretor = new Diretor("Bruno Rosa", "04907436505", "1132518407",
                Sexo.MASCULINO, 6000.0, "12/09/1990","10/03/2026",Bonificacao.DIRETOR);

        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());
        System.out.println(diretor.toString());

        diretor.admitir(motoboy);
        diretor.admitir(gerente);

    }
}
