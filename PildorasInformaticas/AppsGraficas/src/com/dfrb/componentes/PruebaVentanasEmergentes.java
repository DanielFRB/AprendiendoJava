package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaVentanasEmergentes {
    public static void main(String[] args) {
        MarcoCuadroDialogo miMarco = new MarcoCuadroDialogo();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoCuadroDialogo extends JFrame {
    public MarcoCuadroDialogo() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setTitle("Ventanas Emergentes: Cuadros de Dialogo");
        LaminaCuadroDialogo miLamina = new LaminaCuadroDialogo();
        add(miLamina);
    }
}

class LaminaCuadroDialogo extends JPanel {
    public LaminaCuadroDialogo() {
        btn01 = new JButton("Boton 1");
        btn02 = new JButton("Boton 2");
        btn03 = new JButton("Boton 3");
        btn04 = new JButton("Boton 4");
        btn01.addActionListener(new AccionBoton());
        btn02.addActionListener(new AccionBoton());
        btn03.addActionListener(new AccionBoton());
        btn04.addActionListener(new AccionBoton());
        add(btn01);
        add(btn02);
        add(btn03);
        add(btn04);
    }
    
    private class AccionBoton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btn01) {
                System.out.println("Has pulsado en boton 1");
                // JOptionPane.showMessageDialog(LaminaCuadroDialogo.this, "Saludos, Mensaje de Prueba");
                JOptionPane.showMessageDialog(LaminaCuadroDialogo.this, "Saludos", "Advertencia", 0);
            } else if (e.getSource() == btn02) {
                System.out.println("Has pulsado en boton 2");
                JOptionPane.showInputDialog(LaminaCuadroDialogo.this, "Ingrese su Nombre", "Escriba sus Datos", 2);
            } else if (e.getSource() == btn03) {
                System.out.println("Has pulsado en boton 3");
                JOptionPane.showConfirmDialog(LaminaCuadroDialogo.this, "Elige una Opcion", "Confirmar", 1);
            } else  {
                System.out.println("Has pulsado en boton 4");
                JOptionPane.showOptionDialog(LaminaCuadroDialogo.this, "Elige", "Opciones", 1, 1, null, null, null);
            }
        }
    }
    
    private JButton btn01, btn02, btn03, btn04;
}
