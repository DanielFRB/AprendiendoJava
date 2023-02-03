package com.dfrb.java;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class EvaluaEdad1OpTernario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu edad, por favor ");
        int edad = entrada.nextInt();
        // Recurrimos al anidamiento o nesting del Operador Ternario para cumplir con la instruccion del programa
        // Al final se ejecuta una sola instruccion que es System.out.println()
        System.out.println(edad < 18 ? "Eres un menor de edad" // if (edad < 18) ... Eres un menor de edad
                                                    : edad < 40 ? "Eres un adulto joven" // else if (edad < 40) ... Eres un adulto joven
                                                                      : edad < 65 ? "Eres un adulto maduro" // else if (edad < 65) ... Eres un adulto maduro
                                                                                        : "Eres un adulto mayor, cuidate"); // else ... Eres un adulto mayor, cuidate
    }
}
