package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

// Inicialmente tenemos el ejemplo mostrado en el video # 186 del Curso Java. Colecciones VIII. TreeSet I.
// Se construlle un objeto denominado personas que basicamente es un arbol de tipo String.
// Una de las caracteristicas principales de la coleccion TreeSet implementa una ordenacion interna de su contenido,
// por defecto, para ello el tipo de dato a introducir debe implementar la Interface Comparable.
public class PruebaTreeSet {
    public static void main(String[] args) {
        TreeSet<String> personas = new TreeSet<String>();
        personas.add("Daniel");
        personas.add("Yaneth");
        personas.add("Oswaldo");
        personas.add("Barack");
        personas.add("Adelina");
        
        for (String p : personas) {
            // Al momento de hacer el llamado de esta instruccion podemos observar que los elementos introducidos al objeto
            // "personas" que instancia la clase TreeSet, se encuentran ordenados de forma alfabetica y esto ocurre porque la
            // Clase String que establece el tipo de dato almacenado por el TreeSet, implementa la clase Comparable por consiguiente
            // el TreeSet hace uso del metodo compareTo() de la Clase String para hacer el ordenamiento correspondiente.
            System.out.println(p);
        }
        System.out.println("Ordenados Alfabeticamente por el metodo compareTo() de la Clase String.");
        System.out.println("------------------------");
        
        // La Clase PruebaTreeSet construye objetos de tipo Articulo cuyo contructor recibe dos parametros, el primero es un valor tipo int,
        // que corresponde con un numero de Articulo y el segundo es un valor de tipo String que corresponde con una descripcion.
        // Inicialmente la clase Articulo NO implementa ninguna interface ni extiende ninguna otra clase. 
        Articulo primero = new Articulo(1, "Primer Articulo");
        Articulo segundo = new Articulo(20, "Segundo Articulo");
        Articulo tercero = new Articulo(3, "Tercer Articulo");
        Articulo cuarto = new Articulo(2, "Cuarto Articulo");
        Articulo quinto = new Articulo(18, "Quinto Articulo");
        
        // Al intentar construir el objeto listaArticulos que instancia la Clase TreeSet origina una excepcion de tipo 
        // java.lang.ClassCastException indicando que: class com.dfrb.java.Articulo cannot be cast to class java.lang.Comparable 
        // Esto ocurre porque la Clase Articulo NO implementa la interface Comparable.
        // En nuestro caso capturamos la excepcion que nos lanza el compilador para que el programa pueda termiar su ejecucion.
        // Esto sera corregido en el siguente archivo PruebaTreeSet1.java.
        try {
            TreeSet<Articulo> listaArticulos = new TreeSet<>();
            listaArticulos.add(primero);
            listaArticulos.add(segundo);
            listaArticulos.add(tercero);
            
            for (Articulo a : listaArticulos) {
                System.out.println(a.getDescripcion());
            }
        } catch(ClassCastException e) {
            System.out.println("La Clase Articulos debe Implementar la Interface Comparable.");
        }
        System.out.println("------------------------");
    }
}
