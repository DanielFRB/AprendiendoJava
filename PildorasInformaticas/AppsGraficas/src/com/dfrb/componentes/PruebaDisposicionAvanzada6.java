package com.dfrb.componentes;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaDisposicionAvanzada6 {
    public static void main(String[] args) {
        MarcoDispoLibre3 miMarco = new MarcoDispoLibre3();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoDispoLibre3 extends JFrame {
    public MarcoDispoLibre3() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setTitle("Disposiciones Avanzadas VI: Disposiciones Libres III - Modificando Clase que implementa la interface LayoutManager");
        LaminaDispoLibre3 miLamina = new LaminaDispoLibre3();
        add(miLamina);
    }
}

class LaminaDispoLibre3 extends JPanel {
    public LaminaDispoLibre3() {
        setLayout(new EnColumnas());
        JLabel lblNombre = new JLabel("Nombre");
        JLabel lblApellido = new JLabel("Apellido");
        JLabel lblEdad = new JLabel("Edad");
        JLabel lblPhone = new JLabel("Telefono");
        JTextField txtNombre = new JTextField();
        JTextField txtApellido = new JTextField();
        JTextField txtEdad = new JTextField();
        JTextField txtPhone = new JTextField();
        add(lblNombre);
        add(txtNombre);
        add(lblApellido);
        add(txtApellido);
         add(lblEdad);
        add(txtEdad);
        add(lblPhone);
        add(txtPhone);
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
        int d = container.getWidth();
        x = d / 2;
        int contador = 0;
        int n = container.getComponentCount();
        for (int i = 0; i < n; i++) {
            contador++;
            Component c = container.getComponent(i);
            c.setBounds(x - 100, y, 100, 20);
            x += 100;
            if (contador % 2 == 0) {
                x = d / 2;
                y += 40;
            }
        }
    }
    
    private int x;
    private int y = 20;
}
