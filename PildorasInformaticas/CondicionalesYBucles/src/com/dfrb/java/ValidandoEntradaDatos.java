package com.dfrb.java;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class ValidandoEntradaDatos {
    public static void main(String[] args) {
        System.out.println("Calculo del logaritmo base 10 de un numero.");
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduzca un numero, por favor");
        if (!ent.hasNextDouble()) { // Esta condicion evalua si lo que se escribio fue un numero de tipo double
            String palabra = ent.next();
            System.err.println(palabra +" no es un numero");
            return; // Permite finalizar el programa para evitar la aparicion de errores en tiempo de ejecucion
        }
        double x = ent.nextDouble();
        if (x <= 0.0) { // Verifica si el numero es menor que 0 debido a que los logaritmos se basan en numeros positivos mayores que 0
            System.err.println("Error: el numero debe ser positivo");
            return; // Finaliza la ejecucion del programa
        }
        double logaritmo = Math.log10(x);
        System.out.printf("El logaritmo base 10 del numero es = %.4f\n", logaritmo);
    }
}
