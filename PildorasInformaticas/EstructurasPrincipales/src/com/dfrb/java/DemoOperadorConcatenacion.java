package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class DemoOperadorConcatenacion {
    public static void main(String[] args) {
        // Programa que muestra el funcionamiento del operador de concatenacion +
        System.out.println("Ejemplo de como funciona el operador de contatenacion +.");
        String ruler1 = "1";
        String ruler2 = ruler1 + " 2 " + ruler1;
        String ruler3 = ruler2 + " 3 " + ruler2;
        String ruler4 = ruler3 + " 4 " + ruler3;
        String ruler5 = ruler4 + " 5 " + ruler4;
        System.out.println(ruler1);
        System.out.println(ruler2);
        System.out.println(ruler3);
        System.out.println(ruler4);
        System.out.println(ruler5);
    }
}
