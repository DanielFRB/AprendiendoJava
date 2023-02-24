package com.dfrb.java;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class UsoThreads {
    public static void main(String[] args) {
        MarcoRebote miMarco = new MarcoRebote();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class PelotaHilos implements Runnable {
    public PelotaHilos(Pelota p, Component c) {
        this.pelota = p;
        this.component = c;
    }
    
    @Override
    public void run() {
        for (int i = 0; i <= 3000; i++) {
            pelota.muevePelota(component.getBounds());
            component.paint(component.getGraphics());
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
            }
        }
    }
    
    private final Pelota pelota;
    private final Component component;
}

class Pelota {
    public void muevePelota(Rectangle2D limites) {
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

class LaminaPelota extends JPanel {

    LaminaPelota() {
        this.pelotas = new ArrayList<>();
    }
    public void add(Pelota p) {
        pelotas.add(p);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Pelota p : pelotas) {
            g2.fill(p.getShape());
        }
    }
    
    private final ArrayList<Pelota> pelotas;
}

class MarcoRebote extends JFrame {
    public MarcoRebote() throws HeadlessException {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setTitle("Programacion Multihilos");
        lamina = new LaminaPelota();
        add(lamina, BorderLayout.CENTER);
        JPanel laminaBotones = new JPanel();
        ponerBoton(laminaBotones, "Dale", (ActionEvent e) -> {
            comienzaElJuego();
        });
        ponerBoton(laminaBotones, "Salir", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(laminaBotones, BorderLayout.SOUTH);
    }
    
    public void ponerBoton(Container c, String titulo, ActionListener oyente) {
        JButton btn = new JButton(titulo);
        c.add(btn);
        btn.addActionListener(oyente);
    }
    
    public void comienzaElJuego() {
        Pelota pelota = new Pelota();
        lamina.add(pelota);
        Runnable runnable = new PelotaHilos(pelota, lamina);
        Thread t = new Thread(runnable);
        t.start();
    }
    
    private final LaminaPelota lamina;
}
