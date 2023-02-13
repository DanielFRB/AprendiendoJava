package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaComboBox {
    public static void main(String[] args) {
        MarcoComboBox miMarco = new MarcoComboBox();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoComboBox extends JFrame {
    public MarcoComboBox() {
        setTitle("Prueba con ComboBox");
        setBounds(500, 280, 500, 350);
        LaminaComboBox miLamina = new LaminaComboBox();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaComboBox extends JPanel {
    public LaminaComboBox() {
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha...");
        Font miLetra = new Font("Serif", Font.PLAIN, 18);
        texto.setFont(miLetra);
        JPanel laminaTexto = new JPanel();
        laminaTexto.add(texto);
        add(laminaTexto, BorderLayout.CENTER);
        JPanel laminaCombo2 = new JPanel();
        miCombo = new JComboBox();
        miCombo.setEditable(true);
        miCombo.addItem("SansSerif");
        miCombo.addItem("Alef");
        miCombo.addItem("Times New Roman");
        miCombo.addItem("Lucida Sans");
        EventoCombo evento = new EventoCombo();
        miCombo.addActionListener(evento);
        laminaCombo2.add(miCombo);
        add(laminaCombo2, BorderLayout.NORTH);
    }
    
    private class EventoCombo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            texto.setFont(new Font((String) miCombo.getSelectedItem(), Font.PLAIN, 22));
        }
    }
    
    private JLabel texto;
    private JComboBox miCombo;
}
