package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class UsoEmpleado9 {
    public static void main(String[] args) {
        Jefatura4 jefeRRHH = new Jefatura4("Oswaldo", 55000, 2006, 9, 25);
        jefeRRHH.cambiaSeccion("RRHH");
        jefeRRHH.estableceIncentivo(2570);
        
        Empleado9[] misEmpleados = new Empleado9[6];
        misEmpleados[0] = new Empleado9("Daniel", 30000, 1990, 12, 17);
        misEmpleados[1] = new Empleado9("Ana", 50000, 1995, 06, 02);
        misEmpleados[2] = new Empleado9("Maria", 25000, 2002, 03, 15);
        misEmpleados[3] = new Empleado9("Antonio");
        misEmpleados[4] = jefeRRHH; // Polimorfismo en accion, Principio de sustitucion
        misEmpleados[5] = new Jefatura4("Yaneth", 65000, 1995, 5, 26); // Polimorfismo en accion, Principio de sustitucion
        Jefatura4 jefaContabilidad = (Jefatura4) misEmpleados[5];
        jefaContabilidad.cambiaSeccion("Contabilidad");
        jefaContabilidad.estableceIncentivo(5000);
        
        for (Empleado9 e : misEmpleados) {
            e.subeSueldo(5);
        }
        
        Arrays.sort(misEmpleados); // Ordena el Arreglo misEmpleados
        
        for (Empleado9 e : misEmpleados) {
            System.out.println("Nombre: "+ e.dameNombre() + e.dameId() + e.dameSeccion() + " Sueldo: "+ e.dameSueldo() +" Fecha de Alta: "+ e.dameFechaContrato());
        }
    }
}

class Empleado9 extends Persona implements Comparable {
    public Empleado9(String nom, double sue, int agno, int mes, int dia) {
        super(nom);
        this.sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        this.altaContrato = calendario.getTime();
        this.seccion = "Administracion";
        this.id = idSiguiente;
        idSiguiente++;
    }
    
    public Empleado9(String nom) {
        super(nom);
        this.sueldo = 5000;
        GregorianCalendar calendario = new GregorianCalendar(2002, 0, 1);
        this.altaContrato = calendario.getTime();
        this.seccion = "Administracion";
        this.id = idSiguiente;
        idSiguiente++;
    }
    
    public String dameSeccion() {
        return " Seccion: "+ seccion;
    }
    
    public double dameSueldo() {
        return sueldo;
    }
    
    public String dameId() {
        return " Id: "+ id;
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
    
    @Override
    public int compareTo(Object miObjeto) {
        Empleado9 e = (Empleado9) miObjeto;
        if (this.sueldo < e.sueldo) {
            return -1;
        }
        if (this.sueldo > e.sueldo) {
            return 1;
        }
        return 0;
    }
    
    private double sueldo;
    private Date altaContrato;
    private String seccion;
    private int id;
    private static int idSiguiente = 1;
}

class Jefatura4 extends Empleado9 {
    public Jefatura4(String nom, double sue, int agno, int mes, int dia) {
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
