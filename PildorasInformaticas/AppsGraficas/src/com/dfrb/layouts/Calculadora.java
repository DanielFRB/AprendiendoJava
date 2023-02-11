package com.dfrb.layouts;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class Calculadora {
    public static void main(String[] args) {
        MarcoCalculadora miMarco = new MarcoCalculadora();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCalculadora extends JFrame {
    public MarcoCalculadora() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Calculadora en Java");
        setBounds(500, 300, 450, 300);
        LaminaCalculadora miLamina = new LaminaCalculadora();
        add(miLamina);
    }
}

class LaminaCalculadora extends JPanel {
    public LaminaCalculadora() {
        setLayout(new BorderLayout());
        JButton pantalla = new JButton("0");
        // Con estas lineas de codigo aumentamos el tamaño de la pantalla
        Dimension sizePantalla = new Dimension(41, 75);
        pantalla.setPreferredSize(sizePantalla);
        // Aqui termina el codigo
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);
        miLamina2 = new JPanel();
        miLamina2.setLayout(new GridLayout(4,4));
        poneBtn("7");
        poneBtn("8");
        poneBtn("9");
        poneBtn("/");
        poneBtn("4");
        poneBtn("5");
        poneBtn("6");
        poneBtn("*");
        poneBtn("1");
        poneBtn("2");
        poneBtn("3");
        poneBtn("-");
        poneBtn("0");
        poneBtn(",");
        poneBtn("+");
        poneBtn("=");
        add(miLamina2, BorderLayout.CENTER);
    }
    
    private void poneBtn(String rotulo) {
        JButton btn = new JButton(rotulo);
        miLamina2.add(btn);
    }
    
    private JPanel miLamina2;
}
