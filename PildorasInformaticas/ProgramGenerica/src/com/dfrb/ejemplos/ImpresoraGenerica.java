package com.dfrb.ejemplos;

/**
 * @author dfrb@ne
 */

public class ImpresoraGenerica<T> {
    public void imprimir(T[] arreglo) {
        for (T elemento : arreglo) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    } 
}
