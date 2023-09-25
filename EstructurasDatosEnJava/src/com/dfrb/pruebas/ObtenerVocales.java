package com.dfrb.pruebas;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class ObtenerVocales {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Programa que obtiene las vocales de una frase.");
        System.out.println("Ingrese una frase: ");
        String palabra = ent.nextLine();
        
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("a", 0);
        mapa.put("e", 0);
        mapa.put("i", 0);
        mapa.put("o", 0);
        mapa.put("u", 0);
        
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (esVocal(letra)) {
                String clave = String.valueOf(letra).toLowerCase();
                mapa.put(clave, mapa.get(clave) + 1);
            }
        }
        
        System.out.printf("Resultados para '%s':\n", palabra);
        
        for (HashMap.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.printf("Vocal: %s. Conteo: %d\n", entry.getKey(), entry.getValue());
        }
        ent.close();
    }
    
    private static boolean esVocal(char letra) {
        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    } 
    
}
