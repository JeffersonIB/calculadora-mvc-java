package com.jeffersonib.calculadora.modelo;

import java.util.LinkedHashMap;
import java.util.Map;

public class Calculadora {

    private final Map<String, Operacion> operaciones = new LinkedHashMap<>();

    public Calculadora() {
        registrar(new Suma());
        registrar(new Resta());
        registrar(new Multiplicacion());
        registrar(new Division());
    }

    private void registrar(Operacion operacion) {
        operaciones.put(operacion.getSimbolo(), operacion);
    }

    public double calcular(double a, double b, String simbolo) {
        Operacion operacion = operaciones.get(simbolo);
        if (operacion == null) {
            throw new IllegalArgumentException("Operación no soportada: " + simbolo);
        }
        return operacion.calcular(a, b);
    }
}
