package com.projeto.Classes;

public class Armazem {
    private String nome;
    private String localizacao;


    public Armazem(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", localizacao='" + getLocalizacao() + "'" +
            "}";
    }


}
