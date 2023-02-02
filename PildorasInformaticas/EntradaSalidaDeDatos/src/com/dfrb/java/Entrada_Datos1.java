package com.dfrb.java;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class Entrada_Datos1 {
    public static void main(String[] args) {
        String linea;
        Scanner entradaDatos = new Scanner(System.in);
        System.out.print("Escribe algo: ");
        linea = entradaDatos.nextLine();
        System.out.println("Tu escribiste: " + linea);
        System.out.print("Escribe algo adicional: ");
        linea = entradaDatos.nextLine();
        System.out.println("Tu tambien dijiste esto: " + linea);
    }
}
