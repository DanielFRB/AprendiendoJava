package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class DemoOperIncrementoDecremento {
    public static void main(String[] args) {
        int a = 20;
        int b = 7;
        System.out.println("Valor de a: "+ a);
        System.out.println("Valor de b: "+ b);
        //Operador incremento y decremento fijo
        a++;
        b--;
        System.out.println("Aplicando operadores de incremento y decremento simple de uno en uno.");
        System.out.println("Valor de a: "+ a);
        System.out.println("Valor de b: "+ b);
        //Operador de incremento y decremento variable
        a+= 3;
        b-= 2;
        System.out.println("Aplicando operadores de incremento y decremento variable.");
        System.out.println("Valor de a: "+ a);
        System.out.println("Valor de b: "+ b);
    }
}
