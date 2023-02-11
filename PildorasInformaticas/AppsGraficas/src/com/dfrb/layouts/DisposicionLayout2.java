package com.dfrb.layouts;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class DisposicionLayout2 {
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
        setTitle("Prueba de Disposiciones o Layouts 2");
        PanelLayout miLamina = new PanelLayout();
        PanelLayout2 miLamina2 = new PanelLayout2();
        add(miLamina, BorderLayout.NORTH);
        add(miLamina2, BorderLayout.SOUTH);
    }
}

class PanelLayout extends JPanel {
    public PanelLayout() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("Amarillo"), BorderLayout.NORTH);
        add(new JButton("Azul"), BorderLayout.SOUTH);
        
    }
}

class PanelLayout2 extends JPanel {
    public PanelLayout2() {
        setLayout(new BorderLayout());
        add(new JButton("Rojo"), BorderLayout.WEST);
        add(new JButton("Verde"), BorderLayout.EAST);
        add(new JButton("Negro"), BorderLayout.CENTER);
    }
}
