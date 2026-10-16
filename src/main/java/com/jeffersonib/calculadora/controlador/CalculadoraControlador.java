package com.jeffersonib.calculadora.controlador;

import com.jeffersonib.calculadora.modelo.Calculadora;
import com.jeffersonib.calculadora.vista.CalculadoraVista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraControlador implements ActionListener {

    private final Calculadora modelo;
    private final CalculadoraVista vista;

    public CalculadoraControlador(Calculadora modelo, CalculadoraVista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.agregarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if ("C".equals(comando)) {
            vista.limpiar();
            return;
        }

        try {
            double a = Double.parseDouble(vista.getNumero1());
            double b = Double.parseDouble(vista.getNumero2());
            double resultado = modelo.calcular(a, b, comando);
            vista.mostrarResultado(formatear(resultado));
        } catch (NumberFormatException ex) {
            vista.mostrarError("Ingrese números válidos en ambos campos");
        } catch (ArithmeticException | IllegalArgumentException ex) {
            vista.mostrarError(ex.getMessage());
        }
    }

    private String formatear(double valor) {
        if (valor == Math.rint(valor) && !Double.isInfinite(valor)) {
            return String.valueOf((long) valor);
        }
        return String.valueOf(valor);
    }
}
