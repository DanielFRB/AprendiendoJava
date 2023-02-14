package com.dfrb.componentes;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaMenus {
    public static void main(String[] args) {
        MarcoMenus miMarco = new MarcoMenus();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoMenus extends JFrame {
    public MarcoMenus() {
        setTitle("Prueba con Menus");
        setBounds(500, 280, 600, 350);
        LaminaMenus miLamina = new LaminaMenus();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaMenus extends JPanel {
    public LaminaMenus() {
        JMenuBar miMenuBar = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");
        JMenu herramientas = new JMenu("Herramientas");
        JMenu opciones = new JMenu("Opciones");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarAs = new JMenuItem("Guardar Como");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem pegar = new JMenuItem("Pegar");
        JMenuItem generales = new JMenuItem("Generales");
        JMenuItem opcion1 = new JMenuItem("Opcion 1");
        JMenuItem opcion2 = new JMenuItem("Opcion 2");
        archivo.add(guardar);
        archivo.add(guardarAs);
        edicion.add(copiar);
        edicion.add(cortar);
        edicion.add(pegar);
        edicion.addSeparator();
        opciones.add(opcion1);
        opciones.add(opcion2);
        edicion.add(opciones);
        herramientas.add(generales);
        miMenuBar.add(archivo);
        miMenuBar.add(edicion);
        miMenuBar.add(herramientas);
        add(miMenuBar);
    }
}
