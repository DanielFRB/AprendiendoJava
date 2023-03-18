package com.dfrb.arreglosyvectores;

import java.io.*;

/**
 * @author dfrb@ne
 */

public class ArreglosInicial {
    public static void main(String [] a) throws IOException {
        final int NUM = 10;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int[] nums= new int[NUM];
        int total = 1;
        System.out.println("Por favor, introduzca "+ NUM +" datos");
        for (int i = 0; i < NUM; i++) {
            nums[i] = Integer.parseInt(entrada.readLine());
        }
        System.out.println("Lista de numeros: ");
        for (int i = 0; i < NUM; i++) {
            System.out.print(" " + nums[i]);
            total *= nums[i];
        }
        System.out.println("\nEl producto de los numeros es: "+ total);
    }
}
