package com.example.aula.model.enums;

public enum Setor {
    FINANCEIRO("Financeiro"),
    RECURSOSHUMANOS ("Recursos Humanos"),
    VENDAS ("Vendas"),
    MARKETING ("Marketing");

    private String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
