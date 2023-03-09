package com.dfrb.tags;

/**
 * @author dfrb@ne
 */

public class Empleado {
    public Empleado(String nombre, String apellido, String puesto, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", puesto=" + puesto + ", sueldo=" + sueldo + '}';
    }
    
    private String nombre;
    private String apellido;
    private String puesto;
    private double sueldo;
}
