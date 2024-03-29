package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class Cliente {
    public Cliente(String n, String c, double s) {
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

    private String nombre;
    private String numCuenta;
    private double saldo;
}
