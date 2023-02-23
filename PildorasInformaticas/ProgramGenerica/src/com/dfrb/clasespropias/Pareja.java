package com.dfrb.clasespropias;

/**
 * @author dfrb@ne
 */

public class Pareja<T>  {
    public Pareja() {
        primero = null;
    }
    
    public void setPrimero(T nuevoValor) {
        this.primero = nuevoValor;
    }
    
    public T getPrimero() {
        return primero;
    }
    
    private T primero;
}
