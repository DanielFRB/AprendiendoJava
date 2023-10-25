package com.dfrb.java8features.defaultstaticmeth;

/**
 * @author dfrb@ne
 */

public class DefaultMethods {
    public static void main(String[] args) {
        HondaActiva moto = new HondaActiva();
        moto.printName();
        UtilidadRuedas ur = new UtilidadRuedas();
        ur.printUtilities();
    }
}
