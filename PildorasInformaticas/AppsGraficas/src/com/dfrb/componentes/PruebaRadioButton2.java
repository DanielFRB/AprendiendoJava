package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaRadioButton2 {
    public static void main(String[] args) {
        MarcoRadioButton2 miMarco = new MarcoRadioButton2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRadioButton2 extends JFrame {
    public MarcoRadioButton2() {
        setTitle("Prueba Nro 2 con RadioButtons y Eventos");
        setBounds(500, 280, 500, 350);
        LaminaRadioButton2 miLamina = new LaminaRadioButton2();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaRadioButton2 extends JPanel {
    public LaminaRadioButton2() {
        setLayout(new BorderLayout());
        Font miLetra = new Font("Serif", Font.PLAIN, 14);
        texto = new JLabel("En un lugar de la Mancha...");
        texto.setFont(miLetra);
        JPanel laminaTexto = new JPanel();
        laminaTexto.add(texto);
        add(laminaTexto, BorderLayout.CENTER);
        ButtonGroup miBtnGroup1 = new ButtonGroup();
        radBtn1 = new JRadioButton("Pequeño", false);
        radBtn2 = new JRadioButton("Normal", true);
        radBtn3 = new JRadioButton("Grande", false);
        radBtn4 = new JRadioButton("Muy Grande", false);
        miBtnGroup1.add(radBtn1);
        miBtnGroup1.add(radBtn2);
        miBtnGroup1.add(radBtn3);
        miBtnGroup1.add(radBtn4);
        JPanel laminaRadBtn = new JPanel();
        EventoRadio accion = new EventoRadio();
        radBtn1.addActionListener(accion);
        radBtn2.addActionListener(accion);
        radBtn3.addActionListener(accion);
        radBtn4.addActionListener(accion);
        laminaRadBtn.add(radBtn1);
        laminaRadBtn.add(radBtn2);
        laminaRadBtn.add(radBtn3);
        laminaRadBtn.add(radBtn4);
        add(laminaRadBtn, BorderLayout.SOUTH);
    }
    
    private class EventoRadio implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == radBtn1) {
                texto.setFont(new Font("Serif", Font.PLAIN, 8));
            } else if (e.getSource() == radBtn2) {
                texto.setFont(new Font("Serif", Font.PLAIN, 14));
            } else if (e.getSource() == radBtn3) {
                texto.setFont(new Font("Serif", Font.PLAIN, 26));
            } else if (e.getSource() == radBtn4) {
                texto.setFont(new Font("Serif", Font.PLAIN, 42));
            }
        }
    }
    
    private JLabel texto;
    private JRadioButton radBtn1, radBtn2, radBtn3, radBtn4;
}
