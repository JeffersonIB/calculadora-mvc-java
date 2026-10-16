package com.jeffersonib.calculadora.modelo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicacionTest {

    private static final double DELTA = 0.0001;
    private Operacion multiplicacion;

    @Before
    public void setUp() {
        multiplicacion = new Multiplicacion();
    }

    @Test
    public void multiplicaDosPositivos() {
        assertEquals(12.0, multiplicacion.calcular(3, 4), DELTA);
    }

    @Test
    public void multiplicaPorCero() {
        assertEquals(0.0, multiplicacion.calcular(7, 0), DELTA);
    }

    @Test
    public void multiplicaNegativoPorPositivo() {
        assertEquals(-15.0, multiplicacion.calcular(-3, 5), DELTA);
    }

    @Test
    public void simboloEsPor() {
        assertEquals("*", multiplicacion.getSimbolo());
    }
}
