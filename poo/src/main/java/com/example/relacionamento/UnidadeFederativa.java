package com.example.relacionamento;

public enum UnidadeFederativa {

    BAHIA ("BA"),
    SAO_PAULO ("SP"),
    RIO_DE_JANEIRO ("RJ");

    private String texto;

    UnidadeFederativa(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
