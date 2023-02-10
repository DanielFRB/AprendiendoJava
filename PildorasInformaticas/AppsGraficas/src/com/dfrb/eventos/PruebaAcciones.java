package com.dfrb.eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaAcciones {
    public static void main(String[] args) {
        MarcoAccion miMarco = new MarcoAccion();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoAccion extends JFrame {
    public MarcoAccion() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Prueba de Multiples Fuentes de Eventos");
        PanelAccion miLamina = new PanelAccion();
        add(miLamina);
    }
}

class PanelAccion extends JPanel {    
    public PanelAccion() {
        AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/images/bolaAmarilla.gif"), Color.YELLOW);
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/images/bolaAzul.gif"), Color.BLUE);
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/images/bolaRoja.gif"), Color.RED);
        
        btnAmarillo = new JButton(accionAmarillo);
        btnAzul = new JButton(accionAzul);
        btnRojo = new JButton(accionRojo);
        add(btnAmarillo); // Parametro del constructor recibe una Accion
        add(btnAzul);
        add(btnRojo);
        
        // Crear Mapa de entrada
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        
        // Crear combinacion de teclas - Guardar combinacion de teclas
        KeyStroke tclAmarillo = KeyStroke.getKeyStroke("ctrl A");
        KeyStroke tclAzul = KeyStroke.getKeyStroke("ctrl U");
        KeyStroke tclRojo = KeyStroke.getKeyStroke("ctrl R");
        
        // Asignar Combinacion de teclas a objetos
        mapaEntrada.put(tclAmarillo, "fondoAmarillo");
        mapaEntrada.put(tclAzul, "fondoAzul");
        mapaEntrada.put(tclRojo, "fondoRojo");
        
        // Asignar objeto a la accion
        ActionMap mapaAccion = getActionMap();
        mapaAccion.put("fondoAmarillo", accionAmarillo);
        mapaAccion.put("fondoAzul", accionAzul);
        mapaAccion.put("fondoRojo", accionRojo);
    }
    
    private class AccionColor extends AbstractAction {
        public AccionColor(String nombre, Icon icono, Color colorBoton) {
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color "+ nombre);
            putValue("ColorFondo", colorBoton);
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("ColorFondo");
            setBackground(c);
            System.out.println("Color: "+ getValue(Action.NAME));
            System.out.println("Descripcion: "+ getValue(Action.SHORT_DESCRIPTION));
        }
}
    
    JButton btnAmarillo;
    JButton btnAzul;
    JButton btnRojo;
}

