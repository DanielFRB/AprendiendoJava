package com.dfrb.layouts;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class DisposicionLayout {
    public static void main(String[] args) {
        MarcoLayout miMarco = new MarcoLayout();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoLayout extends JFrame {
    public MarcoLayout() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Prueba de Disposiciones o Layouts (FlowLayout)");
        PanelLayout miLamina = new PanelLayout();
        /* FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
        miLamina.setLayout(disposicion);*/
        //Resumiendo
        miLamina.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(miLamina);
    }
}

class PanelLayout extends JPanel {
    public PanelLayout() {
        add(new JButton("Amarillo"));
        add(new JButton("Azul"));
        add(new JButton("Rojo"));
    }
}
