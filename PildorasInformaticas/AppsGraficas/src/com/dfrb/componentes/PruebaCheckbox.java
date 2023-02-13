package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaCheckbox {
    public static void main(String[] args) {
        MarcoCheck miMarco = new MarcoCheck();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCheck extends JFrame {
    public MarcoCheck() {
        setTitle("Prueba con CkeckBox");
        setBounds(500, 280, 500, 350);
        LaminaCheck miLamina = new LaminaCheck();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaCheck extends JPanel {
    public LaminaCheck() {
        setLayout(new BorderLayout());
        Font miLetra = new Font("Serif", Font.PLAIN, 16);
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre no quiero acordarme...");
        texto.setFont(miLetra);
        JPanel laminaTexto = new JPanel();
        laminaTexto.add(texto);
        add(laminaTexto, BorderLayout.CENTER);
        check1 = new JCheckBox("Negrita");
        check2 = new JCheckBox("Cursiva");
        check1.addActionListener(new ManejaChecks());
        check2.addActionListener(new ManejaChecks());
        JPanel laminaChecks = new JPanel();
        laminaChecks.add(check1);
        laminaChecks.add(check2);
        add(laminaChecks, BorderLayout.SOUTH);
    }
    
    private class ManejaChecks implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int tipoTexto = 0;
            if (check1.isSelected()) {
                tipoTexto += Font.BOLD;
            }
            if (check2.isSelected()) {
                tipoTexto += Font.ITALIC;
            }
            texto.setFont(new Font("Serif", tipoTexto, 16));
        }
    }
    
    private JLabel texto;
    private JCheckBox check1, check2;
}
