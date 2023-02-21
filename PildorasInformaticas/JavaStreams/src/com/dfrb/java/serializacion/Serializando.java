package com.dfrb.java.serializacion;

import java.util.*;
import java.io.*;

/**
 * @author dfrb@ne
 */

public class Serializando {
    public static void main(String[] args) {
        Administrador jefe = new Administrador("Daniel", 85000, 2010, 2, 14);
        jefe.setIncentivo(2500);
        
        Empleado[] personal = new Empleado[3];
        personal[0] = jefe;
        personal[1] = new Empleado("Juan", 25000, 2011, 10, 20);
        personal[2] = new Empleado("Maria", 25700, 2011, 8, 15);
        
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Proyectos/AprendiendoJava/PildorasInformaticas/JavaStreams/src/files/empleado.dat"));
            oos.writeObject(personal);
            oos.close();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Proyectos/AprendiendoJava/PildorasInformaticas/JavaStreams/src/files/empleado.dat"));
            Empleado[] personalRecuperado = (Empleado[]) ois.readObject();
            for (Empleado e : personalRecuperado) {
                System.out.println(e.toString());
            }
        } catch (IOException e) {
            System.err.println("No se pudo crear el archivo");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Empleado implements Serializable {
    public Empleado(String nombre, double sueldo, int anno, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendar = new GregorianCalendar(anno, mes-1, dia);
        fechaContrato = calendar.getTime();
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }
    
    public void subirsueldo(double porcentaje) {
        double aumento = sueldo * (porcentaje / 100);
        sueldo += aumento;
    }
    
    @Override
    public String toString() {
        return "Nombre: "+ nombre +", Sueldo: "+ sueldo +", Fecha de contrato: "+ fechaContrato;
    }
    
    private String nombre;
    private double sueldo;
    private Date fechaContrato;
    private static final long serialVersionUID = 1L;
}

class Administrador extends Empleado {
    public Administrador(String nombre, double sueldo, int anno, int mes, int dia) {
        super(nombre, sueldo, anno, mes, dia);
        this.incentivo = 0;
    }
    
    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
    
    @Override
    public double getSueldo() {
        double sueldoJefe = super.getSueldo();
        return sueldoJefe + incentivo;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Incentivo: "+ incentivo;
    }
    
    private double incentivo;
    private static final long serialVersionUID = 1L;
}
