package com.dfrb.java;

import java.util.*;


/**
 * @author dfrb@ne
 */

public class CuentasUsuariosConIteradores {
    public static void main(String[] args) {
        ClienteFinal clt1 = new ClienteFinal("Daniel Rondon", "987654", 2000);
        ClienteFinal clt2 = new ClienteFinal("Oswaldo Lopez", "321654", 4000);
        ClienteFinal clt3 = new ClienteFinal("Yaneth Machado", "951357", 5000);
        ClienteFinal clt4 = new ClienteFinal("Barack Obama", "951951", 15000);
        ClienteFinal clt5 = new ClienteFinal("Daniel Rondon", "987654", 2000);
        ClienteFinal clt6 = new ClienteFinal("Daniel Rondon", "987654", 2000);
        
        Set<ClienteFinal> listaClientes = new HashSet<>();
        listaClientes.add(clt1);
        listaClientes.add(clt2);
        listaClientes.add(clt3);
        listaClientes.add(clt4);
        listaClientes.add(clt5);
        listaClientes.add(clt6);
        
        for (ClienteFinal c : listaClientes) {
            System.out.println(c.getNombre() +" "+ c.getNumCuenta()+" "+ c.getSaldo());
        }
        
        Iterator<ClienteFinal> it1 = listaClientes.iterator();
        while (it1.hasNext()) {
            String nombreCliente = it1.next().getNombre();
            if (nombreCliente.equals("Daniel Rondon")) {
                it1.remove();
            }
        }
        
        Iterator<ClienteFinal> it2 = listaClientes.iterator();
        while (it2.hasNext()) {
            String nombreCliente = it2.next().getNombre();
            System.out.println(nombreCliente);
        }
    }
}
