package com.dfrb.java8features.collectors;

/**
 * @author dfrb@ne
 */

public class Empleado implements Comparable<Empleado> {
    public Empleado(int id, String nombre, int edad, String region, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.region = region;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", region=" + region + ", salario=" + salario + '}';
    }
    
    @Override
    public int compareTo(Empleado o) {
        if (this.getId() > o.getId()) {
            return 1;
        } else if (this.getId() < o.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    private int id;
    private String nombre;
    private int edad;
    private String region;
    private double salario;
}
