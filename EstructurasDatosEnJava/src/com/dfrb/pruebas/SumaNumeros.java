package com.dfrb.pruebas;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class SumaNumeros {
    public static void main(String[] args) {
        int n, suma;
        Scanner numero = new Scanner(System.in);
        System.out.println("Programa que genera la suma de los digitos de un numero entero.");
        System.out.println("Ingrese un numero: ");
        n = numero.nextInt();
        suma = sumaDeDigitos(n);
        if (suma < 0) {
            System.out.println("El numero es menor que 0");
        } else {
            System.out.println("La Suma de los digitos del mumero "+ n +" es: "+ suma);
        }
    }
    
    public static int sumaDeDigitos(int n) {
        if (n < 0) {
            return -1;
        }
        int sum = 0;
        while (n > 0) {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
