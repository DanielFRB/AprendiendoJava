package com.dfrb.java;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class Entrada_Datos2 {
    public static void main(String[] args) {
        int pulgadas;
        double cm;
        final double pulgada = 2.54;
        
        Scanner linea = new Scanner(System.in);
        System.out.println("Convierte Pulgadas a Centimetros");
        System.out.print("Cuantas Pulgadas?: ");
        pulgadas = linea.nextInt(); // Lee y convierte el numero tecleado en entero, ocurre un error si no escribes un numero
        cm = pulgadas * pulgada;
        System.out.println("Pulgadas = "+ pulgadas);
        System.out.println("Centimetros = "+ cm);
    }
}
