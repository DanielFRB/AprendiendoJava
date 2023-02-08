package com.dfrb.java;

import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaImagenes2 {
    public static void main(String[] args) {
        MarcoImagen2 miMarco = new MarcoImagen2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoImagen2 extends JFrame {
    public MarcoImagen2() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Trabajando con Imagenes");
        LaminaConImagenes2 miLamina = new LaminaConImagenes2();
        add(miLamina);
        miLamina.setBackground(SystemColor.window);
    }
}

class LaminaConImagenes2 extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            imagen = ImageIO.read(new File("src/images/bolaAzul.gif"));
        } catch (IOException e) {
            System.err.println("La imagen no se encuentra...");
        }
        int anchuraImagen = imagen.getWidth(this);
        int alturaImagen = imagen.getHeight(this);
        g.drawImage(imagen, 0, 0, null);
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
            }
        }
    }
    
    private Image imagen;
}
