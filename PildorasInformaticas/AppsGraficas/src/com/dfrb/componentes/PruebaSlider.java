package com.dfrb.componentes;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaSlider {
    public static void main(String[] args) {
        MarcoSlider miMarco = new MarcoSlider();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoSlider extends JFrame {
    public MarcoSlider() {
        setTitle("Prueba con JSlider");
        setBounds(500, 280, 500, 350);
        LaminaSlider miLamina = new LaminaSlider();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaSlider extends JPanel {
    public LaminaSlider() {
        JSlider miSlider = new JSlider(0, 100, 50);
        miSlider.setMajorTickSpacing(25);
        miSlider.setMinorTickSpacing(5);
        miSlider.setFont(new Font("Serif", Font.ITALIC, 12));
        miSlider.setPaintTicks(true);
        miSlider.setPaintLabels(true);
        // miSlider.setSnapToTicks(true);
        add(miSlider);
    }
}
