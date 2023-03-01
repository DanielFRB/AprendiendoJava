package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class CuentasUsuariosFinal {
    public static void main(String[] args) {
        ClienteFinal clt1 = new ClienteFinal("Daniel Rondon", "987654", 2000);
        ClienteFinal clt2 = new ClienteFinal("Oswaldo Lopez", "321654", 4000);
        ClienteFinal clt3 = new ClienteFinal("Yaneth Machado", "951357", 5000);
        ClienteFinal clt4 = new ClienteFinal("Barack Obama", "951951", 15000);
        // Agregando codigo nuevo
        ClienteFinal clt5 = new ClienteFinal("Daniel Rondon", "987654", 2000);
        
        Set<ClienteFinal> clientesBanco = new HashSet<>();
        clientesBanco.add(clt1);
        clientesBanco.add(clt2);
        clientesBanco.add(clt3);
        clientesBanco.add(clt4);
        clientesBanco.add(clt5);
        
        for (ClienteFinal cliente : clientesBanco) {
            System.out.println(cliente.getNombre() +" "+ cliente.getNumCuenta()+" "+ cliente.getSaldo());
        }
    }
}
