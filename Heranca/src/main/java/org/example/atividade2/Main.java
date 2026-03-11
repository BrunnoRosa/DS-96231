package org.example.atividade2;

public class Main {
    public static void main(String[] args) {
        Fisica pessoaFisica1 = new Fisica("Bruno Rosa", "71 992613761", "00000000-00", "000000-00", "12/09/1990");
        Juridica pessoaJuridica1 = new Juridica("geovane Paixão", "71 99665544", "00000000-00", "1250254.265");

        System.out.println(pessoaFisica1.toString());
        System.out.println(pessoaJuridica1.toString());
    }
}
