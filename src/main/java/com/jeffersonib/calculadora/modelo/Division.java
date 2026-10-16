package com.jeffersonib.calculadora.modelo;

public class Division implements Operacion {

    @Override
    public double calcular(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }

    @Override
    public String getSimbolo() {
        return "/";
    }
}
