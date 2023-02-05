package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class UsoEmpleado2 {
    public static void main(String[] args) {
        
    }
}

class Empleado2 {
    public Empleado2(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
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
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;
}
