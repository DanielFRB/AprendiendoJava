package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class DemoOperadoresLogicos {
    public static void main(String[] args) {
        int anno = 1999;
        boolean esBisiesto;
        esBisiesto = (anno % 4 == 0);
        esBisiesto = esBisiesto && (anno % 100 != 0);
        esBisiesto = esBisiesto || (anno % 400 == 0);
        System.out.println("El año "+ anno +" es Bisiesto?: "+ esBisiesto);
    }
}
