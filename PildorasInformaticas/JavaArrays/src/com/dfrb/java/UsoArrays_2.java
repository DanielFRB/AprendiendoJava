package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class UsoArrays_2 {
    public static void main(String[] args) {
        String[] paises = new String[8];
        paises[0] = "Venezuela";
        paises[1] = "España";
        paises[2] = "Argentina";
        paises[3] = "Colombia";
        paises[4] = "Ecuador";
        paises[5] = "EEUU";
        paises[6] = "Mexico";
        paises[7] = "Inglaterra";
        
        for (int i = 0; i < paises.length; i++) {
            System.out.println("Pais "+ (i+1) +": "+ paises[i]);
        }
        System.out.println("------------");
        for (String p : paises) {
            System.out.println(p);
        }
        System.out.println("------------");
        String[] paises2 = {"Venezuela", "España", "Argentina", "Colombia", "Ecuador", "Mexico", "Inglaterra", "China"};
        int contador = 0;
         for (String p : paises2) {
             contador++;
             System.out.println("Pais "+ contador +": "+ p);
        }
    }
}
