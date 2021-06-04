package com.projeto.Classes;

public class Camiao {
    private String marca;
    private float tara;
    private float capacidade;


    public Camiao(String marca, float tara, float capacidade) {
        this.marca = marca;
        this.tara = tara;
        this.capacidade = capacidade;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getTara() {
        return this.tara;
    }

    public void setTara(float tara) {
        this.tara = tara;
    }

    public float getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", tara='" + getTara() + "'" +
            ", capacidade='" + getCapacidade() + "'" +
            "}";
    }


  
}
