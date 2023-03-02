package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class PruebaTreeSetFinal {
    public static void main(String[] args) {
        TreeSet<String> personas = new TreeSet<>();
        personas.add("Daniel");
        personas.add("Yaneth");
        personas.add("Oswaldo");
        personas.add("Barack");
        personas.add("Adelina");
        
        System.out.println("Ordenados Alfabeticamente por el metodo compareTo() de la Clase String.");
        for (String p : personas) {
            System.out.println(p);
        }
        System.out.println("------------------------");
        
        ArticuloFinal primero = new ArticuloFinal(1, "Primer Articulo");
        ArticuloFinal segundo = new ArticuloFinal(20, "Segundo Articulo");
        ArticuloFinal tercero = new ArticuloFinal(3, "Tercer Articulo");
        
        TreeSet<ArticuloFinal> listaArticulos = new TreeSet<>();
        listaArticulos.add(primero);
        listaArticulos.add(segundo);
        listaArticulos.add(tercero);
        
        System.out.println("Ordenados numericamente por numeroArticulo por el metodo compareTo() de la Clase ArticuloFinal.");
        for (ArticuloFinal a : listaArticulos) {
            System.out.println(a.getDescripcion());
        }
        System.out.println("------------------------");
        
        // Usando clases anonimas internas
        TreeSet<ArticuloFinal> listaArticulos2 = new TreeSet<>(new Comparator<ArticuloFinal>() {
            @Override
            public int compare(ArticuloFinal art1, ArticuloFinal art2) {
                String desc1 = art1.getDescripcion();
                String desc2 = art2.getDescripcion();
                return desc1.compareTo(desc2);
            }
        });
        listaArticulos2.add(primero);
        listaArticulos2.add(segundo);
        listaArticulos2.add(tercero);
        
        System.out.println("Ordenados alfabeticamente por descripcion, por el metodo compare() de la Clase Anonima Interna.");
        for (ArticuloFinal a : listaArticulos2) {
            System.out.println(a.getDescripcion());
        }
        System.out.println("------------------------");
        
        // Usando Expresiones Lambdas, se simplifica aun mas la clase anonima interna.
        TreeSet<ArticuloFinal> listaArticulos3 = new TreeSet<>((art1, art2) -> art1.getDescripcion().compareTo(art2.getDescripcion()));
        listaArticulos3.add(primero);
        listaArticulos3.add(segundo);
        listaArticulos3.add(tercero);
        
        System.out.println("Ordenados alfabeticamente por descripcion, por el metodo compareTo() de la Expresion Lambda.");
        for (ArticuloFinal a : listaArticulos3) {
            System.out.println(a.getDescripcion());
        }
    }
}
