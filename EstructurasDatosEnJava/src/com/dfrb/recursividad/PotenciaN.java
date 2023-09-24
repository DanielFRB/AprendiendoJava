package com.dfrb.recursividad;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class PotenciaN {
    public static void main(String[] args) {
        int x, n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculo de la Potencia 'n' de un numero 'x'.");
        System.out.println("Ingrese un numero base 'x': ");
        x = entrada.nextInt();
        System.out.println("Ingrese un numero exponente 'n': ");
        n = entrada.nextInt();
        System.out.println("La "+ n +" potencia del numero "+ x +" es: "+ potencia(x,n));
    }
    
    private static int potencia (int x, int n) {
        int aux;
        if (n == 0) {
            return 1;
        } else {
            aux = potencia(x, n/2);
            if (n%2 == 0) {
                return aux * aux;
            } else {
                return x * aux * aux;
            }
        }
    }
}
