package com.jeffersonib.calculadora;

import com.jeffersonib.calculadora.controlador.CalculadoraControlador;
import com.jeffersonib.calculadora.modelo.Calculadora;
import com.jeffersonib.calculadora.vista.CalculadoraVista;

import javax.swing.SwingUtilities;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculadora modelo = new Calculadora();
            CalculadoraVista vista = new CalculadoraVista();
            new CalculadoraControlador(modelo, vista);
            vista.setVisible(true);
        });
    }
}