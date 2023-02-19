package com.dfrb.componentes;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaDisposicionAvanzada2 {
    public static void main(String[] args) {
        MarcoDisposicionAvanzadas2 miMarco = new MarcoDisposicionAvanzadas2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoDisposicionAvanzadas2 extends JFrame {
    public MarcoDisposicionAvanzadas2() throws HeadlessException {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        setBounds(200, 250, 1000, 350);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setTitle("Disposiciones Avanzadas II: Spring");
        LaminaDisposicionAvanzadas2 miLamina = new LaminaDisposicionAvanzadas2();
        add(miLamina);
    }
}

class LaminaDisposicionAvanzadas2 extends JPanel {
    public LaminaDisposicionAvanzadas2() {
        JButton btn01 = new JButton("boton 1");
        JButton btn02 = new JButton("boton 2");
        JButton btn03 = new JButton("boton 3");
        SpringLayout layout = new SpringLayout();
        setLayout(layout);
        add(btn01);
        add(btn02);
        add(btn03);
        Spring muelle = Spring.constant(0, 10, 100);
        layout.putConstraint(SpringLayout.WEST, btn01, muelle, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.WEST, btn02, muelle, SpringLayout.EAST, btn01);
        layout.putConstraint(SpringLayout.WEST, btn03, muelle, SpringLayout.EAST, btn02);
        layout.putConstraint(SpringLayout.EAST, this, muelle, SpringLayout.EAST, btn03);
    }
}
