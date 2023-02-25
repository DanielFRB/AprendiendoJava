package com.dfrb.java;

/**
 * @author danfe
 */

public class BancoSincronizado {
    public static void main(String[] args) {
        Banco2 b = new Banco2();
        for (int i = 0; i < 100; i++) {
            EjecutaTransferencias2 transferencias2 = new EjecutaTransferencias2(b, i, 2000);
            Thread thread = new Thread(transferencias2);
            thread.start();
        }
    }
}

class Banco2 {
    public Banco2() {
        cuentas = new double[100];
        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i] = 2000;
        }
    }
    
    public synchronized void transferencias(int cuentaOrigen, int cuentaDestino, double monto) throws InterruptedException {
        while (cuentas[cuentaOrigen] < monto) {
            wait();
        }
        System.out.println(Thread.currentThread());
        cuentas[cuentaOrigen] -= monto;
        System.out.printf("%10.2f de %d para %d ", monto, cuentaOrigen, cuentaDestino);
        cuentas[cuentaDestino] += monto;
        System.out.printf("Saldo Total: %10.2f%n ", getSaltoTotal());
        notifyAll();
    }
    
    public double getSaltoTotal() {
        double sumaCuentas = 0;
        for (double c : cuentas) {
            sumaCuentas += c;
        }
        return sumaCuentas;
    }
    
    private final double[] cuentas;
}

class EjecutaTransferencias2 implements Runnable {
    public EjecutaTransferencias2(Banco2 b, int ctaO, double max) {
        this.banco = b;
        this.ctaOrigen = ctaO;
        this.cantMaxima = max;
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                int ctaDestino = (int) (100 * Math.random());
                double cantidad = cantMaxima * Math.random();
                banco.transferencias(ctaOrigen, ctaDestino, cantidad);
                Thread.sleep((int)(10 * Math.random()));
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private Banco2 banco;
    private int ctaOrigen;
    private double cantMaxima;
}
