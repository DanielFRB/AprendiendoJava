package com.dfrb.java;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class Entrada_Datos1 {
    public static void main(String[] args) {
        String linea;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe algo: ");
        linea = entrada.nextLine();
        System.out.println("Tu escribiste: " + linea);
        System.out.print("Escribe algo adicional: ");
        linea = entrada.nextLine();
        System.out.println("Tu tambien dijiste esto: " + linea);
    }
}
