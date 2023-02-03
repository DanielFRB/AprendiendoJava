package com.dfrb.java;

import javax.swing.JOptionPane;

/**
 * @author dfrb@ne
 */

public class UsoArrays_3 {
    public static void main(String[] args) {
        String[] paises = new String[8];
        int contador = 0;
        for (int i = 0; i < paises.length; i++) {
            paises[i] = JOptionPane.showInputDialog("Introduce el Pais"+ (i+1));
            contador++;
        }
        for (String p : paises) {
            System.out.println("Pais "+ contador +": "+ p);
        }
    }
}
