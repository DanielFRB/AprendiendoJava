package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class CuentasUsuarios {
    public static void main(String[] args) {
        Cliente clt1 = new Cliente("Daniel Rondon", "987654", 2000);
        Cliente clt2 = new Cliente("Oswaldo Lopez", "321654", 4000);
        Cliente clt3 = new Cliente("Yaneth Machado", "951357", 5000);
        Cliente clt4 = new Cliente("Barack Obama", "951951", 15000);
        
        Set<Cliente> clientesBanco = new HashSet<>();
        clientesBanco.add(clt1);
        clientesBanco.add(clt2);
        clientesBanco.add(clt3);
        clientesBanco.add(clt4);
        
        for (Cliente cliente : clientesBanco) {
            System.out.println(cliente.getNombre() +" "+ cliente.getNumCuenta()+" "+ cliente.getSaldo());
        }
    }
}
