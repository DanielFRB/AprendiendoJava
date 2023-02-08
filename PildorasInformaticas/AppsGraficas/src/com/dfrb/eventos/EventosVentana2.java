package com.dfrb.eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class EventosVentana2 {
    public static void main(String[] args) {
        MarcoVentana2 miMarco = new MarcoVentana2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MarcoVentana2 miMarco2 = new MarcoVentana2();
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miMarco.setTitle("Ventana 1");
        miMarco2.setTitle("Ventana 2");
        miMarco.setBounds(100, 100, 300, 250);
        miMarco2.setBounds(600, 100, 300, 250);
    }
}

class MarcoVentana2 extends JFrame {
    public MarcoVentana2() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        
        /* MVentana2 ventanaOyente = new MVentana2();
        addWindowListener(ventanaOyente); */
        
        addWindowListener(new MVentana2());
    }
}

class MVentana2 extends WindowAdapter {
   @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }
    
}
