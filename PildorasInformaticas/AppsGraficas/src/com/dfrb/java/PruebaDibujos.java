package com.dfrb.java;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaDibujos {
    public static void main(String[] args) {
        MarcoConDibujos miMarco = new MarcoConDibujos();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConDibujos extends JFrame {
    public MarcoConDibujos() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Primer Dibujo dentro del Marco");
        LaminaDibujo miLamina = new LaminaDibujo();
        add(miLamina);
    }
}

class LaminaDibujo extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hola Mundo... Estamos Aprendiendo Swing", 230, 20);
        g.drawRect(90, 30, 200, 100);
        g.drawLine(90, 30, 290, 130);
        g.drawArc(50, 100, 100, 200, 120, 150);
        g.drawOval(200, 200, 100, 100);
    }
}
