package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class DemoUsoClaseMath {
    public static void main(String[] args) {
        double raizCuadrada;
        double potencia2;
        int numero = 5;
        
        raizCuadrada = Math.sqrt(numero);
        System.out.println("Raiz cuadrada de "+ numero + " es: "+ raizCuadrada);
        potencia2 = Math.pow(numero, 2);
        System.out.println("La potencia 2 del numero "+ numero + " es: "+ potencia2);
        
        int angulo1 = 45;
        double seno = Math.sin(angulo1);
        System.out.println("El Seno del angulo "+ angulo1 + " grados es: "+ seno);
        int angulo2 = 0;
        double coseno = Math.cos(angulo2);
        System.out.println("El Coseno del angulo "+ angulo2 + " grados es: "+ coseno);
        
        double aleatorio = Math.random();
        System.out.println("Numero aleatorio: "+ aleatorio);
        
        // En este caso se debe utilizar la refundicion o conversion de un tipo de datos en otro
        // Math.round devuelve un numero de tipo long y debe ser convertido en un tipo int
        double num = 5.56;
        int resultado = (int) Math.round(num);
        System.out.println("Resultado de redondedo del numero "+ num + " es: "+ resultado);
    }
}
