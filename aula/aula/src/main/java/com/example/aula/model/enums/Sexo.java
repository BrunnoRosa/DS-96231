package com.example.aula.model.enums;

public enum Sexo {
    MASCULINO ("Mascunlino"),
    FEMININO ("Feminino");

    private String texto;

    Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
