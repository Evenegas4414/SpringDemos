package org.example.model;

public class Rectangulo implements Figura {

    private double a;
    private double b;

    public Rectangulo( double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double calcularArea() {
        return a * b;
    }

    @Override
    public double calcularPerimetro() {
        return (a * 2) + (b * 2);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
