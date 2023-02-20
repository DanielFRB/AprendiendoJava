package com.dfrb.java;

import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class Fallos {
    public static void main(String[] args) {
        int[] miMatriz = new int[5];
        miMatriz[0] = 5;
        miMatriz[1] = 51;
        miMatriz[2] = 15;
        miMatriz[3] = 25;
        // miMatriz[4] = 17   ---> Error en tiempo de Compilacion: falta el ";" al final de la linea de codigo. El programa no compila ni se ejecuta.
        miMatriz[4] = 45;
        // miMatriz[5] = 21;  ---> Error en tiempo de Ejecucion: El programa compila sin error, pero al ejecutarse salta el error de tipo
        // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Posicion "+ i +" = "+ miMatriz[i]);
        }
        
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
        System.out.println("Hola "+ nombre +" tienes "+ edad +" años. "+"El programa termino su ejecución.");
    }
}
