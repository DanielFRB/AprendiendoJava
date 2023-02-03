package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class UsoArrays {
    public static void main(String[] args) {
        int[] mi_matriz = new int[5];
        
        mi_matriz[0] = 5;
        mi_matriz[1] = 25;
        mi_matriz[2] = -15;
        mi_matriz[3] = 35;
        mi_matriz[4] = 55;
        for (int i = 0; i < mi_matriz.length; i++) {
            System.out.println("Valor del indice "+ i +" = "+ mi_matriz[i]);
        }
        
        System.out.println("------------");
        int[] mi_matriz2 = {15, 25, 55, -65, 35, 23, 43, -54, 12, 50};
        for (int i = 0; i < mi_matriz2.length; i++) {
            System.out.println("Valor del indice "+ i +" = "+ mi_matriz2[i]);
        }
    }
}
