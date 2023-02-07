package com.dfrb.java;

import java.util.Stack;

/**
 * @author dfrb@ne
 */

public class StrInvert {
    public static void main(String[] args) {
        // Invertir una cadena de texto usando el metodo reverse() de la Clase StringBuilder
        System.out.println("Invertir Cadenas de Caracteres");
        System.out.println("1ra Forma: Usando el metodo reverse() de la Clase StringBuilder.");
        
        String cadena = "HolaMundoSinEspacios";
        
        System.out.println(cadena);
        StringBuilder strb = new StringBuilder(cadena);
        String cadenaInvertida = strb.reverse().toString();
        System.out.println(cadenaInvertida);
        
        // Utilizando un Bucle While y codigo personalizado
        System.out.println("2da Forma: Utilizando un Bucle While y codigo personalizado.");
        
        String cadena1 = cadena;
        
        System.out.println(cadena1);
        char[] arregloCaracter = cadena1.toCharArray();
        int inicio = 0;
        int fin = arregloCaracter.length - 1;
        char temporal;
        while (fin > inicio) {
            temporal = arregloCaracter[inicio];
            arregloCaracter[inicio] = arregloCaracter[fin];
            arregloCaracter[fin] = temporal;
            fin--;
            inicio++;
        }
        String cadena1Invertida = new String(arregloCaracter);
        System.out.println(cadena1Invertida);
        
        // Usando un Bucle for y el Metodo append() de la Clase StringBuilder
        System.out.println("3ra Forma: Usando un Bucle for y el metodo append() de la Clase StringBuilder");
        
        String cadena2 = cadena;
        
        System.out.println(cadena2);
        StringBuilder cadena2Invertida = new StringBuilder();
        for (int i = (cadena2.length() - 1); i >= 0; i--) {
            cadena2Invertida.append(cadena2.charAt(i));
        }
        System.out.println(cadena2Invertida);
        
        // Usando una funcion recursiva
        System.out.println("4ra Forma: Usando una funcion recursiva.");
        
        String cadena3 = cadena;
        
        System.out.println(cadena3);
        String cadena3Invertida = funcionCadenaInvertida(cadena3, cadena3.length() - 1);
        System.out.println(cadena3Invertida);
        
        //Usando la Clase Stack
        System.out.println("5ta Forma: Usando la Clase Stack.");
        
        String cadena4 = cadena;
        
        System.out.println(cadena4);
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < cadena4.length(); i++) {
            stack.push(cadena4.charAt(i));
        }
        
        StringBuilder cadena4Invertida = new StringBuilder();
        while (!stack.empty()) {
            cadena4Invertida.append(stack.pop());
        }
        System.out.println(cadena4Invertida);
    }
    
    // Funcion recursiva que permite la inversion de un String
    private static String funcionCadenaInvertida(String str, int indice) {
        if (indice == 0) {
            return str.charAt(0) + "";
        }
        char letra = str.charAt(indice);
        return letra + funcionCadenaInvertida(str, indice - 1);
    }
}
