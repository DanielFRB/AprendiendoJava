package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

// Se obliga a la Clase Articulo2 que implemente la interface Comparator, por lo que ahora esta clase implementa dos interfaces.
// Esta es una solucion a medias y posteriormente se realiaran cambios a la misma.
public class Articulo2 implements Comparable<Articulo2>, Comparator<Articulo2> {
    // Debido a la implementacion de la interface Comparator es necesario que la clase Articulo2 pueda crear un objeto que implemente
    // dicha interface, para lo cual, el constructor inicial que recibe dos parametros no nos sirve y debemos hacer una sobrecarga de
    // constructores, agregando un segundo constructor que no reciba ningun parametro -- constructor por defecto.
    public Articulo2() {
    }
    
    public Articulo2(int num, String desc) {
        this.numeroArticulo = num;
        this.descripcion = desc;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    @Override
    public int compareTo(Articulo2 articulo) {
        return numeroArticulo - articulo.numeroArticulo;
    }
    
    // Se sobreescribe el metodo compare() que utiliza internamente el metodo compareTo()
    // Compara las descripciones de dos objetos
    @Override
    public int compare(Articulo2 art1, Articulo2 art2) {
        String desc1 = art1.getDescripcion();
        String desc2 = art2.getDescripcion();
        return desc1.compareTo(desc2);
    }
    
    private int numeroArticulo;
    private String descripcion;
}
