package com.dfrb.java;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author dfrb@ne
 */

public class UsoPersona {
    public static void main(String[] args) {
        Persona[] lasPersonas = new Persona[2];
        lasPersonas[0] = new Empleado8("Juan Conde", 500, 2002, 5, 17);
        lasPersonas[1] = new Alumno("Oswaldo Lopez", "Medicina");
        
        for (Persona p : lasPersonas) {
            System.out.println(p.dameNombre() +", "+ p.dameDescripcion());
        }
    }
}

abstract class Persona {
    private final String nombre;
    
    public Persona(String n) {
        nombre = n;
    }
    
    public String dameNombre() {
        return nombre;
    }
    
    public abstract String dameDescripcion();
}

class Empleado8 extends Persona{
    public Empleado8(String nom, double sue, int agno, int mes, int dia) {
        super(nom);
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
        seccion = "Administracion";
        id = idSiguiente;
        idSiguiente++;
    }
    
    public String dameSeccion() {
        return "Seccion: "+ seccion;
    }
    
    public String dameSueldo() {
        return "Sueldo: "+ sueldo;
    }
    
    public Date dameFechaContrato() {
        return altaContrato;
    }
    
    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * (porcentaje/100);
        sueldo += aumento;
    }
    
    public void cambiaSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    public static String dameIdSiguiente() {
        return "El Id siguiente es: "+ idSiguiente;
    }
    
    @Override
    public String dameDescripcion() {
        return "Este empleado tiene un Id: "+ id +" con un sueldo: "+ sueldo;
    }
    
    private double sueldo;
    private Date altaContrato;
    private String seccion;
    private int id;
    private static int idSiguiente = 1;
}

class Alumno extends Persona {
    private String carrera;
    
    public Alumno(String nom, String car) {
        super(nom);
        carrera = car;
    }
    
    @Override
    public String dameDescripcion() {
        return "Este alumno esta estudiando la carrera de: "+ carrera;
    }   
}
