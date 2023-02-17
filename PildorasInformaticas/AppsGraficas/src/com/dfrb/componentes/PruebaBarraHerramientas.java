package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaBarraHerramientas {
    public static void main(String[] args) {
        MarcoBarraHerramientas miMarco = new MarcoBarraHerramientas();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoBarraHerramientas extends JFrame {
    public MarcoBarraHerramientas() throws HeadlessException {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setTitle("Prueba de Barras de Herramientas");
        miLamina = new JPanel();
        add(miLamina);
        
        Action accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/images/bolaAmarilla.gif"), Color.YELLOW);
        Action accionAzul = new AccionColor("Azul", new ImageIcon("src/images/bolaAzul.gif"), Color.BLUE);
        Action accionRojo = new AccionColor("Rojo", new ImageIcon("src/images/bolaRoja.gif"), Color.RED);
        Action accionSalir = new AbstractAction("Salir", new ImageIcon("src/images/cerrar.png")) {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }
        };
        
        JMenu menu = new JMenu("Color");
        menu.add(accionAmarillo);
        menu.add(accionAzul);
        menu.add(accionRojo);
        JMenuBar barraMenu = new JMenuBar();
        barraMenu.add(menu);
        setJMenuBar(barraMenu);
        JToolBar miBarra = new JToolBar();
        miBarra.add(accionAmarillo);
        miBarra.add(accionAzul);
        miBarra.add(accionRojo);
        miBarra.addSeparator();
        miBarra.add(accionSalir);
        add(miBarra, BorderLayout.NORTH);
    }
    
    private class AccionColor extends AbstractAction {
        public AccionColor(String nombre, Icon icono, Color color) {
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color "+ nombre);
            putValue("ColorFondo", color);
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("ColorFondo");
            miLamina.setBackground(c);
            System.out.println("Color: "+ getValue(Action.NAME));
            System.out.println("Descripcion: "+ getValue(Action.SHORT_DESCRIPTION));
        }
    }
    
    private JPanel miLamina;
}
