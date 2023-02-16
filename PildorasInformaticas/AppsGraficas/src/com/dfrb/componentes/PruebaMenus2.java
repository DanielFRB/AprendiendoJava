package com.dfrb.componentes;

import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaMenus2 {
    public static void main(String[] args) {
        MarcoMenus2 miMarco = new MarcoMenus2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoMenus2 extends JFrame {
    public MarcoMenus2() {
        setTitle("Prueba de Menus con Iconos");
        setBounds(500, 280, 600, 350);
        LaminaMenus2 miLamina = new LaminaMenus2();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaMenus2 extends JPanel {
    public LaminaMenus2() {
        JMenuBar miMenuBar = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");
        JMenu herramientas = new JMenu("Herramientas");
        JMenu opciones = new JMenu("Opciones");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarAs = new JMenuItem("Guardar Como");
        JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon("src/images/copiar.png"));
        JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon("src/images/cortar.png"));
        JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon("src/images/pegar.png"));
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
