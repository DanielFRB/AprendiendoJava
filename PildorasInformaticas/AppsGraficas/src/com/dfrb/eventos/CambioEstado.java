package com.dfrb.eventos;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class CambioEstado {
    public static void main(String[] args) {
        MarcoEstado miMarco = new MarcoEstado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoEstado extends JFrame {
    public MarcoEstado() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Controlando el Estado de la Ventana");
        CambiaEstado nuevoEstado = new CambiaEstado();
        addWindowStateListener(nuevoEstado);
    }
}

class CambiaEstado implements WindowStateListener {
    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("La ventana ha cambiado de estado");
        if (e.getNewState() == Frame.MAXIMIZED_BOTH) {
            System.out.println("La ventana esta a pantalla completa");
        } else if (e.getNewState() == Frame.NORMAL) {
            System.out.println("La ventana esta a pantalla normal");
        } else if (e.getNewState() == Frame.ICONIFIED) {
            System.out.println("La ventana esta minimizada");
        } else {
            System.out.println("No hay cambio aparente en la ventana");
        }
    }
    
}
