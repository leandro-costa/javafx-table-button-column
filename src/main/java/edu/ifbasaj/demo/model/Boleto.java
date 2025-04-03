package edu.ifbasaj.demo.model;

public class Boleto {
    private int id;
    private String credor;
    private double valor;

    public Boleto(int id, String credor, double valor) {
        this.id = id;
        this.credor = credor;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
