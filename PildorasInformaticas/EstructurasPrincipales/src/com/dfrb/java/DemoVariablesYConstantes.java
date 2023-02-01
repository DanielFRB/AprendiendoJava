package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class DemoVariablesYConstantes {
    public static void main(String[] args) {
        //Declarando e iniciando variables
        int x = 5;
        int y = 8;
        int suma;
        int resta;
        double cm = 6;
        
        //Declarando e iniciando constantes
        final double pi = 3.1415927;
        final double pulgada = 2.54;
        
        //Operaciones
        double resultado = cm / pulgada;
        System.out.println("En "+ cm +" centimetros hay "+ resultado +" pulgadas");
        System.out.println("Valor de x = "+ x);
        System.out.println("Valor de y = "+ y);
        suma = x + y;
        System.out.println("Suma de x + y = "+ suma);
        resta = x - y;
        System.out.println("Resta de x - y = "+ resta);
        //Cambio del valor de las variables
        System.out.println("Cambio de valor de las variables x, y");
        x = x + 1;
        y = y + 1;
        System.out.println("Valor de x = "+ x);
        System.out.println("Valor de y = "+ y);
        suma = x + y;
        System.out.println("Suma de x + y = "+ suma);
        resta = x - y;
        System.out.println("Resta de x - y = "+ resta);
        System.out.println("Las variables pueden cambiar su valor, de ahi su nombre: variable");
        System.out.println("El valor de la constante pi es = "+ pi);
        System.out.println("Las constantes no pueden cambiar su valor, de hecho da error si tratas de asignar un valor a una constante");
    }
}
