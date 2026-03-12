package org.example.atividade1;

public class Pato implements Animal{
    @Override
    public String emitirSom() {
        return "Quaqua!";
    }

    @Override
    public String comer() {
        return "Ração";
    }
}
