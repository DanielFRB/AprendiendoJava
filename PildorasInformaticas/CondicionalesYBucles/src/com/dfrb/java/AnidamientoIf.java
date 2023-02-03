package com.dfrb.java;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class AnidamientoIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero, por favor ");
        int numero = entrada.nextInt();
        if (numero == 0) {
            System.out.println("El numero es igual a cero");
        } else {
            // Anidamiento o nesting de la sentencia if
            if (numero > 0) {
                System.out.println("El numero es positivo");
            } else {
                System.out.println("El numero es negativo");
            }
        }
    }
}
