package com.dfrb.webapp;

/**
 * @author dfrb@ne
 */

public class Productos {
    public Productos(String codArticulo, String seccion, String nombreArticulo, double precio, String fecha, String importado, String paisDeOrigen) {
        this.codArticulo = codArticulo;
        this.seccion = seccion;
        this.nombreArticulo = nombreArticulo;
        this.precio = precio;
        this.fecha = fecha;
        this.importado = importado;
        this.paisDeOrigen = paisDeOrigen;
    }
    
    public Productos(String seccion, String nombreArticulo, double precio, String fecha, String importado, String paisDeOrigen) {
        this.seccion = seccion;
        this.nombreArticulo = nombreArticulo;
        this.precio = precio;
        this.fecha = fecha;
        this.importado = importado;
        this.paisDeOrigen = paisDeOrigen;
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

    @Override
    public String toString() {
        return "Productos{" + "codArticulo=" + codArticulo + ", seccion=" + seccion + ", nombreArticulo=" + nombreArticulo + ", precio=" + precio + ", fecha=" + fecha + ", importado=" + importado + ", paisDeOrigen=" + paisDeOrigen + '}';
    }
    
    private String codArticulo;
    private String seccion;
    private String nombreArticulo;
    private double precio;
    private String fecha;
    private String importado;
    private String paisDeOrigen;
}
