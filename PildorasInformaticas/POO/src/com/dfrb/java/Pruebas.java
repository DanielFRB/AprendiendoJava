package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class Pruebas {
    public static void main(String[] args) {
        EmpleadoPruebas trabajador1 = new EmpleadoPruebas("Paco");
        EmpleadoPruebas trabajador2 = new EmpleadoPruebas("Ana");
        EmpleadoPruebas trabajador3 = new EmpleadoPruebas("Antonio");
        EmpleadoPruebas trabajador4 = new EmpleadoPruebas("Maria");
        trabajador1.cambiaSeccion("RRHH");
        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
        System.out.println(trabajador3.devuelveDatos());
        System.out.println(trabajador4.devuelveDatos());
    }
}

class EmpleadoPruebas {
    public EmpleadoPruebas(String nom) {
        nombre = nom;
        seccion = "Administracion";
        id = idSiguiente;
        idSiguiente++;
    }
    
    public void cambiaSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    public String devuelveDatos() {
        return "El nombre es: "+ nombre +" la seccion es: "+ seccion +" y el Id es: "+ id;
    }
    
    private final String nombre;
    private String seccion;
    private int id;
    private static int idSiguiente = 1;
}