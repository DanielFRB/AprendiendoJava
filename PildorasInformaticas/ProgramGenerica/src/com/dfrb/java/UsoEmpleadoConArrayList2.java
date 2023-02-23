package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class UsoEmpleadoConArrayList2 {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        listaEmpleados.add(new Empleado("Daniel", 46, 2800));
        listaEmpleados.add(new Empleado("Ana", 47, 3200));
        listaEmpleados.add(new Empleado("Antonio", 56, 2950));
        listaEmpleados.add(new Empleado("Maria", 25, 2900));
        listaEmpleados.add(new Empleado("Jose", 24, 3000));
        listaEmpleados.add(new Empleado("Carlos", 47, 2600));
        listaEmpleados.add(new Empleado("Ramona", 25, 2900));
        listaEmpleados.add(new Empleado("Richard", 29, 3200));
        Iterator<Empleado> iterator = listaEmpleados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().dameDatos());
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
