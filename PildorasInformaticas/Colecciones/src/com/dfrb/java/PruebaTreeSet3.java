package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class PruebaTreeSet3 {
    public static void main(String[] args) {
        TreeSet<String> personas = new TreeSet<>();
        personas.add("Daniel");
        personas.add("Yaneth");
        personas.add("Oswaldo");
        personas.add("Barack");
        personas.add("Adelina");
        
        for (String p : personas) {
            System.out.println(p);
        }
        System.out.println("Ordenados Alfabeticamente por el metodo compareTo() de la Clase String.");
        System.out.println("------------------------");
        
        Articulo3 primero = new Articulo3(1, "Primer Articulo");
        Articulo3 segundo = new Articulo3(20, "Segundo Articulo");
        Articulo3 tercero = new Articulo3(3, "Tercer Articulo");
        
        TreeSet<Articulo3> listaArticulos = new TreeSet<>();
        listaArticulos.add(primero);
        listaArticulos.add(segundo);
        listaArticulos.add(tercero);
        
        for (Articulo3 a : listaArticulos) {
            System.out.println(a.getDescripcion());
        }
        System.out.println("Ordenados numericamente por numeroArticulo por el metodo compareTo() de la Clase Articulo3.");
        System.out.println("------------------------");
        
        // Se crea un objeto de tipo ComparadorArticulos
        ComparadorArticulos comparadorArticulos = new ComparadorArticulos();
        // Que luego se pasa como parametro al constructor de la Clase TreeSet.
        TreeSet<Articulo3> listaArticulos2 = new TreeSet<>(comparadorArticulos);
        listaArticulos2.add(primero);
        listaArticulos2.add(segundo);
        listaArticulos2.add(tercero);
        
        for (Articulo3 a : listaArticulos2) {
            System.out.println(a.getDescripcion());
        }
        System.out.println("Ordenados alfabeticamente por descripcion, por el metodo compare() de la Clase ComparadorArticulos.");
    }
}
