package org.example.exercicio2;

public enum Sexo {
    MASCULINO ("Masculino"),
    FEMINIMO ("Feminimo");

    private String texto;

    Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}

