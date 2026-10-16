package com.jeffersonib.calculadora.modelo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    private static final double DELTA = 0.0001;
    private Calculadora calculadora;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void calculaSuma() {
        assertEquals(8.0, calculadora.calcular(5, 3, "+"), DELTA);
    }

    @Test
    public void calculaResta() {
        assertEquals(2.0, calculadora.calcular(5, 3, "-"), DELTA);
    }

    @Test
    public void calculaMultiplicacion() {
        assertEquals(15.0, calculadora.calcular(5, 3, "*"), DELTA);
    }

    @Test
    public void calculaDivision() {
        assertEquals(2.0, calculadora.calcular(6, 3, "/"), DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionEntreCeroLanzaExcepcion() {
        calculadora.calcular(6, 0, "/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void operacionNoSoportadaLanzaExcepcion() {
        calculadora.calcular(6, 3, "%");
    }
}