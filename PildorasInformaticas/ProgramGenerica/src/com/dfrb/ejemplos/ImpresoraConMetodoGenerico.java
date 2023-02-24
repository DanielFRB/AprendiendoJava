package com.dfrb.ejemplos;

/**
 * @author dfrb@ne
 */

public class ImpresoraConMetodoGenerico {
    // En este caso utilizando la programacion generica solo tenemos UN solo metodo que va a imprimir un arreglo sin importar que tipo
    // de dato contenga el arreglo a imprimir. El metodo se adapta al tipo de parametro que recibe e imprime su contenido.
    public <T> void imprimir(T[] arreglo) {
        for (T elemento : arreglo) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    } 
}
