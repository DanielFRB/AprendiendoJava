package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaTexto {
    public static void main(String[] args) {
        MarcoTexto miMarco = new MarcoTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoTexto extends JFrame {
    public MarcoTexto() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Cuadros de Texto");
        LaminaTexto miLamina = new LaminaTexto();
        add(miLamina);
    }
}

class LaminaTexto extends JPanel {
    public LaminaTexto() {
        JLabel txt1 = new JLabel("Email: ");
        add(txt1);
        campo1 = new JTextField(20);
        add(campo1);
        JButton miBtn = new JButton("Comprobar");
        DameTexto miEvento = new DameTexto();
        miBtn.addActionListener(miEvento);
        add(miBtn);
    }
    
    private class DameTexto implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(campo1.getText().trim());
        }
    }
    
    private JTextField campo1;
}
