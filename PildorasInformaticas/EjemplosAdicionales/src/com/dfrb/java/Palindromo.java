package com.dfrb.java;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class Palindromo {
    public static void main(String[] args) {
        System.out.println("1er Palindromo: Solo reconoce palabras simples.");
        System.out.println("Ingrese la palabra a evaluar: ");
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.nextLine(); // Lectura de la palabra introducida por el usuario
        char[] arrayCaracteres = palabra.toCharArray(); // Se convierte a un arreglo de caracteres
        char[] nuevoArrayCaracteres = new char[arrayCaracteres.length]; // Se define un nuevo array de caracteres con la longitud del primer array
        int n = 0;
        for (int i = arrayCaracteres.length; i > 0; i--) {
            nuevoArrayCaracteres[n] = arrayCaracteres[i-1]; // Se invierte el arreglo Original
            n++;
        }
        
        String nuevaPalabra = new String(nuevoArrayCaracteres); // Se convierte el nuevo arreglo de caracteres invertido a String
        if (palabra.equalsIgnoreCase(nuevaPalabra)) {
            System.out.println("Es Palindromo");
        } else {
            System.out.println("No es Palindromo");
        }
        
        System.out.println("2do Palindromo: Reconoce frases simples acentuadas o no.");
        System.out.println("Ingrese la frase a evaluar: ");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        if (esPalindromo(eliminarAcentos(compactarFrase(frase)))) {
            System.out.println("La frase SI es Palindroma");
        } else {
            System.out.println("La frase NO es Palindroma");
        }
        
        System.out.println("3er Palindromo: Usando una funcion recursiva.");
        if (checkPalindromo(eliminarAcentos(compactarFrase(frase)))) {
           System.out.println("La frase SI es Palindroma");
        } else {
            System.out.println("La frase NO es Palindroma");
        }
    }
    
    private static String compactarFrase(String frase) {
        frase = frase.toLowerCase(); // Transforma la frase toda en minusculas
        String fraseCompacta = "";
        for (int i = 0; i < frase.length(); i++) {
            if (!(frase.substring(i, i+1).equals(" ") || frase.substring(i, i+1).equals(",") 
                || frase.substring(i, i+1).equals(".") || frase.substring(i, i+1).equals("¿")
                || frase.substring(i, i+1).equals("?") || frase.substring(i, i+1).equals("¡")
                || frase.substring(i, i+1).equals("!"))) {
                fraseCompacta += frase.substring(i, i+1);// frase compactada sin espacios o caracteres especiales
            }
        }
        return fraseCompacta;
    }
    
    private static String eliminarAcentos(String frase) {
        final String ORIGINAL = "áéíóú";
        final String REEMPLAZO = "aeiou";
        char[] array = frase.toCharArray();
        for (int i = 0; i < array.length; i++) {
            int pos = ORIGINAL.indexOf(array[i]);
            if (pos > -1) {
                array[i] = REEMPLAZO.charAt(pos);
            }
        }
        return new String(array); // Retorna la frase sin acentos
    }
    
    private static boolean esPalindromo(String frase) {
        for (int i = 0, j = frase.length()-1; i <= j; i++, j--) {
            if (frase.charAt(i) != frase.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    
    // Funcion booleana recursiva que verifica si la frase es Palindromo o no
    private static boolean checkPalindromo(String frase) {
        if(frase.length() == 0 || frase.length() == 1) {
            return true; 
        }
        if(frase.charAt(0) == frase.charAt(frase.length()-1)) {
            return checkPalindromo(frase.substring(1, frase.length()-1));
        }
        return false;
    }
}
