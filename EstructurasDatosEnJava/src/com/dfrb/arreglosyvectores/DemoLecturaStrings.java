package com.dfrb.arreglosyvectores;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class DemoLecturaStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Hace uso de un Arreglo de tipo String
        String[] data;
        System.out.println("Introduzca el numero de Strings: ");
        int n = s.nextInt();
        // Aqui se inicializa el Arreglo y se fija el tamaño que no podra ser aumentado o disminuido
        data = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el String No "+ (i+1));
            data[i] = s.nextLine();
        }
        System.out.println("Los Strings introducidos son: ");
        for (int j = 0; j < n; j++) {
            System.out.println(data[j]);
        }
    }
}
