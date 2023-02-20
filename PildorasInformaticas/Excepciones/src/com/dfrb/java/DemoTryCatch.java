package com.dfrb.java;

import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class DemoTryCatch {
    public static void main(String[] args) {
        MarcoImagen miMarco = new MarcoImagen();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoImagen extends JFrame {
    public MarcoImagen() {
        setTitle("Demostracion de funcionamiento de bloque try-catch");
        setBounds(450, 150, 600, 350);
        LaminaImagen miLamina = new LaminaImagen();
        add(miLamina);
    }
}

class LaminaImagen extends JPanel {
    public LaminaImagen() {
        try {
            imagen = ImageIO.read(new File("src/images/bolaAzul.gif"));
        } catch (IOException e) {
            System.err.println("La imagen no se encuentra...");
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Si la imagen no se encuentra salta la excepcion y se muestra el mensaje en consola. El valor de la variable imagen es null
        // En este metodo si no se coloca el condicional if, la variable imagen no se inicializa y por lo tanto su valor es null
        // Al intentar leer un null, salta un error de tipo No Comprobado "NullPointerException"
        // Con este condicional if, podemos manejar el funcionamiento del programa y evitamos futuros errores.
        if (imagen == null) {
            g.drawString("No se pudo cargar la Imagen", 50, 20);
        } else {
            int anchuraImagen = imagen.getWidth(this);
            int alturaImagen = imagen.getHeight(this);
            g.drawImage(imagen, 0, 0, null);
            for (int i = 0; i < 200; i++) {
                for (int j = 0; j < 200; j++) {
                    g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
                }
            }
        }
    }
    private Image imagen;
}
