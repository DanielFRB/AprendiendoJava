package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class UsoVehiculo {
    public static void main(String[] args) {
        CocheUltimo miCoche = new CocheUltimo();
        miCoche.setColor("Rojo");
        Furgoneta miFurgoneta = new Furgoneta(7, 580);
        miFurgoneta.setColor("Azul");
        miFurgoneta.setAsientosCuero("si");
        miFurgoneta.setClimatizador("si");
        System.out.println(miCoche.getDatosGenerales());
        System.out.println(miFurgoneta.getDatosGenerales() +" "+ miFurgoneta.getDatosFurgoneta());
    }
}
