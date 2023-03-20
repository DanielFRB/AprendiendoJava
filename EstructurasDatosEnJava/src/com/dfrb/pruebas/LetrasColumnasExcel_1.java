package com.dfrb.pruebas;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class LetrasColumnasExcel_1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Programa que genera las letras de columnas de Excel a partir de numeros enteros");
        System.out.println("Ingrese un numero mayor que 0: ");
        int n = ent.nextInt();
        if (n != 0) {
            if (n < 0) {
                System.out.println("Usted ha introducido un numero negativo. Adios...");
                System.exit(0);
            }
            String letra = devuelveLetra(n - 1);
            System.out.println("La Letra correspondiente es: "+ letra);
        } else {
            System.out.println("Usted ha introducido el numero cero. Adios...");
        }
    }
    
    private static String devuelveLetra(int numero) {
        String abc = dameAbecedario();
        int numLetras = abc.length();
        int residuo = numero % 26;
        int cociente = (int) numero / numLetras;
        if (cociente == 0) {
            return String.valueOf( abc.charAt(residuo));
        } else if (cociente > 26) {
            return "Numero fuera de rango de columnas de Excel, intente otro numero mas bajo";
        } else {
            return String.valueOf(abc.charAt(cociente - 1)) + abc.charAt(residuo);
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
