package com.dfrb.java;

import java.util.concurrent.locks.*;

/**
 * @author dfrb@ne
 */

public class BancoSinSincronizar {
    public static void main(String[] args) {
        Banco banco = new Banco();
        for (int i = 0; i < 100; i++) {
            EjecutaTransferencias transferencias = new EjecutaTransferencias(banco, i, 2000);
            Thread thread = new Thread(transferencias);
            thread.start();
        }
    }
}

class Banco {   
    public Banco() {
        cuentas = new double[100];
        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i] = 2000;
        }
        saldoSuficiente = cierraCodigo.newCondition();
    }
    
    public void transferencias(int cuentaOrigen, int cuentaDestino, double monto) throws InterruptedException {
        cierraCodigo.lock();
        try {
            while (cuentas[cuentaOrigen] < monto) {
                saldoSuficiente.await();
            }
            System.out.println(Thread.currentThread());
            cuentas[cuentaOrigen] -= monto;
            System.out.printf("%10.2f de %d para %d ", monto, cuentaOrigen, cuentaDestino);
            cuentas[cuentaDestino] += monto;
            System.out.printf("Saldo Total: %10.2f%n ", getSaltoTotal());
            saldoSuficiente.signalAll();
        } finally {
            cierraCodigo.unlock();
        }
    }
    
    public double getSaltoTotal() {
        double sumaCuentas = 0;
        for (double c : cuentas) {
            sumaCuentas += c;
        }
        return sumaCuentas;
    }
    
    private final double[] cuentas;
    private Lock cierraCodigo = new ReentrantLock();
    private Condition saldoSuficiente;
}

class EjecutaTransferencias implements Runnable {
    public EjecutaTransferencias(Banco b, int ctaO, double max) {
        this.banco = b;
        this.ctaOrigen = ctaO;
        this.cantMaxima = max;
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                int ctaDestino = (int) (100 * Math.random()); // Genera las cuentas destino
                double cantidad = cantMaxima * Math.random(); // Cantidad a transferir
                banco.transferencias(ctaOrigen, ctaDestino, cantidad);
                Thread.sleep((int)(10 * Math.random()));
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private Banco banco;
    private int ctaOrigen;
    private double cantMaxima;
}