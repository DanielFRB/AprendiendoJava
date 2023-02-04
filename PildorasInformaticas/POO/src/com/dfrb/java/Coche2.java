package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class Coche2 {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;
    String color;
    int pesoTotal;
    boolean asientosCuero, climatizador;
    
    public Coche2() {
        ruedas = 4;
        largo = 2000;
        ancho = 200;
        motor = 1600;
        pesoPlataforma = 500;
    }
    
    public String dimeLargo() {
        return "El largo del coche es: "+ largo;
    }
    
    public void estableceColor() {
        color = "Azul";
    }
    
    public String dimeColor() {
        return "El color del coche es: "+ color;
    }
}
