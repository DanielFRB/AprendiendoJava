package com.dfrb.java.metadatos;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class MarcoMetadataJDBC extends JFrame {
    public MarcoMetadataJDBC() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setTitle("Aplicacion Universal Usando Metadatos");
        LaminaMetadataJDBC lamina = new LaminaMetadataJDBC();
        add(lamina);
    }
}
