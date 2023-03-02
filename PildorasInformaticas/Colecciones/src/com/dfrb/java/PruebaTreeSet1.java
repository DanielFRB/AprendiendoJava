package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class PruebaTreeSet1 {
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
        
        
        Articulo1 primero = new Articulo1(1, "Primer Articulo");
        Articulo1 segundo = new Articulo1(20, "Segundo Articulo");
        Articulo1 tercero = new Articulo1(3, "Tercer Articulo");
        Articulo1 cuarto = new Articulo1(2, "Cuarto Articulo");
        Articulo1 quinto = new Articulo1(18, "Quinto Articulo");
        
        // Eliminamos el bloque try-catch que colocamos en el archivo PruebaTreeSet.java que capturaba la excepcion
        // que arrojaba el compilador debido a que la Clase Articulo NO implementaba la interface Comparable.
        // La Clase Articulo se actualizo y se denomino ahora Articulo1, esta Clase SI implelenta la Interface Comparable y sobreescribe
        // el metodo compareTo() de tal forma que ahora se realizara el ordenamiento por su numeroArticulo.
        TreeSet<Articulo1> listaArticulos = new TreeSet<>();
        listaArticulos.add(primero);
        listaArticulos.add(segundo);
        listaArticulos.add(tercero);
        listaArticulos.add(cuarto);
        listaArticulos.add(quinto);
            
        for (Articulo1 a : listaArticulos) {
            System.out.println(a.getDescripcion());
        }
        System.out.println("Ordenados numericamente por numeroArticulo por el metodo compareTo() de la Clase Articulo1.");
    }
}
