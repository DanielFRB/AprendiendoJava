package com.dfrb.java;

/**
 * @author dfrb@ne
 */

public class SincronizandoHilos {
    public static void main(String[] args) {
        HilosVarios hilo1 = new HilosVarios();
        HilosVarios hilo2 = new HilosVarios();
        hilo1.start();
        try {
            hilo1.join();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        hilo2.start();
        try {
            hilo2.join();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        System.out.println("Terminando las tareas");
    }
}

class HilosVarios extends Thread {
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
