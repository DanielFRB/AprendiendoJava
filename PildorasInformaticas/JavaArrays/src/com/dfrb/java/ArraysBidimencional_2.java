package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class ArraysBidimencional_2 {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 15, 21, 5, 8},
            {12, 18, 29, 56, 85},
            {-11, 12, 27, 35, -28},
            {-2, 16, -40, 41, 19}
        };
        
        for (int[] fila : matrix) {
            System.out.println();
            for (int z : fila) {
                System.out.print(z +" ");
            }
        }
    }
}
