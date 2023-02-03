package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class ArraysBidimencional {
    public static void main(String[] args) {
        int[][] matrix = new int[4][5];
        
        matrix[0][0] = 45;
        matrix[0][1] = 25;
        matrix[0][2] = 15;
        matrix[0][3] = -5;
        matrix[0][4] = 65;
        
        matrix[1][0] = 23;
        matrix[1][1] = 21;
        matrix[1][2] = 18;
        matrix[1][3] = -51;
        matrix[1][4] = 61;
        
        matrix[2][0] = 41;
        matrix[2][1] = 10;
        matrix[2][2] = -8;
        matrix[2][3] = -23;
        matrix[2][4] = 98;
        
        matrix[3][0] = 49;
        matrix[3][1] = 28;
        matrix[3][2] = 11;
        matrix[3][3] = -58;
        matrix[3][4] = 99;
        
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] +" ");
            }
        }
    }
}
