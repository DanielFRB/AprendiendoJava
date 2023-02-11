package com.dfrb.layouts;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class Calculadora2 {
    public static void main(String[] args) {
        MarcoCalculadora2 miMarco = new MarcoCalculadora2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCalculadora2 extends JFrame {
    public MarcoCalculadora2() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Calculadora en Java");
        setBounds(500, 300, 450, 300);
        LaminaCalculadora2 miLamina = new LaminaCalculadora2();
        add(miLamina);
    }
}

class LaminaCalculadora2 extends JPanel {
    public LaminaCalculadora2() {
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
        poneBtn("7", accionNumero);
        poneBtn("8", accionNumero);
        poneBtn("9", accionNumero);
        //poneBtn("/");
        poneBtn("4", accionNumero);
        poneBtn("5", accionNumero);
        poneBtn("6", accionNumero);
        //poneBtn("*");
        poneBtn("1", accionNumero);
        poneBtn("2", accionNumero);
        poneBtn("3", accionNumero);
        //poneBtn("-");
        poneBtn("0", accionNumero);
        poneBtn(",", accionNumero);
        //poneBtn("+");
        //poneBtn("=");
        add(miLamina2, BorderLayout.CENTER);
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
    
    private JPanel miLamina2;
    private JButton pantalla;
    private boolean principio;
}
