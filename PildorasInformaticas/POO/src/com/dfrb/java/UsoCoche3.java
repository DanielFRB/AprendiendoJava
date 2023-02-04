package com.dfrb.java;

import javax.swing.JOptionPane;

/**
 * @author dfrb@ne
 */

public class UsoCoche3 {
    public static void main(String[] args) {
        Coche3 miCoche = new Coche3(); // Instanciar una Clase; Ejemplar de Clase
        miCoche.estableceColor(JOptionPane.showInputDialog("Introcule el color"));
        System.out.println(miCoche.dimeColor());
        System.out.println(miCoche.dimeDatosGenerales());
        miCoche.configuraAsientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
        System.out.println(miCoche.dimeAsientos());
        miCoche.configuraClimatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
        System.out.println(miCoche.dimeClimatizador());
        System.out.println(miCoche.dimePesoCoche());
        System.out.println("El precio final del coche es: "+ miCoche.precioCoche());
    }
}
