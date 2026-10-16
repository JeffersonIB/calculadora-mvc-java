package com.jeffersonib.calculadora.modelo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {

    private static final double DELTA = 0.0001;
    private Operacion division;

    @Before
    public void setUp() {
        division = new Division();
    }

    @Test
    public void divideDosPositivos() {
        assertEquals(5.0, division.calcular(10, 2), DELTA);
    }

    @Test
    public void divisionConDecimales() {
        assertEquals(2.5, division.calcular(5, 2), DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionEntreCeroLanzaExcepcion() {
        division.calcular(10, 0);
    }

    @Test
    public void simboloEsDivision() {
        assertEquals("/", division.getSimbolo());
    }
}
