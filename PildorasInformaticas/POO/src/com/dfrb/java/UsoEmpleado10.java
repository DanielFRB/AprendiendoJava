package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class UsoEmpleado10 {
    public static void main(String[] args) {
        Jefatura5 jefeRRHH = new Jefatura5("Oswaldo", 55000, 2006, 9, 25);
        jefeRRHH.cambiaSeccion("RRHH");
        jefeRRHH.estableceIncentivo(2570);
        
        Empleado10[] misEmpleados = new Empleado10[6];
        misEmpleados[0] = new Empleado10("Daniel", 30000, 1990, 12, 17);
        misEmpleados[1] = new Empleado10("Ana", 50000, 1995, 06, 02);
        misEmpleados[2] = new Empleado10("Maria", 25000, 2002, 03, 15);
        misEmpleados[3] = new Empleado10("Antonio");
        misEmpleados[4] = jefeRRHH; // Polimorfismo en accion, Principio de sustitucion
        misEmpleados[5] = new Jefatura5("Yaneth", 65000, 1995, 5, 26); // Polimorfismo en accion, Principio de sustitucion
        Jefatura5 jefaContabilidad = (Jefatura5) misEmpleados[5];
        jefaContabilidad.cambiaSeccion("Contabilidad");
        jefaContabilidad.estableceIncentivo(5000);
        
        Empleado10 directorComercial = new Jefatura5("Sandra", 85000, 2011, 6, 5);
        Comparable ejemplo = new Empleado10("Elizabeth");
        
        if (directorComercial instanceof Empleado10) {
            System.out.println("Es de tipo Jefatura");
        }
        
        if (ejemplo instanceof Comparable) {
            System.out.println("Implementa  la interfaz Comparable");
        }
        
        System.out.println(jefaContabilidad.tomarDecisiones("Dar mas dias de vacaciones a los empleados"));
        System.out.println("La Jefa de Contabilidad "+ jefaContabilidad.dameNombre() +" tiene un bono de: "+ jefeRRHH.estableceBonus(500));
        System.out.println("El Empleado "+ misEmpleados[3].dameNombre() +" tiene un bono de: " + misEmpleados[3].estableceBonus(200));
        
        for (Empleado10 e : misEmpleados) {
            e.subeSueldo(5);
        }
        
        Arrays.sort(misEmpleados); // Ordena el Arreglo misEmpleados
        
        for (Empleado10 e : misEmpleados) {
            System.out.println("Nombre: "+ e.dameNombre() + e.dameId() + e.dameSeccion() + " Sueldo: "+ e.dameSueldo() +" Fecha de Alta: "+ e.dameFechaContrato());
        }
    }
}

class Empleado10 extends Persona implements Comparable, Trabajadores {
    public Empleado10(String nom, double sue, int agno, int mes, int dia) {
        super(nom);
        this.sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        this.altaContrato = calendario.getTime();
        this.seccion = "Administracion";
        this.id = idSiguiente;
        idSiguiente++;
    }
    
    public Empleado10(String nom) {
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
        Empleado10 e = (Empleado10) miObjeto;
        if (this.sueldo < e.sueldo) {
            return -1;
        }
        if (this.sueldo > e.sueldo) {
            return 1;
        }
        return 0;
    }
    
    @Override
    public double estableceBonus(double gratificacion) {
        return Trabajadores.baseBonus + gratificacion;
    }
    
    private double sueldo;
    private Date altaContrato;
    private String seccion;
    private int id;
    private static int idSiguiente = 1;
}

class Jefatura5 extends Empleado10 implements Jefes {
    public Jefatura5(String nom, double sue, int agno, int mes, int dia) {
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
    
     @Override
    public String tomarDecisiones(String decision) {
        return "Un miembro de la direccion a tomado la decision de: "+ decision;
    }
    
    @Override
    public double estableceBonus(double gratificacion) {
        double primaJefes = 2000;
        return Trabajadores.baseBonus + gratificacion + primaJefes;
    }
    
    private double incentivo;
}
