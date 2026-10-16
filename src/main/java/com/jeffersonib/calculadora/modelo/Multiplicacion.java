package com.jeffersonib.calculadora.modelo;

public class Multiplicacion implements Operacion {

    @Override
    public double calcular(double a, double b) {
        return a * b;
    }

    @Override
    public String getSimbolo() {
        return "*";
    }
}
