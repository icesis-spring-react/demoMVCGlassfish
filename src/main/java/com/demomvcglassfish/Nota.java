package com.demomvcglassfish;

public class Nota
{
    private float valor;
    private String desc;

    public Nota() {
    }

    public Nota(float valor, String desc) {
        this.valor = valor;
        this.desc = desc;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
