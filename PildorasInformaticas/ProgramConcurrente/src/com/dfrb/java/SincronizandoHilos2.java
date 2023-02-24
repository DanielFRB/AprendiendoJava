package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class SincronizandoHilos2 {
    public static void main(String[] args) {
        HilosVarios2 hilo1 = new HilosVarios2();
        HilosVarios3 hilo2 = new HilosVarios3(hilo1);
        hilo2.start();
        hilo1.start();
        System.out.println("Terminando las tareas");
    }
}

class HilosVarios2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ejecutando Hilo "+ getName());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class HilosVarios3 extends Thread {
    public HilosVarios3(Thread hilo) {
        this.hilo = hilo;
    }
    
    @Override
    public void run() {
        try {
            hilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Ejecutando Hilo "+ getName());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    private Thread hilo;
}
