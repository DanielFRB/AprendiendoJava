package com.dfrb.eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class EventosVariosOyentes {
    public static void main(String[] args) {
        MarcoPrincipal miMarco = new MarcoPrincipal();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoPrincipal extends JFrame {
    public MarcoPrincipal() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Prueba de Multiples Oyentes de Eventos");
        LaminaPrincipal miLamina = new LaminaPrincipal();
        add(miLamina);
    }
}

class LaminaPrincipal extends JPanel {
    public LaminaPrincipal() {
        btnNuevo = new JButton("Nuevo");
        add(btnNuevo);
        btnCerrar = new JButton("Cerrar Todo");
        add(btnCerrar);
        OyenteNuevo oyente = new OyenteNuevo();
        btnNuevo.addActionListener(oyente);
    }
    
    private class OyenteNuevo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            MarcoEmergente emergente = new MarcoEmergente(btnCerrar);
            emergente.setVisible(true);
        }
    }
    
    JButton btnNuevo;
    JButton btnCerrar;
}

class MarcoEmergente extends JFrame {
    public MarcoEmergente(JButton btnCierraTodo) {
        contador++;
        setTitle("Ventana "+ contador);
        setBounds(50*contador,50*contador, 300, 150);
        CierraTodo cerrar = new CierraTodo();
        btnCierraTodo.addActionListener(cerrar);
    }
    
    private class CierraTodo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            contador = 0;
        }
    }
    
    private static int contador = 0;
}
