package org.example.atividade1;

public class DispositivoDeArmazenamento extends  Fabricante{
    private String capacidadeArmazenamento;
    private String tipoDeConexao;

    public DispositivoDeArmazenamento(String marca, String modelo, String capacidadeArmazenamento, String tipoDeConexao) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    @Override
    public String toString() {
        return "DispositivoDeArmazenamento{" +
                "capacidadeArmazenamento='" + capacidadeArmazenamento + '\'' +
                ", tipoDeConexao='" + tipoDeConexao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
