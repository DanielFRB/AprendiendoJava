package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class DemoOperacionesCadenas {
    public static void main(String[] args) {
        String nombre = "Daniel";
        String frase = "Es sencillo hacer que las cosas sean complicadas, pero es difícil hacer que sean sencillas";
        System.out.println("La cadena ("+ nombre +") tiene "+ nombre.length() +" caracteres");
        System.out.println("La cadena ("+ frase +") tiene "+ frase.length() +" caracteres");
        
        char primerC = nombre.charAt(0);
        char ultimoC = nombre.charAt(nombre.length() - 1);
        System.out.println("El primer caracter de la cadena ("+ nombre +") es: "+ primerC);
        System.out.println("El ultimo caracter de la cadena ("+ nombre +") es: "+ ultimoC);
        System.out.println("Subfrase de la frase principal es: "+ frase.substring(0, 15));
        
        System.out.println("Ejemplo de metodo equals.");
        boolean esIgual = nombre.equals(frase);
        System.out.println("La cadena ("+ nombre +") es igual a la cadena ("+ frase +"): "+ esIgual);
        String nombre2 = "DANIEL";
        esIgual = nombre.equals(nombre2);
        System.out.println("La cadena ("+ nombre +") es igual a la cadena ("+ nombre2 +"): "+ esIgual);
        System.out.println("Ejemplo de metodo equalsIgnoreCase");
        esIgual = nombre.equalsIgnoreCase(nombre2);
        System.out.println("La cadena ("+ nombre +") es igual a la cadena ("+ nombre2 +"): "+ esIgual);
    }
}
