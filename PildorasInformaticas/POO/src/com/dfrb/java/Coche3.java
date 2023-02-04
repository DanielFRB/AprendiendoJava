package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class Coche3 {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;
    private String color;
    private int pesoTotal;
    private boolean asientosCuero, climatizador;
    
    public Coche3() {
        ruedas = 4;
        largo = 500;
        ancho = 200;
        motor = 1600;
        pesoPlataforma = 500;
    }
    
    public String dimeDatosGenerales() {
        return "La plataforma del vehiculo tiene: "+ ruedas +" ruedas. "+
                  "Mide "+ (largo/100) +" metros con un ancho de "+ (ancho/100) +
                  " metros y un peso de plataforma de "+ pesoPlataforma +" kilos.";
    }
    
    public String dimeLargo() {
        return "El largo del coche es: "+ largo;
    }
    
    public void estableceColor(String colorCoche) {
        color = colorCoche;
    }
    
    public String dimeColor() {
        return "El color del coche es: "+ color;
    }
    
    public void configuraAsientos(String asientosCuero) {
        if (asientosCuero.equalsIgnoreCase("si")) {
            this.asientosCuero = true;
        } else {
            this.asientosCuero = false;
        }
    }
    
    public String dimeAsientos() {
        if (asientosCuero == true) {
            return "El coche tiene asientos de cuero";
        } else {
            return "El cpche tiene asientos de tela";
        }
    }
    
    public void configuraClimatizador(String climatizador) {
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }
    
    public String dimeClimatizador() {
        if (climatizador == true) {
            return "El coche incorpora climatizador";
        } else {
            return "El coche lleva aire acondicionado";
        }
    }
    
    public String dimePesoCoche() {
        int pesoCarroceria = 500;
        pesoTotal = pesoCarroceria + pesoPlataforma;
        if (climatizador == true) {
            pesoTotal = pesoTotal + 50;
        }
        if (asientosCuero == true) {
            pesoTotal = pesoTotal + 20;
        }
        return "El Peso total del coche es: "+ pesoTotal +" kilogramos";
    }
    
    public int precioCoche() {
        int precioFinal = 10000;
        if (asientosCuero == true) {
            precioFinal += 2000;
        }
        if (climatizador == true) {
            precioFinal += 1500;
        }
        return precioFinal;
    }
}
