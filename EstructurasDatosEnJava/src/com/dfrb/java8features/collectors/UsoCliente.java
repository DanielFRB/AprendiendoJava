package com.dfrb.java8features.collectors;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author dfrb@ne
 */

public class UsoCliente {
    public static void main(String[] args) {
        Articulo art1 = new Articulo(1001, "Item 1", LocalDate.of(2020, 1, 1));
        Articulo art2 = new Articulo(1002, "Item 2", LocalDate.of(2020, 2, 1));
        Articulo art3 = new Articulo(1003, "Item 3", LocalDate.of(2020, 3, 1));
        Articulo art4 = new Articulo(1004, "Item 4", LocalDate.of(2020, 4, 1));
        Articulo art5 = new Articulo(1005, "Item 5", LocalDate.of(2020, 5, 1));
        
        List<Articulo> lstArticulos1 = new ArrayList<>();
        lstArticulos1.add(art1);
        lstArticulos1.add(art2);
        lstArticulos1.add(art3);
        lstArticulos1.add(art4);
        lstArticulos1.add(art5);
        
        Cliente clt1 = new Cliente(101, "Cliente 1", "M", true, lstArticulos1);
        
        Articulo art6 = new Articulo(2001, "Item 6", LocalDate.of(2021, 8, 1));
        Articulo art7 = new Articulo(2002, "Item 7", LocalDate.of(2021, 3, 1));
        
        List<Articulo> lstArticulos2 = new ArrayList<>();
        lstArticulos2.add(art6);
        lstArticulos2.add(art7);
        
        Cliente clt2 = new Cliente(102, "Cliente 2", "F", true, lstArticulos2);
        
        Articulo art8 = new Articulo(2003, "Item 8", LocalDate.of(2021, 6, 1));
        Articulo art9 = new Articulo(2004, "Item 9", LocalDate.of(2021, 10, 1));
        Articulo art10 = new Articulo(2005, "Item 10", LocalDate.of(2022, 1, 1));
        
        List<Articulo> lstArticulos3 = new ArrayList<>();
        lstArticulos3.add(art8);
        lstArticulos3.add(art9);
        lstArticulos3.add(art10);
        
        Cliente clt3 = new Cliente(103, "Cliente 3", "M", true, lstArticulos3);
        
        Cliente clt4 = new Cliente(104, "Cliente 4", "F", true, new ArrayList<Articulo>());
        
        List<Cliente> lstClientes = new ArrayList<>();
        lstClientes.add(clt1);
        lstClientes.add(clt2);
        lstClientes.add(clt3);
        lstClientes.add(clt4);
        
        // Uso del metodo flatMapping() para buscar Articulos por Genero del Cliente
        Map<String, Set<Articulo>> artsPorGenero = lstClientes.stream()
                .collect(Collectors.groupingBy((c) -> c.getGenero(), 
                        Collectors.flatMapping((c) -> c.getLstArticulos().stream(), Collectors.toSet())));
        
        System.out.println("Articulos por Genero de Cliente: "+ artsPorGenero);
        
        Map<String, Long> cuentaArtPorGenero = lstClientes.stream()
                .collect(Collectors.groupingBy((c) -> c.getGenero(),
                        Collectors.flatMapping((clt) -> clt.getLstArticulos().stream(), Collectors.counting())));
        
        System.out.println("Conteo de Articulos por Genero: "+ cuentaArtPorGenero);
    }
}
