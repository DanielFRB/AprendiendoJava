package com.dfrb.pruebas;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class LetrasColumnasExcel {
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
            System.out.println("La Letra correspondiente  es: "+ letra);
            System.out.println("Adios...");
        } else {
            System.out.println("Usted ha introducido el numero cero. Adios...");
        }
        ent.close();
    }
    
    private static String devuelveLetra(int numero) {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int numLetras = abc.length();
        int residuo = numero % 26;
        int cociente = (int) numero / numLetras;
        switch (cociente) {
            case 0:
                return ""+ abc.charAt(residuo);
            case 1:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 2:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 3:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 4:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 5:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 6:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 7:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 8:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 9:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 10:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 11:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 12:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 13:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 14:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 15:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 16:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 17:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 18:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 19:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 20:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 21:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 22:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 23:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 24:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 25:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            case 26:
                return ""+ abc.charAt(cociente - 1) + abc.charAt(residuo);
            default:
                return "Fuera del rango de Columnas, intente un numero mas bajo";
        }
    }
}
