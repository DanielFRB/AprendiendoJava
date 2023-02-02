package com.dfrb.java;

import java.util.Scanner;

/**
 * @author dfrb@ne
 */

public class Entrada_Datos3 {
    public static void main(String[] args) {
        double centimetros;
        int pies, pulgadas, restante;
        final double CM_POR_PULGADA = 2.54;
        final int PULGADAS_POR_PIE = 12;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Exactamente, cuantos centimetros? ");
        centimetros = entrada.nextDouble();
        pulgadas = (int) (centimetros / CM_POR_PULGADA);
        pies = pulgadas / PULGADAS_POR_PIE;
        restante = pulgadas % PULGADAS_POR_PIE;
        System.out.printf("%.2f cm = %d pies, %d pulgadas\n",centimetros, pies, restante);
    }
}
