package com.dfrb.arreglosyvectores;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class DemoLecturaStrings_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Se Usa la clase Vector y se inicializa para recibir los valores, cabe destacar que a diferecia del arreglo 
        // un Vector es un tipo de arreglo cuyo tamaño se puede cambiar fácilmente, mientras que en el arreglo,
        // una vez inicializado el tamaño del mismo no se podra cambiar nunca.
        Vector<String> data = new Vector<String>();
        System.out.println("Ingresa el numero de Strings a escribir: ");
        int n = s.nextInt();
        int i = 0;
        while (n > 0){
            i++;
            System.out.println("Ingrese el String No "+ i);
            String str = s.next();
            data.add(str);
            n--;
        }
        s.close();
        System.out.println("Los Strings introducidos son: ");
        System.out.println(data);
    }
}
