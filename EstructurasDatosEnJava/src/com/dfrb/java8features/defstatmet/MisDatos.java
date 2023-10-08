package com.dfrb.java8features.defstatmet;

/**
 * @author dfrb@ne
 */

public interface MisDatos {
    default void print(String str) {
        if (!isNull(str)) {
            System.out.println("Mis Datos impresos: "+ str);
        }
    }
    
    static boolean isNull(String str) {
        System.out.println("Interface Null Check");
        return str == null ? true : "".equals(str);
    }
}
