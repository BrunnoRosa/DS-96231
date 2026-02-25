package com.example.encapsulamento;

public class Livro {
    // ATRIBUTOS DA CLASSE 
    private String nome;
    private double preco;
    private String autor;

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    // MÉTODOS DE ACESSO (GETTERS E SETTERS)
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    

}
