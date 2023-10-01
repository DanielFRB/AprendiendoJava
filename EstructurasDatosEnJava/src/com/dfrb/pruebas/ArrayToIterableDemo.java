package com.dfrb.pruebas;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author dfrb@ne
 */

public class ArrayToIterableDemo {
    public static void main(String[] args) {
        String[] nombres = new String[] {"John", "Connor", "Paul", "Allen"};
        
        // 1ra Forma: Convertir Java Array a Iterable usando Java antes de la version 8
        List<String> listaNombres = Arrays.asList(nombres);
        Iterator<String> it = listaNombres.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        // 2da Forma: Convertir Java Array a Iterable usando Java 8 Stream
        System.out.println("Solucion Multilinea de Codigo:");
        Stream<String> listaNombres2 = Arrays.stream(nombres);
        Iterator<String> it2 = listaNombres2.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        System.out.println("Solucion linea simple de Codigo:");
        Arrays.stream(nombres).iterator().forEachRemaining((name) -> System.out.println(name));
        System.out.println("------------");
        
        String numeros = "1,2,3,4,5,6";
        String[] arrayNumeros = numeros.split(",");
        Stream<String> listaNumeros = Arrays.stream(arrayNumeros);
        Iterator<String> it3 = listaNumeros.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }
        System.out.println("Solucion linea simple de Codigo:");
        Arrays.stream(arrayNumeros).iterator().forEachRemaining((n) -> System.out.println(n));
    }
}
