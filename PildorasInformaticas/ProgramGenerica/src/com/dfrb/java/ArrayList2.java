package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class ArrayList2 {   
    public ArrayList2(int z) {
        datosElemento = new Object[z];
    }
    
    public Object get(int i) {
        return datosElemento[i];
    }
    
    public void add(Object o) {
        datosElemento[i] = o;
        i++;
    }
    
    private Object[] datosElemento;
    private int i = 0;
}
