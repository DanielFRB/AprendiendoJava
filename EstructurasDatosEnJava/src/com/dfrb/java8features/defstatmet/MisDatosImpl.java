package com.dfrb.java8features.defstatmet;

/**
 * @author dfrb@ne
 */

public class MisDatosImpl implements MisDatos {
    public boolean isNull(String str) {
        System.out.println("Impl Null Check");
        return str == null;
    }
    
    public static void main(String[] args) {
        MisDatosImpl obj = new MisDatosImpl();
        obj.print("abc");
        obj.isNull("abc");
        boolean resultado = MisDatos.isNull("abc");
        System.out.println("Resultado: "+ resultado);
    }
}
