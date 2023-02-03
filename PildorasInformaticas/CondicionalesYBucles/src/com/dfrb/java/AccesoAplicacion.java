package com.dfrb.java;

import javax.swing.JOptionPane;

/**
 * @author dfrb@ne
 */

public class AccesoAplicacion {
    public static void main(String[] args) {
        String clave = "Daniel";
        String pass = "";
        while (clave.equals(pass) == false) {
            pass = JOptionPane.showInputDialog("Introduce tu contraseña, por favor");
            if (clave.equals(pass) == false) {
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Bienvenido, contraseña corecta!!!");
    }
}
