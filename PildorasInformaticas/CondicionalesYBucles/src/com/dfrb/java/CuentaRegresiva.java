package com.dfrb.java;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class CuentaRegresiva {
    public static void main(String[] args) {
        System.out.println("Cuenta Regresiva");
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingresa un numero, por favor");
        if (!ent.hasNextInt()) {
            String palabra = ent.next();
            System.err.println(palabra +" no es un numero");
            return;
        }
        int numero = ent.nextInt();
        while (numero > 0) {
            System.out.println(numero);
            numero = numero - 1;
        }
        System.out.println("Terminamos....");
    }
}
