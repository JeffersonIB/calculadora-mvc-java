package com.jeffersonib.calculadora.modelo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaTest {

    private static final double DELTA = 0.0001;
    private Operacion resta;

    @Before
    public void setUp() {
        resta = new Resta();
    }

    @Test
    public void restaDosPositivos() {
        assertEquals(6.0, resta.calcular(10, 4), DELTA);
    }

    @Test
    public void restaConResultadoNegativo() {
        assertEquals(-6.0, resta.calcular(4, 10), DELTA);
    }

    @Test
    public void simboloEsMenos() {
        assertEquals("-", resta.getSimbolo());
    }
}
