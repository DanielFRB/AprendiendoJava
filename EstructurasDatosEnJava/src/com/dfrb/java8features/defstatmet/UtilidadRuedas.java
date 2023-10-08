package com.dfrb.java8features.defstatmet;

/**
 * @author dfrb@ne
 */

public class UtilidadRuedas implements DosRuedas, CuatroRuedas {
    // Se debe sobrescribir el metodo printWheelsType() ya que ambas interfaces 
    // DosRueas y CuatroRuedas tienen un metodo con el mismo nombre
    // Se debe seccionar cual metodo se va a ejecutar
    @Override
    public String printWheelsType() {
        return DosRuedas.super.printWheelsType();
    }
    
    public void printUtilities() {
        System.out.println("Este es un vehiculo de "+ printWheelsType());
    }
}
