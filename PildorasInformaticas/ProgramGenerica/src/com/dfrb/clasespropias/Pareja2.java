package com.dfrb.clasespropias;

/**
 * @author dfrb@ne
 */

public class Pareja2<T>  {
    public Pareja2() {
        primero = null;
    }
    
    public void setPrimero2(T nuevoValor) {
        this.primero = nuevoValor;
    }
    
    public T getPrimero2() {
        return primero;
    }
    
    // Se agrega este metodo en particular para el video de Herencia en Clases Genericas y Tipos comodin
    public static void imprimirTrabajador(Pareja2<? extends Empleado> p) {
        Empleado primero = p.getPrimero2();
        System.out.println(primero);
    }
    
    private T primero;
}
