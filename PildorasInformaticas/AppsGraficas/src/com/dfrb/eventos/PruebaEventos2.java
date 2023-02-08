package com.dfrb.eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaEventos2 {
    public static void main(String[] args) {
        MarcoBotones2 miMarco = new MarcoBotones2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoBotones2 extends JFrame {
    public MarcoBotones2() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Botones y Eventos II");
        LaminaBotones miLamina = new LaminaBotones();
        add(miLamina);
    }
}

class LaminaBotones2 extends JPanel {
    JButton btnAzul = new JButton("Azul");
    JButton btnAmarillo = new JButton("Amarillo");
    JButton btnRojo = new JButton("Rojo");
    
    public LaminaBotones2() { // Constructor
        add(btnAmarillo);
        add(btnAzul);
        add(btnRojo);
        
        ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
        ColorFondo Azul = new ColorFondo(Color.BLUE);
        ColorFondo Rojo = new ColorFondo(Color.RED);
        
        btnAzul.addActionListener(Azul);
        btnAmarillo.addActionListener(Amarillo);
        btnRojo.addActionListener(Rojo);
    }
    
    private class ColorFondo implements ActionListener { // Clase Interna
        public ColorFondo(Color c) {
            this.colorFondo = c;
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(colorFondo);
        }
    
        private Color colorFondo;
    }
}
