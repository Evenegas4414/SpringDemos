package org.example.model;

public class Cuadrado implements Figura {

    private double a;

    public Cuadrado( double a) {
        this.a = a;
    }
    @Override
    public double calcularArea() {
        return a * a;
    }

    @Override
    public double calcularPerimetro() {
        return a * 4;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
