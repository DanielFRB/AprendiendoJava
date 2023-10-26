package com.dfrb.arreglosyvectores;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class DemoCalcAverageUsingArrays {
    public static void main(String[] args) {
        // 1. Calculo de Promedio usando Arrays
        int[] arrayInt = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int lengthArrayInt = arrayInt.length;
        int sumArrayInt = 0;
        for (int i = 0; i < lengthArrayInt; i++) {
            sumArrayInt += arrayInt[i];
        }
        double promArrayInt = sumArrayInt / lengthArrayInt;
        System.out.println("El Promedio del Array es: "+ promArrayInt);
        
        //2. Calculo del Promedio de numeros ingresados por el usuario
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el Tamaño del Array: ");
        int sizeArray = s.nextInt();
        int[] arrayInt2 = new int[sizeArray];
        System.out.println("Ingrese los Valores del Array: ");
        for (int i = 0; i < sizeArray; i++) {
            int valor = s.nextInt();
            arrayInt2[i] = valor;
        }
        int lengthArrayInt2 = arrayInt2.length;
        int sumArrayInt2 = 0;
        for (int i = 0; i < lengthArrayInt2; i++) {
            sumArrayInt2 += arrayInt2[i];
        }
        double promArrayInt2 = sumArrayInt2 / lengthArrayInt2;
        System.out.println("El Promedio del Array es: "+ promArrayInt2);
    }
}
