package com.dfrb.java;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaDibujos2D {
    public static void main(String[] args) {
        MarcoConDibujos2D miMarco = new MarcoConDibujos2D();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConDibujos2D extends JFrame {
    public MarcoConDibujos2D() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Dibujando Graficos 2D");
        LaminaConDibujo2D miLamina = new LaminaConDibujo2D();
        add(miLamina);
    }
}

class LaminaConDibujo2D extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hola Mundo... Estamos Aprendiendo Swing", 230, 20);
        Graphics2D g2D = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2D.draw(rectangulo);
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2D.draw(elipse);
        g2D.draw(new Line2D.Double(100, 100, 300, 250));
        double centroX = rectangulo.getCenterX();
        double centroY = rectangulo.getCenterY();
        double radio = 125;
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
        g2D.draw(circulo);
    }
}
