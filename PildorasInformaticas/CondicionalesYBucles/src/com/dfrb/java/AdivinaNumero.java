package com.dfrb.java;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class AdivinaNumero {
    public static void main(String[] args) {
        int aleatorio = (int) (Math.random() * 100);
        Scanner ent = new Scanner(System.in);
        System.out.println("Adivina el numero...");
        int numero = 0;
        int intentos = 0;
        while (numero != aleatorio) {
            System.out.println("Ingresa un numero, por favor");
            intentos++;
            numero = ent.nextInt();
            if (aleatorio < numero) {
                System.out.println("El numero introducido es mayor, intenta de nuevo...");
            } else if (aleatorio > numero) {
                System.out.println("El numero introducido es menor, intenta de nuevo...");
            }
        }
        System.out.println("Haz adivinado el numero en "+ intentos +" intentos");
    }
}
