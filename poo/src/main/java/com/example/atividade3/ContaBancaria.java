package com.example.atividade3;

public class ContaBancaria {
    private String Banco;
    private String agencia;
    private String numConta;
    private String tipoConta;
    private double saldoAtual;
    private String limiteDisponivel;

    public ContaBancaria(String banco, String agencia, String numConta, String tipoConta, double saldoAtual, String limiteDisponivel) {
        Banco = banco;
        this.agencia = agencia;
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String banco) {
        Banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public String getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(String limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }
}
