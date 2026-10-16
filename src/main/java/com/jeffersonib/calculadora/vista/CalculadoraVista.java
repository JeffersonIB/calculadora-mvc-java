package com.jeffersonib.calculadora.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculadoraVista extends JFrame {

    private final JTextField txtNumero1 = new JTextField(10);
    private final JTextField txtNumero2 = new JTextField(10);
    private final JLabel lblResultado = new JLabel("Resultado: ");

    private final JButton btnSumar = new JButton("+");
    private final JButton btnRestar = new JButton("-");
    private final JButton btnMultiplicar = new JButton("*");
    private final JButton btnDividir = new JButton("/");
    private final JButton btnLimpiar = new JButton("C");

    public CalculadoraVista() {
        super("Calculadora MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        getRootPane().setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JPanel panelDatos = new JPanel(new GridLayout(2, 2, 5, 5));
        panelDatos.add(new JLabel("Número 1:"));
        panelDatos.add(txtNumero1);
        panelDatos.add(new JLabel("Número 2:"));
        panelDatos.add(txtNumero2);

        JPanel panelBotones = new JPanel(new GridLayout(1, 5, 5, 5));
        panelBotones.add(btnSumar);
        panelBotones.add(btnRestar);
        panelBotones.add(btnMultiplicar);
        panelBotones.add(btnDividir);
        panelBotones.add(btnLimpiar);

        lblResultado.setFont(lblResultado.getFont().deriveFont(Font.BOLD, 16f));
        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);

        add(panelDatos, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
        add(lblResultado, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }

    public String getNumero1() {
        return txtNumero1.getText().trim();
    }

    public String getNumero2() {
        return txtNumero2.getText().trim();
    }

    public void mostrarResultado(String resultado) {
        lblResultado.setText("Resultado: " + resultado);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void limpiar() {
        txtNumero1.setText("");
        txtNumero2.setText("");
        lblResultado.setText("Resultado: ");
        txtNumero1.requestFocus();
    }

    public void agregarListener(ActionListener listener) {
        btnSumar.addActionListener(listener);
        btnRestar.addActionListener(listener);
        btnMultiplicar.addActionListener(listener);
        btnDividir.addActionListener(listener);
        btnLimpiar.addActionListener(listener);
    }
}
