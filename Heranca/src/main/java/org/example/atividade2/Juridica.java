package org.example.atividade2;

public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricaoestadual;

    public Juridica(String nome, String telefone, String cnpj, String inscricaoestadual) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoestadual = inscricaoestadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoestadual() {
        return inscricaoestadual;
    }

    public void setInscricaoestadual(String inscricaoestadual) {
        this.inscricaoestadual = inscricaoestadual;
    }

    @Override
    public String toString() {
        return "Juridica{" +
                "cnpj='" + cnpj + '\'' +
                ", inscricaoestadual='" + inscricaoestadual + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
