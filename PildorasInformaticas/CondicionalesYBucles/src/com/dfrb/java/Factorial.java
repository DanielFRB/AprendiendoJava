package com.dfrb.java;

import javax.swing.JOptionPane;

/**
 * @author dfrb@ne
 */

public class Factorial {
    public static void main(String[] args) {
        int resultado = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        for (int i = numero; i > 0; i--) {
            resultado = resultado * i;
        }
        System.out.println("El factorial del numero "+ numero +" es = "+ resultado);
    }
}
