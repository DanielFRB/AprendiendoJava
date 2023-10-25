package com.dfrb.java8features.defaultstaticmeth;


/**
 * @author dfrb@ne
 */

public class HondaActiva implements DosRuedas {
    public void printName() {
        System.out.println("Esta es la Honda Activa 7G de 500cc y es un Vehiculo de "+ printWheelsType());
    }
}
