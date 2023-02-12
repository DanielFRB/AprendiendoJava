package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class DemoTextArea {
    public static void main(String[] args) {
        MarcoArea miMarco = new MarcoArea();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoArea extends JFrame {
    public MarcoArea() {
        setBounds(500, 300, 500, 350);
        LaminaArea miLamina = new LaminaArea();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaArea extends JPanel {
    public LaminaArea() {
        areaText = new JTextArea(8,20);
        JScrollPane laminaBarra = new JScrollPane(areaText);
        areaText.setLineWrap(true);
        add(laminaBarra);
        JButton miBtn = new JButton("Enviar");
        miBtn.addActionListener(new GestionaArea());
        add(miBtn);
    }
    
    private class GestionaArea implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(areaText.getText());
        }
    }
    
    private JTextArea areaText;
}
