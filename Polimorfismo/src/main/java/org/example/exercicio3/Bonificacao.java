package org.example.exercicio3;

public enum Bonificacao {
    GERENTE(1.3),
    DIRETOR (1.4);

    private double valorBonificado;

    Bonificacao(double valor) {
        this.valorBonificado = valor;
    }

    public double getValor() {
        return valorBonificado;
    }

}
