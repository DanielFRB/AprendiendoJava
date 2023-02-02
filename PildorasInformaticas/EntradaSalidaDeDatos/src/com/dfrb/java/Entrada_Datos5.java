package com.dfrb.java;

import javax.swing.JOptionPane;

/**
 * @author dfrb@ne
 */

public class Entrada_Datos5 {
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = JOptionPane.showInputDialog("Dinos tu nombre");
        String edad = JOptionPane.showInputDialog("Dinos tu edad");
        System.out.println("Hola "+ nombre +" el año que viene tendras "+ (edad+1) +" años");
        int edad_usuario = Integer.parseInt(edad); // Se utiliza el metodo parseInt() de la Clase Integer para convertir el String a int
        System.out.println("Hola "+ nombre +" el año que viene tendras "+ (edad_usuario + 1) +" años");
    }
}
