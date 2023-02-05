package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class Furgoneta extends CocheUltimo {
    private int capacidadCarga;
    private int plazasExtra;
    
    public Furgoneta(int plazasExtra, int capacidadCarga) {
        super(); // Llamar al constructor de la clase padre
        this.plazasExtra = plazasExtra;
        this.capacidadCarga = capacidadCarga;
    }
    
    public String getDatosFurgoneta() {
        return "La capacidad de carga es: "+ capacidadCarga +" kilos y las plazas son: "+ plazasExtra;
    }
}
