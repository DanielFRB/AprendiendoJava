package com.dfrb.java;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author dfrb@ne
 */

public class CalculoAreas {
    public static void main(String[] args) {
        System.out.println("Calculo de areas de figuras geometricas");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opcion: \n1: Cuadrado \n2: Triangulo \n3: Rectangulo \n4: Circulo ");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
                System.out.println("El area del cuadrado es = "+ Math.pow(lado, 2));
                break;
            case 2:
                int baseT = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triangulo"));
                int alturaT = Integer.parseInt(JOptionPane.showInputDialog("Introduce el alto del triangulo"));
                System.out.println("El area del triangulo es = "+ (baseT * alturaT)/2);
                break;
            case 3:
                int baseR = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del rectangulo"));
                int alturaR = Integer.parseInt(JOptionPane.showInputDialog("Introduce el alto del rectangulo"));
                System.out.println("El area del triangulo es = "+ (baseR * alturaR));
                break;
            case 4:
                int radioC = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo"));
                System.out.printf("El area del circulo es = %.2f\n", Math.PI * (Math.pow(radioC, 2)));
                break;
            default:
                System.out.println("No ha escogido la opcion correcta");
        }
    }
}
