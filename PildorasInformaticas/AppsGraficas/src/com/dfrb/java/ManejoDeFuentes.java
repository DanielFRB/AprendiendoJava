package com.dfrb.java;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class ManejoDeFuentes {
    public static void main(String[] args) {
        MarcoConLetras miMarco = new MarcoConLetras();
    }
}

class MarcoConLetras extends JFrame {
    public MarcoConLetras() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Manejo de Fuentes de Letras");
        LaminaConLetras miLamina = new LaminaConLetras();
        add(miLamina);
        miLamina.setBackground(SystemColor.window);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class LaminaConLetras extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        Font arialBold = new Font("Arial", Font.BOLD, 36);
        Color color = new Color(0, 35, 245);
        g2D.setFont(arialBold);
        g2D.setColor(color);
        g2D.drawString("Daniel Rondon", 100, 80);
    }
}
