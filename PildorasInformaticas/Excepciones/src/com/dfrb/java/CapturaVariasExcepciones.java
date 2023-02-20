package com.dfrb.java;

import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class CapturaVariasExcepciones {
    public static void main(String[] args) {
        try {
            division();
        } catch (ArithmeticException e) {
            System.err.println("No se puede dividir por 0");
        } catch (NumberFormatException e) {
            System.err.println("No has introducido un numero entero");
        }
    }
    
    static void division() {
         int num01 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
         int num02 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
         System.out.println("El resultado es: "+ (num01 / num02));
    }
}
