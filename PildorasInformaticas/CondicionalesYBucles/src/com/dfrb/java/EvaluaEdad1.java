package com.dfrb.java;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class EvaluaEdad1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu edad, por favor ");
        int edad = entrada.nextInt();
        if (edad < 18) {
            System.out.println("Eres un menor de edad.");
        } else if (edad < 40) {
            System.out.println("Eres un adulto joven.");
        } else if (edad < 65) {
            System.out.println("Eres un adulto maduro.");
        } else {
            System.out.println("Eres un adulto mayor, cuidate.");
        }
    }
}
