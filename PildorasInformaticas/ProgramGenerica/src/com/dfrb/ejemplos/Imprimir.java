package com.dfrb.ejemplos;

import com.dfrb.clasespropias.Empleado;

/**
 * @author dfrb@ne
 */

public class Imprimir {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.0, 2.5, 3.7, 4.2, 5.5};
        String[] strings = {"Barack", "Yaneth", "Daniel", "Oswaldo", "Maritza"};
        Empleado[] listaEmpleados = {new Empleado("Ana", 45, 2850), new Empleado("Jose", 48, 2750),
                                                                    new Empleado("Carla", 25, 1750)};
        
        System.out.println("Impresion de Arreglos sin utilizar programacion generica");
        Impresora impresora = new Impresora();
        impresora.imprimir(integers);
        impresora.imprimir(doubles);
        impresora.imprimir(strings);
        impresora.imprimir(listaEmpleados);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Impresion de Arreglos utilizando un metodo generico de una clase NO generica");
        ImpresoraConMetodoGenerico impresoraConMetodoGenerico = new ImpresoraConMetodoGenerico();
        impresoraConMetodoGenerico.imprimir(integers);
        impresoraConMetodoGenerico.imprimir(doubles);
        impresoraConMetodoGenerico.imprimir(strings);
        impresoraConMetodoGenerico.imprimir(listaEmpleados);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Impresion de Arreglos utilizando un metodo de una clase generica");
        ImpresoraGenerica<Integer> impresoraIntegers = new ImpresoraGenerica<>();
        impresoraIntegers.imprimir(integers);
        ImpresoraGenerica<Double> impresoraDoubles = new ImpresoraGenerica<>();
        impresoraDoubles.imprimir(doubles);
        ImpresoraGenerica<String> impresoraStrings = new ImpresoraGenerica<>();
        impresoraStrings.imprimir(strings);
        ImpresoraGenerica<Empleado> impresoraEmpleados = new ImpresoraGenerica<>();
        impresoraEmpleados.imprimir(listaEmpleados);
    }
}
