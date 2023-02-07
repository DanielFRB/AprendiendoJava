package com.dfrb.java;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class CreandoMarcoCentrado {
    public static void main(String[] args) {
        MarcoCentrado miMarco = new MarcoCentrado();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCentrado extends JFrame {
    public MarcoCentrado() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setTitle("Marco Centrado");
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
    }
}
