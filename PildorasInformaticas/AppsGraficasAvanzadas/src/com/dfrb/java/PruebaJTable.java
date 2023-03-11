package com.dfrb.java;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaJTable {
    public static void main(String[] args) {
        JFrame miMarco = new MarcoDeTabla();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoDeTabla extends JFrame {
    public MarcoDeTabla() {
        setBounds(350, 100, 600, 300);
        setTitle("Prueba de JTable: Los Planetas");
        JTable tablaPlanetas = new JTable(datosFila, columnas);
        add(new JScrollPane(tablaPlanetas), BorderLayout.CENTER);
        JButton btnImprimir = new JButton("Imprimir");
        btnImprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    tablaPlanetas.print();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        JPanel laminaBtn = new JPanel();
        laminaBtn.add(btnImprimir);
        add(laminaBtn, BorderLayout.SOUTH);
    }
    
    private String[] columnas = {"Nombre", "Radio", "Lunas", "Gaseoso"};
    private Object[][] datosFila = {
        {"Mercurio", 2440.0, 0, false}, {"Venus", 6052.0, 0, false},
        {"Tierra", 6378.0, 1, false}, {"Marte", 3397.0, 2, false},
        {"Júpiter", 71493.0, 79, true}, {"Saturno", 60267.0, 82, true},
        {"Urano", 25557.0, 27, true}, {"Neptuno", 24766.0, 14, true},
        {"Plutón", 1188.3, 5, false}
    };
}
