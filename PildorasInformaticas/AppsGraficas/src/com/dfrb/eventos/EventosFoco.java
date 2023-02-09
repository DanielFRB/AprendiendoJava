package com.dfrb.eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class EventosFoco {
    public static void main(String[] args) {
        MarcoFoco miMarco = new MarcoFoco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoFoco extends JFrame {
    public MarcoFoco() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Eventos de Foco");
        LaminaFoco miLamina = new LaminaFoco();
        add(miLamina);
    }
}

class LaminaFoco extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setLayout(null);
        cuadro1 = new JTextField();
        cuadro2 = new JTextField();
        cuadro1.setBounds(120, 20, 150, 20);
        cuadro2.setBounds(120, 60, 150, 20);
        add(cuadro1);
        add(cuadro2);
        LanzaFocos foco = new LanzaFocos();
        cuadro1.addFocusListener(foco);
    }
    
    private class LanzaFocos implements FocusListener {
        @Override
        public void focusGained(FocusEvent e) {
        
        }

        @Override
        public void focusLost(FocusEvent e) {
            // System.out.println("He perdido el foco");
            String email = cuadro1.getText();
            boolean comprobado = false;
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    comprobado = true;
                }
            }
            System.out.println((comprobado) ? "Es Correcto" : "Incorrecto");
        }
    }
    
    JTextField cuadro1;
    JTextField cuadro2;
}

