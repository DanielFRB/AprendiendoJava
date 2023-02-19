package com.dfrb.componentes;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaDisposicionAvanzada5 {
    public static void main(String[] args) {
        MarcoDispoLibre2 miMarco = new MarcoDispoLibre2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoDispoLibre2 extends JFrame {
    public MarcoDispoLibre2() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setTitle("Disposiciones Avanzadas V: Disposiciones Libres II - Implementacion Interface LayoutManager");
        LaminaDispoLibre2 miLamina = new LaminaDispoLibre2();
        add(miLamina);
    }
}

class LaminaDispoLibre2 extends JPanel {
    public LaminaDispoLibre2() {
        setLayout(new EnColumnas());
        JLabel lblNombre = new JLabel("Nombre");
        JLabel lblApellido = new JLabel("Apellido");
        JLabel lblEdad = new JLabel("Edad");
        JTextField txtNombre = new JTextField();
        JTextField txtApellido = new JTextField();
        JTextField txtEdad = new JTextField();
        add(lblNombre);
        add(txtNombre);
        add(lblApellido);
        add(txtApellido);
         add(lblEdad);
        add(txtEdad);
    }
}

class EnColumnas implements LayoutManager {
    @Override
    public void addLayoutComponent(String name, Component comp) {
        
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        return null;
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        return null;
    }

    @Override
    public void layoutContainer(Container container) {
        int contador = 0;
        int n = container.getComponentCount();
        for (int i = 0; i < n; i++) {
            contador++;
            Component c = container.getComponent(i);
            c.setBounds(x, y, 100, 20);
            x += 100;
            if (contador % 2 == 0) {
                x = 20;
                y += 40;
            }
        }
    }
    
    private int x = 20;
    private int y = 20;
}
