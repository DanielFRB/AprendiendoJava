package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class UsoEmpleadoConArrayList {
    public static void main(String[] args) {
        Empleado[] arregloEmpleados = new Empleado[3];
        arregloEmpleados[0] = new Empleado("Daniel", 46, 2800);
        arregloEmpleados[1] = new Empleado("Ana", 47, 3200);
        arregloEmpleados[2] = new Empleado("Antonio", 56, 2950);
        for (Empleado e : arregloEmpleados) {
            System.out.println(e.dameDatos());
        }
        System.out.println("----------------------------------------------------------------------");
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        listaEmpleados.add(new Empleado("Daniel", 46, 2800));
        listaEmpleados.add(new Empleado("Ana", 47, 3200));
        listaEmpleados.add(new Empleado("Antonio", 56, 2950));
        listaEmpleados.add(new Empleado("Maria", 25, 2900));
        listaEmpleados.add(new Empleado("Jose", 24, 3000));
        listaEmpleados.add(new Empleado("Carlos", 47, 2600));
        listaEmpleados.add(new Empleado("Ramona", 25, 2900));
        listaEmpleados.add(new Empleado("Richard", 29, 3200));
        // listaEmpleados.trimToSize();
        listaEmpleados.set(1, new Empleado("Juana", 45, 2200));
        System.out.println(listaEmpleados.get(0).dameDatos());
        System.out.println(listaEmpleados.size());
        for (Empleado e : listaEmpleados) {
            System.out.println(e.dameDatos());
        }
    }
}

class Empleado {
    public Empleado(String nom, int edad, double sue) {
        this.nombre = nom;
        this.edad =  edad;
        this.sueldo = sue;
    }
    
    public String dameNombre() {
        return nombre;
    }
    
    public double dameSueldo() {
        return sueldo;
    }
    
    public int dameEdad() {
        return edad;
    }
    
    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * (porcentaje/100);
        sueldo += aumento;
    }
    
    public String dameDatos() {
        return "El Empleado se llama "+ nombre +". Tiene "+ edad +" años. Y un salario de: "+ sueldo;
    }
    
    private String nombre;
    private double sueldo;
    private int edad;
}
