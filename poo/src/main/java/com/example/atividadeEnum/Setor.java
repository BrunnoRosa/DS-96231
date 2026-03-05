package com.example.atividadeEnum;

public enum Setor {
    FINANCEIRO ("Financeiro"),
    RECURSOS_HUMANOS ("Recursos Humanos"),
    VENDAS ("Vendas"),
    MARKETING ("Marketing"),
    PRESIDENTE ("Presidente");

    private String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
