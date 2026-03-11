package org.example.atividade1;

public class Memoria extends Fabricante{
    private int capacidadeDeArmazenamento;

    public Memoria(String marca, String modelo, int capacidadeDeArmazenamento) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public int getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(int capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadeDeArmazenamento=" + capacidadeDeArmazenamento +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
