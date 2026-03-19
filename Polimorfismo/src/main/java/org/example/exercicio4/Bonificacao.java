package org.example.exercicio4;

public enum Bonificacao {
    GERENTE(1.2),
    DIRETOR (1.4);

    protected double valorBonificado;

    Bonificacao(double valor) {
        this.valorBonificado = valor;
    }

    public double getValor() {
        return valorBonificado;
    }

}
