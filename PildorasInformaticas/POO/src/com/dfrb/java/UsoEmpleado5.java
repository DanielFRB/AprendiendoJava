package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class UsoEmpleado5 {
    public static void main(String[] args) {
        
        Empleado5[] misEmpleados = new Empleado5[4];
        misEmpleados[0] = new Empleado5("Daniel Rondon", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado5("Ana Lopez", 95000, 1995, 06, 02);
        misEmpleados[2] = new Empleado5("Maria Martin", 105000, 2002, 03, 15);
        misEmpleados[3] = new Empleado5("Antonio Fernandez");
        
        for (Empleado5 e : misEmpleados) {
            e.subeSueldo(5);
        }
        for (Empleado5 e : misEmpleados) {
            System.out.println("Nombre: "+ e.dameNombre() +" Sueldo: "+ e.dameSueldo() +" Fecha de Alta: "+ e.dameFechaContrato());
        }
    }
}

class Empleado5 {
    public Empleado5(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
        seccion = "Administracion";
        id = idSiguiente;
        idSiguiente++;
    }
    
    public Empleado5(String nom) {
        this(nom, 2002, 01, 02, 01);
    }
    
    public String dameNombre() {
        return nombre;
    }
    
    public double dameSueldo() {
        return sueldo;
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
    
    public String dameSeccion() {
        return seccion;
    }
    
    public static String dameIdSiguiente() {
        return "El Id siguiente es: "+ idSiguiente;
    }
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private String seccion;
    private int id;
    private static int idSiguiente = 1;
}

class Jefatura extends Empleado5 {
    public Jefatura(String nom, double sue, int agno, int mes, int dia) {
        super(nom, sue, agno, mes, dia);
    }
    
    public void estableceIncentivo(double d) {
        incentivo = d;
    }
    
    @Override
    public double dameSueldo() {
        double sueldoJefe = super.dameSueldo();
        return sueldoJefe + incentivo;
    }
    
    private double incentivo;
}
