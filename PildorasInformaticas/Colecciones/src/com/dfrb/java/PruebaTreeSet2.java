package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class PruebaTreeSet2 {
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
        
        Articulo2 primero = new Articulo2(1, "Primer Articulo");
        Articulo2 segundo = new Articulo2(20, "Segundo Articulo");
        Articulo2 tercero = new Articulo2(3, "Tercer Articulo");
        
        TreeSet<Articulo2> listaArticulos = new TreeSet<>();
        listaArticulos.add(primero);
        listaArticulos.add(segundo);
        listaArticulos.add(tercero);
        
        for (Articulo2 a : listaArticulos) {
            System.out.println(a.getDescripcion());
        }
        System.out.println("Ordenados numericamente por numeroArticulo por el metodo compareTo() de la Clase Articulo2.");
        System.out.println("------------------------");
        
        // Ahora se requiere que el objeto listaArticulos2 pueda realizar un ordenamiento por la propiedad "descripcion"
        // con la que se construye el objeto que instancia la Clase Articulo2, pero debido a que no se puede reutilizar el metodo
        // compareTo() ya que este se encarga de ordenar los articulos por numeroArticulo y necesitamos otro metodo que nos
        // permita realizar la ordenacion por descripcion, para ello podemos hacer que la Clase Articulo2 implemente otra interface
        // que en este caso seria la Interface Compatator.
        // Esta es una solucion a medias ya que existe otras soluciones que se pueden aplicar para resolver este nuevo requerimiento,
        // por consiguiente sera modificado posteriormente.
        // Se construye un nuevo objeto de tipo Articulo2 que nos permitira poder utilizar el metodo compare() de la interface Comparator.
        Articulo2 comparadorArticulos = new Articulo2();
        // Que luego se pasa como parametro al constructor de la Clase TreeSet.
        TreeSet<Articulo2> listaArticulos2 = new TreeSet<>(comparadorArticulos);
        listaArticulos2.add(primero);
        listaArticulos2.add(segundo);
        listaArticulos2.add(tercero);
        
        for (Articulo2 a : listaArticulos2) {
            // El tipo de dato de descripcion es String por lo que el metodo compare(), utiliza el metodo compareTo() y este los ordena
            // de forma alfabetica.
            System.out.println(a.getDescripcion());
        }
        System.out.println("Ordenados alfabeticamente por descripcion, por el metodo compare() de la Clase Articulo2.");
    }
}
