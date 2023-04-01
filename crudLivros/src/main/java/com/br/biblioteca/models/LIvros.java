package com.br.biblioteca.models;

import java.util.Date;

public class LIvros {
    private int id;
    private String titulo;
    private String categoria;
    private String autor;
    private Date ano_lancamento;
    private float preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(Date ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
