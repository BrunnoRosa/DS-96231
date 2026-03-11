package org.example.atividade2;

public class Fisica extends Pessoa{
    private String cpf;
    private String rg;
    private String dataNascimento;

    public Fisica(String nome, String telefone, String cpf, String rg, String dataNascimento) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Fisica{" +
                "cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
