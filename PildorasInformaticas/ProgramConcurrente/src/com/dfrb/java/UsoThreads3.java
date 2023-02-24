package com.dfrb.java;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.concurrent.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class UsoThreads3 {
    public static void main(String[] args) {
        MarcoRebote3 miMarco = new MarcoRebote3();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class PelotaHilos3 implements Runnable {
    public PelotaHilos3(Pelota3 p, Component c) {
        this.pelota = p;
        this.component = c;
    }
    
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) { 
            pelota.muevePelota3(component.getBounds());
            component.paint(component.getGraphics());
        }
    }
    
    private final Pelota3 pelota;
    private final Component component;
}

class Pelota3 {
    public void muevePelota3(Rectangle2D limites) {
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
    
    public Ellipse2D getShape2() {
        return new Ellipse2D.Double(x, y, TAMX, TAMY);
    }
    
    private static final int TAMX = 15;
    private static final int TAMY = 15;
    private double x = 0;
    private double y = 0;
    private double dx = 1;
    private double dy = 1;
}

class LaminaPelota3 extends JPanel {
    public LaminaPelota3() {
        this.pelotas = new CopyOnWriteArrayList<>();
    }
    
    public void add3(Pelota3 p) {
        pelotas.add(p);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Pelota3 p : pelotas) {
            g2.fill(p.getShape2());
        }
    }
    
    private final CopyOnWriteArrayList<Pelota3> pelotas;
}

class MarcoRebote3 extends JFrame {
    public MarcoRebote3() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setTitle("Programacion Concurrente - Interrupcion de Varios Hilos");
        lamina = new LaminaPelota3();
        add(lamina, BorderLayout.CENTER);
        JPanel laminaBotones3 = new JPanel();
        
        arrancaH1 = new JButton("Hilo 1");
        arrancaH1.addActionListener((ActionEvent e) -> {
            comienzaElJuego3(e);
        });
        laminaBotones3.add(arrancaH1);
        
        arrancaH2 = new JButton("Hilo 2");
        arrancaH2.addActionListener((ActionEvent e) -> {
            comienzaElJuego3(e);
        });
        laminaBotones3.add(arrancaH2);
        
        arrancaH3 = new JButton("Hilo 3");
        arrancaH3.addActionListener((ActionEvent e) -> {
            comienzaElJuego3(e);
        });
        laminaBotones3.add(arrancaH3);
        
        detieneH1 = new JButton("Detiene H1");
        detieneH1.addActionListener((ActionEvent e) -> {
            detener(e);
        });
        laminaBotones3.add(detieneH1);
        
        detieneH2 = new JButton("Detiene H2");
        detieneH2.addActionListener((ActionEvent e) -> {
            detener(e);
        });
        laminaBotones3.add(detieneH2);
        
        detieneH3 = new JButton("Detiene H3");
        detieneH3.addActionListener((ActionEvent e) -> {
            detener(e);
        });
        laminaBotones3.add(detieneH3);
        
        salir = new JButton("Salir");
        salir.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        laminaBotones3.add(salir);
        add(laminaBotones3, BorderLayout.SOUTH);
    }
    
    public void comienzaElJuego3(ActionEvent e) {
        Pelota3 pelota = new Pelota3();
        lamina.add3(pelota);
        Runnable runnable3 = new PelotaHilos3(pelota, lamina);
        if (e.getSource().equals(arrancaH1)) {
            thread = new Thread(runnable3);
            thread.start();
        } else if (e.getSource().equals(arrancaH2)) {
            thread2 = new Thread(runnable3);
            thread2.start();
        } else if (e.getSource().equals(arrancaH3)) {
            thread3 = new Thread(runnable3);
            thread3.start();
        }
    }
    
    public void detener(ActionEvent e) {
        if (e.getSource().equals(detieneH1)) {
            thread.interrupt();
        } else if (e.getSource().equals(detieneH2)) {
            thread2.interrupt();
        } else if (e.getSource().equals(detieneH3)) {
            thread3.interrupt();
        }
    }
    
    private Thread thread, thread2, thread3;
    private JButton arrancaH1, arrancaH2, arrancaH3, detieneH1, detieneH2, detieneH3, salir;
    private final LaminaPelota3 lamina;
}
