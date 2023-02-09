package com.dfrb.eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class EventosRaton2 {
    public static void main(String[] args) {
        MarcoRaton2 miMarco = new MarcoRaton2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRaton2 extends JFrame {
    public MarcoRaton2() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Eventos de Raton");
        addMouseListener(new EventosDeRaton2());
        addMouseMotionListener(new EventosDeRaton2());
    }
}

class EventosDeRaton2 extends MouseAdapter implements MouseMotionListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Coordenada X: "+ e.getX() +" Coordenada Y: "+ e.getY());
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            System.out.println("Haz pulsado el boton izquierdo");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
            System.out.println("Haz pulsado la rueda del mouse");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
            System.out.println("Haz pulsado el boton derecho");
        }
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estas arrastrando");
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas moviendo");
    }
    
}
