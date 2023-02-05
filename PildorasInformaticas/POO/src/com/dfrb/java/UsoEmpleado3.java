package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class UsoEmpleado3 {
    public static void main(String[] args) {
        Empleado3 empleado1 = new Empleado3("Daniel Rondon", 85000, 1990, 12, 17);
        Empleado3 empleado2 = new Empleado3("Ana Lopez", 95000, 1995, 06, 02);
        Empleado3 empleado3 = new Empleado3("Maria Martin", 105000, 2002, 03, 15);
        
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);
        
        System.out.println("Nombre: "+ empleado1.dameNombre() +" Sueldo: "+ empleado1.dameSueldo() 
                +" Fecha de Alta: "+ empleado1.dameFechaContrato());
        System.out.println("Nombre: "+ empleado2.dameNombre() +" Sueldo: "+ empleado2.dameSueldo() 
                +" Fecha de Alta: "+ empleado2.dameFechaContrato());
        System.out.println("Nombre: "+ empleado3.dameNombre() +" Sueldo: "+ empleado3.dameSueldo() 
                +" Fecha de Alta: "+ empleado3.dameFechaContrato());
        System.out.println("------------");
        
        // Codigo alternativo
        Empleado3[] misEmpleados = new Empleado3[3];
        misEmpleados[0] = new Empleado3("Daniel Rondon", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado3("Ana Lopez", 95000, 1995, 06, 02);
        misEmpleados[2] = new Empleado3("Maria Martin", 105000, 2002, 03, 15);
        
        // Bucle for tradicional
        for (int i = 0; i < 3; i++) {
            misEmpleados[i].subeSueldo(5);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Nombre: "+ misEmpleados[i].dameNombre() +" Sueldo: "+ misEmpleados[i].dameSueldo() 
                +" Fecha de Alta: "+ misEmpleados[i].dameFechaContrato());
        }
        System.out.println("------------");
        // Bucle foreach
        for (Empleado3 e : misEmpleados) {
            e.subeSueldo(5);
        }
        for (Empleado3 e : misEmpleados) {
            System.out.println("Nombre: "+ e.dameNombre() +" Sueldo: "+ e.dameSueldo() +" Fecha de Alta: "+ e.dameFechaContrato());
        }
    }
}

class Empleado3 {
    public Empleado3(String nom, double sue, int agno, int mes, int dia) {
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
