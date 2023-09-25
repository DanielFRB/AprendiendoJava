package com.dfrb.pruebas;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class LetrasColumnasExcel_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> letrasExcel = new ArrayList<>();
        System.out.println("Programa que genera las letras de columnas de Excel a partir de numeros enteros");
        System.out.println("Ingrese un numero mayor que 0: ");
        int numero = in.nextInt();
        if (numero != 0) {
            if (numero < 0) {
                System.out.println("Usted ha introducido un numero negativo. Adios...");
                System.exit(0);
            }
            int limite = (int) numero / dameAbecedario().length();
            if (limite > 27) {
                System.out.println("Numero fuera de rango de columnas de Excel, intente otro numero mas bajo");
            } else {
                for (int i = 0; i < numero; i++) {
                    letrasExcel.add(devuelveLetras(i));
                }
                System.out.println("Las Letras correspondientes a las columnas de Excel son: ");
                letrasExcel.forEach((n) -> System.out.print(" "+ n));
                System.out.println("");
            }
        } else {
            System.out.println("Usted ha introducido el numero cero. Adios...");
        }
        in.close();
    }
    
    private static String devuelveLetras(int n) {
        String alfabeto = dameAbecedario();
        int numeroLetras = alfabeto.length();
        int res = n % 26;
        int coc = (int) n / numeroLetras;
        
        if (coc == 0) {
            return String.valueOf( alfabeto.charAt(res));
        } else {
            return String.valueOf(alfabeto.charAt(coc - 1)) + String.valueOf(alfabeto.charAt(res));
        }
    }
    
    private static String dameAbecedario() {
        char[] abc = new char[26];
        abc[0] = 'A';
        for (int i = 1; i < 26; i++) {
            abc[i] = (char) ('A' + i);
        }
        return new String(abc);
    }
}
