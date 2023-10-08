package com.dfrb.java8features.collectors;

import java.time.LocalDate;

/**
 * @author dfrb@ne
 */

public class Articulo {
    public Articulo(int idArticulo, String nombreArticulo, LocalDate fechaManufactura) {
        this.idArticulo = idArticulo;
        this.nombreArticulo = nombreArticulo;
        this.fechaManufactura = fechaManufactura;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public LocalDate getFechaManufactura() {
        return fechaManufactura;
    }

    public void setFechaManufactura(LocalDate fechaManufactura) {
        this.fechaManufactura = fechaManufactura;
    }

    @Override
    public String toString() {
        return "Articulo {" + "idArticulo="+ idArticulo + ", nombreArticulo="+ nombreArticulo + ", fechaManufactura="+ fechaManufactura +"}";
    }
    
    private int idArticulo;
    private String nombreArticulo;
    private LocalDate fechaManufactura;
}
