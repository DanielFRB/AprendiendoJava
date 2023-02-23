package com.dfrb.clasespropias;

/**
 * @author dfrb@ne
 */

public class Empleado {
    public Empleado(String n, int e, double s) {
        this.nombre = n;
        this.edad = e;
        this.salario = s;
    }
    
    @Override
    public String toString() {
        return "El Empleado se llama: "+ nombre +". Tiene: "+ edad +" años y un Salario de: "+ salario;
    }
    
    private String nombre;
    private double salario;
    private int edad;
}
