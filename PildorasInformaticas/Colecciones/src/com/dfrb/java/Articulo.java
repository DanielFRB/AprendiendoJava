package com.dfrb.java;

/**
 * @author dfrb@ne
 */

// 
public class Articulo {
    public Articulo(int num, String desc) {
        this.numeroArticulo = num;
        this.descripcion = desc;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    private int numeroArticulo;
    private String descripcion;
}
