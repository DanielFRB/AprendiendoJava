package com.dfrb.pruebas;

import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

/**
 * @author dfrb@ne
 */

public class PruebasDeFuentes {
    public static void main(String[] args) {
        String fuente = JOptionPane.showInputDialog("Introduzca la Fuente");
        boolean fuenteInstalada = false;
        String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String f : fuentes) {
            if (f.equalsIgnoreCase(fuente)) {
                fuenteInstalada = true;
            }
        }
        System.out.println(fuenteInstalada ? "Fuente Instalada: "+ fuente : "Fuente NO Instalada: "+ fuente);
    }
}
