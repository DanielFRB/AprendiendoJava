package com.dfrb.java;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class TrabajandoColores {
    public static void main(String[] args) {
        MarcoConColor marco = new MarcoConColor();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConColor extends JFrame {
    public MarcoConColor() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Trabajando con Colores");
        LaminaConColor miLamina = new LaminaConColor();
        add(miLamina);
        miLamina.setBackground(SystemColor.window);
    }
}

class LaminaConColor extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hola Mundo... Estamos Aprendiendo Swing", 230, 20);
        Graphics2D g2D = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2D.setColor(Color.RED);
        g2D.fill(rectangulo);
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        Color color = new Color(70,170,180);
        g2D.setColor(color.brighter());
        g2D.fill(elipse);
    }
}
