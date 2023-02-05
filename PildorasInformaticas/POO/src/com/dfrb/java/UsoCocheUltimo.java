package com.dfrb.java;

import javax.swing.JOptionPane;

/**
 * @author dfrb@ne
 */

public class UsoCocheUltimo {
    public static void main(String[] args) {
        CocheUltimo miCoche = new CocheUltimo(); // Instanciar una Clase; Ejemplar de Clase
        miCoche.setColor(JOptionPane.showInputDialog("Introcule el color"));
        System.out.println(miCoche.getColor());
        System.out.println(miCoche.getDatosGenerales());
        miCoche.setAsientosCuero(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
        System.out.println(miCoche.getAsientosCuero());
        miCoche.setClimatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
        System.out.println(miCoche.getClimatizador());
        System.out.println(miCoche.getPesoTotal());
        System.out.println(miCoche.getPrecioTotal());
    }
}
