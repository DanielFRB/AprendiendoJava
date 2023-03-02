package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

// Como solucion al problema presentado en el archivo Articulo2.java, se realiza la siguiente modificacion que implica dejar la clase Articulo
// que unicamente implemente la interface Comparable y crear otra clase que implemente la interface Comparator.
// Se elimina el constructor por defecto y el metodo compare() de la interface Comparator.
public class Articulo3 implements Comparable<Articulo3> {
    public Articulo3(int num, String desc) {
        this.numeroArticulo = num;
        this.descripcion = desc;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    @Override
    public int compareTo(Articulo3 articulo) {
        return numeroArticulo - articulo.numeroArticulo;
    }
    
    private int numeroArticulo;
    private String descripcion;
}


// En este caso se crea una nueva clase que implementa la Interface Comparator
class ComparadorArticulos implements Comparator<Articulo3> {
    @Override
    public int compare(Articulo3 art1, Articulo3 art2) {
        String desc1 = art1.getDescripcion();
        String desc2 = art2.getDescripcion();
        return desc1.compareTo(desc2);
    }
}
