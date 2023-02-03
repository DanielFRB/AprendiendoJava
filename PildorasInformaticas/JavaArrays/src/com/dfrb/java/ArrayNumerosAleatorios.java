package com.dfrb.java;

import java.util.Random;

/**
 * @author dfrb@ne
 */

public class ArrayNumerosAleatorios {
    public static void main(String[] args) {
        int size = 10;
        Random aleatorio = new Random();
        int[] arreglo = new int[size];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = aleatorio.nextInt(100);
        }
        System.out.print("{" + arreglo[0]);
        for (int i = 1; i < arreglo.length; i++) {
            System.out.print(", "+ arreglo[i]);
        }
        System.out.println("}");
    }
}
