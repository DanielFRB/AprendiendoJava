package com.dfrb.java.modelo;

/**
 * @author dfrb@ne
 */

public class Productos {
    public Productos() {
        codArticulo = "";
        seccion = "";
        nombreArticulo = "";
        precio = 0.0;
        fecha = "";
        importado = "";
        paisDeOrigen = "";
    }

    public String getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(String codArticulo) {
        this.codArticulo = codArticulo;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getImportado() {
        return importado;
    }

    public void setImportado(String importado) {
        this.importado = importado;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }
    
    private String codArticulo;
    private String seccion;
    private String nombreArticulo;
    private double precio;
    private String fecha;
    private String importado;
    private String paisDeOrigen;
}
