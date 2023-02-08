package com.dfrb.eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaEventos {
    public static void main(String[] args) {
        MarcoBotones miMarco = new MarcoBotones();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoBotones extends JFrame {
    public MarcoBotones() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Botones y Eventos");
        LaminaBotones miLamina = new LaminaBotones();
        add(miLamina);
    }
}

class LaminaBotones extends JPanel implements ActionListener {
    JButton btnAzul = new JButton("Azul");
    JButton btnAmarillo = new JButton("Amarillo");
    JButton btnRojo = new JButton("Rojo");
    
    public LaminaBotones() {
        add(btnAmarillo);
        add(btnAzul);
        add(btnRojo);
        btnAzul.addActionListener(this);
        btnAmarillo.addActionListener(this);
        btnRojo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object btnPulsado = e.getSource();
        if (btnPulsado == btnAzul) {
            setBackground(Color.BLUE);
        } else if (btnPulsado == btnAmarillo) {
            setBackground(Color.YELLOW);
        } else {
            setBackground(Color.RED);
        }
    }
}


