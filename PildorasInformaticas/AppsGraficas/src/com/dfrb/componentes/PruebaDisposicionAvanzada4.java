package com.dfrb.componentes;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaDisposicionAvanzada4 {
    public static void main(String[] args) {
        MarcoDispoLibre miMarco = new MarcoDispoLibre();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoDispoLibre extends JFrame {
    public MarcoDispoLibre() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setTitle("Disposiciones Avanzadas IV: Disposiciones Libres");
        LaminaDispoLibre miLamina = new LaminaDispoLibre();
        add(miLamina);
    }
}

class LaminaDispoLibre extends JPanel {
    public LaminaDispoLibre() {
        setLayout(null);
        /* JButton btn01 = new JButton("Boton 1");
        JButton btn02 = new JButton("Boton 2");
        btn01.setBounds(50, 50, 120, 25);
        btn02.setBounds(550, 300, 120, 25);
        add(btn01);
        add(btn02); */
        JLabel lblNombre = new JLabel("Nombre");
        JLabel lblApellido = new JLabel("Apellido");
        JTextField txtNombre = new JTextField();
        JTextField txtApellido = new JTextField();
        lblNombre.setBounds(100, 50, 120, 20);
        txtNombre.setBounds(180, 50, 120, 20);
        lblApellido.setBounds(100, 100, 120, 20);
        txtApellido.setBounds(180, 100, 120, 20);
        add(lblNombre);
        add(lblApellido);
        add(txtNombre);
        add(txtApellido);
    }
}
