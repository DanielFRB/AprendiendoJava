package com.dfrb.java;

import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class CreandoMarcos2 {
    public static void main(String[] args) {
        Marco2 marco1 = new Marco2();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Marco2 extends JFrame {
    public Marco2() {
        //setSize(500, 300); // Metodo del ejemplo anterior
        //setLocation(500, 300); Remplazado por setBounds
        setBounds(500, 300, 500, 300);
        // setResizable(false); en false, impide que la ventana pueda cambiar de tamaño
        // setExtendedState(MAXIMIZED_BOTH); abre ventana maximizada.
        setTitle("Mi Ventana");
    }
}
