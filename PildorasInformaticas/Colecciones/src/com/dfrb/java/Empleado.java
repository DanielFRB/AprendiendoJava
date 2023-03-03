package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class Empleado {
    public Empleado(String nombre) {
        this.nombre = nombre;
        this.sueldo = 2000;
    }
    
    @Override
    public String toString() {
        return "[Nombre: "+ nombre +". Sueldo: "+ sueldo +"]";
    }
    
    private String nombre;
    private double sueldo;
}
