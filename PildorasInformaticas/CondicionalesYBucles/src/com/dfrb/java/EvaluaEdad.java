package com.dfrb.java;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class EvaluaEdad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu edad, por favor ");
        int edad = entrada.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}
