package com.dfrb.ejemplos;

import com.dfrb.clasespropias.Empleado;

/**
 * @author dfrb@ne
 */

public class Impresora {
    // Se debe sobreescribir el metodo "imprimir" las veces que sean necesarias para poder adaptarse al parametro que recibe.
    // Por lo que en realidad tenemos 4 metodos que hacen lo mismo, imprimir el contenido de un arreglo.
    public void imprimir(Integer[] arreglo) {
        for (Integer elemento : arreglo) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }
    
    public void imprimir(Double[] arreglo) {
        for (Double elemento : arreglo) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }
    
    public void imprimir(String[] arreglo) {
        for (String elemento : arreglo) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }
    
    public void imprimir(Empleado[] arreglo) {
        for (Empleado elemento : arreglo) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }
}
