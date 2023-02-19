package com.dfrb.componentes;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaDisposicionAvanzada3 {
    public static void main(String[] args) {
        MarcoMuelle2 miMarco = new MarcoMuelle2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoMuelle2 extends JFrame {
    public MarcoMuelle2() throws HeadlessException {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        setBounds(200, 250, 700, 350);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setTitle("Disposiciones Avanzadas III: Spring (Muelles) - Continuacion");
        LaminaMuelle2 miLamina = new LaminaMuelle2();
        add(miLamina);
    }
}

class LaminaMuelle2 extends JPanel {
    public LaminaMuelle2() {
        JButton btn01 = new JButton("boton 1");
        JButton btn02 = new JButton("boton 2");
        JButton btn03 = new JButton("boton 3");
        SpringLayout layout = new SpringLayout();
        setLayout(layout);
        add(btn01);
        add(btn02);
        add(btn03);
        Spring muelle = Spring.constant(0, 10, 100);
        // ------------------------------------------------------- Nuevo Codigo ---------------------------------------------
        Spring muelleRigido = Spring.constant(80);
        // -------------------------------------------------------------------------------------------------------------------------
        layout.putConstraint(SpringLayout.WEST, btn01, muelle, SpringLayout.WEST, this);
        // ---------------------------------------------------- Cambio de Muelle -------------------------------------------
        layout.putConstraint(SpringLayout.WEST, btn02, muelleRigido, SpringLayout.EAST, btn01);
        layout.putConstraint(SpringLayout.WEST, btn03, muelleRigido, SpringLayout.EAST, btn02);
        // -------------------------------------------------------------------------------------------------------------------------
        layout.putConstraint(SpringLayout.EAST, this, muelle, SpringLayout.EAST, btn03);
    }
}
