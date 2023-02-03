package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class TablaLogaritmos {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Inicio de Tabla");
        while (i < 10) {
            double x = i;
            System.out.println(x +"   "+ Math.log(x) / Math.log(2));
            i++;
        }
        System.out.println("Final de Tabla");
    }
}
