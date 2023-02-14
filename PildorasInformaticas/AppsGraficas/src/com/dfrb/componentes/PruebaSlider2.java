package com.dfrb.componentes;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * @author dfrb@ne
 */

public class PruebaSlider2 {
    public static void main(String[] args) {
        MarcoSlider2 miMarco = new MarcoSlider2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoSlider2 extends JFrame {
    public MarcoSlider2() {
        setTitle("Prueba Nro 2 con JSlider y Evento Asociado");
        setBounds(500, 280, 700, 350);
        LaminaSlider2 miLamina = new LaminaSlider2();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaSlider2 extends JPanel {
    public LaminaSlider2() {
        setLayout(new BorderLayout());
        rotulo = new JLabel("En un lugar de la Mancha...");
        //Font miLetra = new Font("Serif", Font.PLAIN, 18);
        //rotulo.setFont(miLetra);
        JPanel laminaRotulo = new JPanel();
        laminaRotulo.add(rotulo);
        add(laminaRotulo, BorderLayout.CENTER);
        miSlider = new JSlider(8, 50, 12);
        miSlider.setMajorTickSpacing(20);
        miSlider.setMinorTickSpacing(5);
        miSlider.setPaintTicks(true);
        miSlider.setPaintLabels(true);
        miSlider.setFont(new Font("Serif", Font.ITALIC, 12));
        miSlider.addChangeListener(new EventoSlider());
        JPanel laminaSlider = new JPanel();
        laminaSlider.add(miSlider);
        add(laminaSlider, BorderLayout.SOUTH);
    }
    
    private class EventoSlider implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            rotulo.setFont(new Font("Serif", Font.PLAIN, miSlider.getValue()));
        }
    }
    
    private JLabel rotulo;
    private JSlider miSlider;
}
