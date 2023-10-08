package com.dfrb.java8features.collectors;

import java.util.List;

/**
 * @author dfrb@ne
 */

public class Cliente {
    public Cliente(int id, String nombre, String genero, boolean activo, List<Articulo> lstArticulos) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.activo = activo;
        this.lstArticulos = lstArticulos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<Articulo> getLstArticulos() {
        return lstArticulos;
    }

    public void setLstArticulos(List<Articulo> lstArticulos) {
        this.lstArticulos = lstArticulos;
    }
    
    private int id;
    private String nombre;
    private String genero;
    private boolean activo;
    private List<Articulo> lstArticulos;
}
