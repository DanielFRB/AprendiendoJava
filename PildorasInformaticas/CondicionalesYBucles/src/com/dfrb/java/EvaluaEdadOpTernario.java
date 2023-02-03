package com.dfrb.java;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class EvaluaEdadOpTernario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu edad, por favor ");
        int edad = entrada.nextInt();
        
        // La sensencia if-else se comenta para comprarar con el operador ternario 
        // lo que se resume en lineas de codigo, en este caso pasa de 4 lineas a 1 sola
        
        /** 
         *if (edad >= 18) {
         *    System.out.println("Eres mayor de edad.");
         *} else {
         *    System.out.println("Eres menor de edad.");
         *} 
         */ 
        
        System.out.println(edad >= 18 ? "Eres mayor de edad" : "Eres menor de edad");
    }
}
