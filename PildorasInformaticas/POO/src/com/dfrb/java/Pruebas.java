package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class Pruebas {
    public static void main(String[] args) {
        EmpleadoPruebas trabajador1 = new EmpleadoPruebas("Paco");
        EmpleadoPruebas trabajador2 = new EmpleadoPruebas("Ana");
        trabajador1.cambiaSeccion("RRHH");
        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
    }
}

class EmpleadoPruebas {
    public EmpleadoPruebas(String nom) {
        nombre = nom;
        seccion = "Administracion";
    }
    
    public void cambiaSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    public String devuelveDatos() {
        return "El nombre es: "+ nombre +" y la seccion es: "+ seccion;
    }
    
    private final String nombre;
    private String seccion;
}