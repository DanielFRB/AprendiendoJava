package com.dfrb.java;

import javax.swing.JOptionPane;

/**
 * @author dfrb@ne
 */

public class PesoIdealDoWhile {
    public static void main(String[] args) {
        String sexo = "";
        do {
            sexo = JOptionPane.showInputDialog("Introduce tu sexo (H/M): ");
        } while (sexo.equalsIgnoreCase("H") == false && sexo.equalsIgnoreCase("M") == false);
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
        
        // Corrigiendo la formula dada en el curso de PildorasInformaticas y utilizando un Operador Ternario
        double pesoIdeal = sexo.equalsIgnoreCase("H") ? (altura - 100) - ((altura-150)/4) : (altura - 100) - ((altura-150)/2.5);
        System.out.println("Tu peso ideal es = "+ pesoIdeal);
    }
}
