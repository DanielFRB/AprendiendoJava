package com.dfrb.java;

/**
 * @author dfrb@ne
 */

// La Clase Articulo1 implementa la interface Comparable para dar solucion al problema de ordenamiento interno
// que hace la Clase TreeSet, esta clase necesita que el tipo de dato que va a almacenar pueda ser ordenable para ello
// debe implementar el metodo compareTo(), que la Clase Articulo1 sobreescribe para que ordene por numeroArticulo.
public class Articulo1 implements Comparable<Articulo1> {
    public Articulo1(int num, String desc) {
        this.numeroArticulo = num;
        this.descripcion = desc;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    
    // Se sobreescribe el metodo compareTo() y ordenara en funcion del numeroArticulo.
    @Override
    public int compareTo(Articulo1 art) {
        return numeroArticulo - art.numeroArticulo;
    }
    
    private int numeroArticulo;
    private String descripcion;
}
