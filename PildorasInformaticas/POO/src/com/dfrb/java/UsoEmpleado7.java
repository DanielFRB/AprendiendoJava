package com.dfrb.java;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author dfrb@ne
 */

public class UsoEmpleado7 {
    public static void main(String[] args) {
        Jefatura3 jefeRRHH = new Jefatura3("Oswaldo", 55000, 2006, 9, 25);
        jefeRRHH.cambiaSeccion("RRHH");
        jefeRRHH.estableceIncentivo(2570);
        
        Empleado7[] misEmpleados = new Empleado7[6];
        misEmpleados[0] = new Empleado7("Daniel", 30000, 1990, 12, 17);
        misEmpleados[1] = new Empleado7("Ana", 50000, 1995, 06, 02);
        misEmpleados[2] = new Empleado7("Maria", 25000, 2002, 03, 15);
        misEmpleados[3] = new Empleado7("Antonio");
        misEmpleados[4] = jefeRRHH; // Polimorfismo en accion, Principio de sustitucion
        misEmpleados[5] = new Jefatura3("Yaneth", 65000, 1995, 5, 26); // Polimorfismo en accion, Principio de sustitucion
        Jefatura3 jefaContabilidad = (Jefatura3) misEmpleados[5];
        jefaContabilidad.cambiaSeccion("Contabilidad");
        jefaContabilidad.estableceIncentivo(5000);
        
        for (Empleado7 e : misEmpleados) {
            e.subeSueldo(5);
        }
        
        for (Empleado7 e : misEmpleados) {
            System.out.println("Nombre: "+ e.dameNombre() +" Sueldo: "+ e.dameSueldo() +" Fecha de Alta: "+ e.dameFechaContrato());
        }
    }
}

class Empleado7 {
    public Empleado7(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
        seccion = "Administracion";
        id = idSiguiente;
        idSiguiente++;
    }
    
    public Empleado7(String nom) {
        this(nom, 5000, 2002, 02, 01);
    }
    
    public String dameNombre() {
        return nombre +" Id: "+ id +" Seccion: "+ seccion;
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

class Jefatura3 extends Empleado7 {
    public Jefatura3(String nom, double sue, int agno, int mes, int dia) {
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