package com.dfrb.pruebas;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @author dfrb@ne
 */

public class MinMaxFinder {
    public static void main(String[] args) {
        IntStream numeros = Arrays.stream(new int[] {10, 20, 11, 27, 45, 82, 120, 7, 47, 119});
        OptionalInt menor = numeros.min();
        
        IntStream numerosMayor = Arrays.stream(new int[] {10, 20, 11, 27, 45, 82, 120, 7, 47, 119});
        OptionalInt mayor = numerosMayor.max();
        
        menor.ifPresent((int valor) -> {
            System.out.println("Valor minimo: "+ valor);
        });
        mayor.ifPresent((int valor) -> {
            System.out.println("Valor maximo: "+ valor);
        });
    }
}
