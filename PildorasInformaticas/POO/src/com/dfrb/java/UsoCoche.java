package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class UsoCoche {
    public static void main(String[] args) {
        Coche Renault = new Coche(); // Instanciar una Clase; Ejemplar de Clase
        System.out.println("Este coche tiene "+ Renault.ruedas +" ruedas.");
        System.out.println("Este coche tiene un motor de "+ Renault.motor +" cc. y tiene un peso de "+ Renault.peso +" kilos.");
    }
}
