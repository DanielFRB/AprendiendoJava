package com.dfrb.java;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class EscribiendoEnMarco {
    public static void main(String[] args) {
        MarcoConTexto miMarco = new MarcoConTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTexto extends JFrame {
    public MarcoConTexto() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Primer Texto en Marco");
        Lamina miLamina = new Lamina();
        add(miLamina);
    }
}

class Lamina extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Estamos Aprendiendo Swing", 100, 50);
    }
}
