package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class DemoOperacionesCadenasDos {
    public static void main(String[] args) {
        String frase = "La mejor manera de librarse de la tentación es caer en ella";
        String frase2 = frase.substring(0, 27);
        System.out.println(frase);
        System.out.println(frase2);
        System.out.println("Diferencia: "+ (frase.length() - frase2.length()));
        System.out.println("Frase original: "+ frase);
        System.out.println("Frase en Mayusculas: "+ frase.toUpperCase());
        System.out.println("Frase en Minusculas: "+ frase.toLowerCase());
        System.out.println("Frase en Mayusculas sin espacios: "+ frase.toUpperCase().replace(" ", ""));
        StringBuilder cadena = new StringBuilder(frase.toUpperCase().replace(" ", ""));
        String fraseInvertida = cadena.reverse().toString();
        System.out.println("Frase en Mayusculas sin espacios invertida: "+ fraseInvertida);
        System.out.println("Ejemplo del metodo compareTo");
        int comparar = frase.compareTo(frase2);
        System.out.println("Diferencia: "+ comparar);
    }
}
