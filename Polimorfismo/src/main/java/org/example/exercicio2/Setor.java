package org.example.exercicio2;

public enum Setor {
    RECURSOSHUMANOS ("Recursos_Humanos"),
    FINANCEIRO ("Financeiro"),
    OPERACOES ("OPerações");

    private String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
