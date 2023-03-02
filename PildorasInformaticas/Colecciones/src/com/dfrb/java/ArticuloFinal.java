package com.dfrb.java;

/**
 * @author dfrb@ne
 */

// Como ultima modificacion se elimina la clase ComparadorArticulos que se utilizo en el archivo Articulo3.java,
// quedando la Clase ArticuloFinal con el mismo codigo que la Clase Articulo1, del archivo Articulo1.java
public class ArticuloFinal implements Comparable<ArticuloFinal> {
    public ArticuloFinal(int num, String desc) {
        this.numeroArticulo = num;
        this.descripcion = desc;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    // Unicamente se sobreescribe el metodo compareTo()
    @Override
    public int compareTo(ArticuloFinal articulo) {
        return numeroArticulo - articulo.numeroArticulo;
    }
    
    private int numeroArticulo;
    private String descripcion;
}
