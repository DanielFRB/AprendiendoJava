package com.dfrb.java;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.concurrent.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class UsoThreads2 {
    public static void main(String[] args) {
        MarcoRebote2 miMarco = new MarcoRebote2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class PelotaHilos2 implements Runnable {
    public PelotaHilos2(Pelota2 p, Component c) {
        this.pelota = p;
        this.component = c;
    }
    
    @Override
    public void run() {
        // for (int i = 0; i <= 3000; i++) {
        // while (!Thread.interrupted()) {
        System.out.println("Estado del hilo al comenzar, Esta detenido?: " + Thread.currentThread().isInterrupted());
        while (!Thread.currentThread().isInterrupted()) { 
            pelota.muevePelota2(component.getBounds());
            component.paint(component.getGraphics());
        }
        System.out.println("Estado del hilo al comenzar, Esta detenido?: " + Thread.currentThread().isInterrupted());
    }
    
    private final Pelota2 pelota;
    private final Component component;
}

class Pelota2 {
    public void muevePelota2(Rectangle2D limites) {
        x += dx;
        y += dy;
        if (x < limites.getMinX()) {
            x = limites.getMinX();
            dx =- dx;
        }
        if (x + TAMX >= limites.getMaxX()) {
            x = limites.getMaxX() - TAMX;
            dx =- dx;
        }
        if (y < limites.getMinY()) {
            y = limites.getMinY();
            dy =- dy;
        }
        if (y + TAMY >= limites.getMaxY()) {
            y = limites.getMaxY() - TAMY;
            dy =- dy;
        }
    }
    
    public Ellipse2D getShape() {
        return new Ellipse2D.Double(x, y, TAMX, TAMY);
    }
    
    private static final int TAMX = 15;
    private static final int TAMY = 15;
    private double x = 0;
    private double y = 0;
    private double dx = 1;
    private double dy = 1;
}

class LaminaPelota2 extends JPanel {
    public LaminaPelota2() {
        this.pelotas = new CopyOnWriteArrayList<>();
    }
    
    public void add2(Pelota2 p) {
        pelotas.add(p);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Pelota2 p : pelotas) {
            g2.fill(p.getShape());
        }
    }
    
    private final CopyOnWriteArrayList<Pelota2> pelotas;
}

class MarcoRebote2 extends JFrame {
    public MarcoRebote2() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setTitle("Programacion Multihilos - Detener un Hilo o Thread");
        lamina = new LaminaPelota2();
        add(lamina, BorderLayout.CENTER);
        JPanel laminaBotones2 = new JPanel();
        ponerBoton2(laminaBotones2, "Dale", (ActionEvent e) -> {
            comienzaElJuego2();
        });
        ponerBoton2(laminaBotones2, "Salir", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        ponerBoton2(laminaBotones2, "Detener", (ActionEvent e) -> {
            detener();
        });
        add(laminaBotones2, BorderLayout.SOUTH);
    }
    
    public void ponerBoton2(Container c, String titulo, ActionListener oyente) {
        JButton btn = new JButton(titulo);
        c.add(btn);
        btn.addActionListener(oyente);
    }
    
    public void comienzaElJuego2() {
        Pelota2 pelota = new Pelota2();
        lamina.add2(pelota);
        Runnable runnable2 = new PelotaHilos2(pelota, lamina);
        thread = new Thread(runnable2);
        thread.start();
    }
    
    public void detener() {
        thread.interrupt();
    }
    
    private Thread thread;
    private final LaminaPelota2 lamina;
}
