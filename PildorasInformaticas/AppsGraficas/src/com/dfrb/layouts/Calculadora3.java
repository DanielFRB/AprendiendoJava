package com.dfrb.layouts;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class Calculadora3 {
    public static void main(String[] args) {
        MarcoCalculadora3 miMarco = new MarcoCalculadora3();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCalculadora3 extends JFrame {
    public MarcoCalculadora3() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Calculadora en Java");
        setBounds(500, 300, 450, 300);
        LaminaCalculadora3 miLamina = new LaminaCalculadora3();
        add(miLamina);
    }
}

class LaminaCalculadora3 extends JPanel {
    public LaminaCalculadora3() {
        this.principio = true;
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        // Instanciando la clase Dimension directamente cambio las dimenciones del boton
        pantalla.setPreferredSize(new Dimension(41, 75));
        // Establezco el tipo de letra y tamaño del area de la pantalla instanciando directamente la clase Font
        pantalla.setFont(new Font("Arial", Font.BOLD, 50));
        // Desactivo el boton para que no muestre su caracteristicas
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);
        miLamina2 = new JPanel();
        miLamina2.setLayout(new GridLayout(4,4));
        ActionListener accionNumero = new InsertaNumero();
        ActionListener orden = new AccionOrden();
        
        poneBtn("7", accionNumero);
        poneBtn("8", accionNumero);
        poneBtn("9", accionNumero);
        poneBtn("/", orden);
        poneBtn("4", accionNumero);
        poneBtn("5", accionNumero);
        poneBtn("6", accionNumero);
        poneBtn("*", orden);
        poneBtn("1", accionNumero);
        poneBtn("2", accionNumero);
        poneBtn("3", accionNumero);
        poneBtn("-",orden);
        poneBtn("0", accionNumero);
        poneBtn(",", accionNumero);
        poneBtn("+", orden);
        poneBtn("=", orden);
        add(miLamina2, BorderLayout.CENTER);
        ultimaOperacion = "=";
    }
    
    private void poneBtn(String rotulo, ActionListener oyente) {
        JButton btn = new JButton(rotulo);
        // Cambio el tipo de letra y tamaño de la misma
        btn.setFont(new Font("Arial", Font.BOLD, 18));
        btn.addActionListener(oyente);
        miLamina2.add(btn);
    }
    
    private class InsertaNumero implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();
            if (principio) {
                pantalla.setText("");
                principio = false;
            }
            pantalla.setText(pantalla.getText() + entrada);
        }
    }
    
    private class AccionOrden implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String operacion = e.getActionCommand();
            calcular(Double.parseDouble(pantalla.getText()));
            ultimaOperacion = operacion;
            principio = true;
            
        }
        
        public void calcular(double x) {
            if (ultimaOperacion.equals("+")) {
                resultado += x;
            } else if (ultimaOperacion.equals("-")) {
                resultado -= x;
            } else if (ultimaOperacion.equals("*")) {
                resultado *= x;
            } else if (ultimaOperacion.equals("/")) {
                resultado /= x;
            } else if (ultimaOperacion.equals("=")) {
                resultado = x;
            }
            pantalla.setText(""+resultado);
        }
    }
    
    private JPanel miLamina2;
    private JButton pantalla;
    private boolean principio;
    private double resultado;
    private String ultimaOperacion;
}
