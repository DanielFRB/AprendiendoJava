package com.dfrb.java;

import com.dfrb.pruebas.Clase3;

/**
 * @author dfrb@ne
 */

public class Clase2 {
    public static void main(String[] args) {
        Clase1 miObj = new Clase1();
        Clase3 miObj2 = new Clase3();
        System.out.println(miObj.miVar);
        System.out.println(miObj.miMetodo());
        System.out.println("------------");
        System.out.println(miObj2.miVar);
        System.out.println(miObj2.miMetodo());
        System.out.println("------------");
        System.out.println("Metodos de la Clase Object");
        System.out.println(miObj2.hashCode());
        System.out.println(miObj.hashCode());
    }
}
