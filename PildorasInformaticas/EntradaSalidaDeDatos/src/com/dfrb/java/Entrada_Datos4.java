package com.dfrb.java;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class Entrada_Datos4 {
    public static void main(String[] args) {
        String nombre;
        int edad;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Cual es tu nombre? ");
        nombre = in.nextLine();
        System.out.print("Cual es tu edad? ");
        edad = in.nextInt();
        System.out.printf("Hola %s, tienes %d años\n", nombre, edad);
        System.out.println("------------");
        // Cuando lee un String seguida de un int, todo funciona bien. Pero cuando lees un int seguido de un String, sucede algo extraño.
        System.out.print("Cual es tu edad? ");
        edad = in.nextInt();
        System.out.print("Cual es tu nombre? ");
        nombre = in.nextLine();
        System.out.printf("Hola %s, tienes %d años\n", nombre, edad);
        System.out.println("------------");
        // Para solventar este problema se debe incluir un nextLine() adicional despues del nexInt()
        System.out.print("Cual es tu edad? ");
        edad = in.nextInt();
        in.nextLine();
        System.out.print("Cual es tu nombre? ");
        nombre = in.nextLine();
        System.out.printf("Hola %s, tienes %d años\n", nombre, edad);
    }
}
