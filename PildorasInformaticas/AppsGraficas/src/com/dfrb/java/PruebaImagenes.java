package com.dfrb.java;

import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaImagenes {
    public static void main(String[] args) {
        MarcoImagen miMarco = new MarcoImagen();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoImagen extends JFrame {
    public MarcoImagen() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Trabajando con Imagenes");
        LaminaConImagenes miLamina = new LaminaConImagenes();
        add(miLamina);
        miLamina.setBackground(SystemColor.window);
    }
}

class LaminaConImagenes extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            imagen = ImageIO.read(new File("src/images/carro.png"));
        } catch (IOException e) {
            System.err.println("La imagen no se encuentra...");
        }
        g.drawImage(imagen, 5, 5, null);
    }
    
    private Image imagen;
}
