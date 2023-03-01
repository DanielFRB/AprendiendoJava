package com.dfrb.java;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class ClienteFinal {
    public ClienteFinal(String n, String c, double s) {
        this.nombre = n;
        this.numCuenta = c;
        this.saldo = s;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // Agregando metodos hashCode() e equals() para comprarar varios objetos de una misma clase
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.numCuenta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClienteFinal other = (ClienteFinal) obj;
        return Objects.equals(this.numCuenta, other.numCuenta);
    }

    private String nombre;
    private String numCuenta;
    private double saldo;
}
