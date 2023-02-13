package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaTextAreaConLambdas {
    public static void main(String[] args) {
        MarcoPruebaTextAreaConLambdas miMarco = new MarcoPruebaTextAreaConLambdas();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoPruebaTextAreaConLambdas extends JFrame {
    public MarcoPruebaTextAreaConLambdas() {
        setTitle("Prueba con Areas de Texto: 3er Ejemplo - con Lambdas");
        setBounds(500, 300, 500, 350);
        setLayout(new BorderLayout());
        laminaBtns = new JPanel();
        btnInsertar = new JButton("Insertar");
        
        /* Sin embargo, la verbosidad de las clases anónimas hizo que la programación funcional en Java,
        *  fuera una perspectiva poco atractiva.
        *  Clase Anónima del ejemplo anterior PruebaTextArea.java
        *  btnInsertar.addActionListener(new ActionListener() {
        *     @Override
        *     public void actionPerformed(ActionEvent e) {
        *         areaTexto.append("En un lugar de la Mancha de cuyo nombre no quiero acordarme...");
        *     }
        *  });
        *  A partir de Java 8 fue introducido el concepto de las expresiones lambda, o como se les llama comunmente lambdas.
        *  Las lambdas tienen una función similar a las clases anónimas, pero mucho más concisas.
        *  Por consiguiente la clase anónima anterior fue sustituida por una lambda.
        */ 
        btnInsertar.addActionListener((ActionEvent e) -> {
            areaTexto.append("En un lugar de la Mancha de cuyo nombre no quiero acordarme...");
        });
        laminaBtns.add(btnInsertar);
        btnSaltoLinea = new JButton("Salto Linea");
        
        /* Aqui se utiliza de nuevo la Clase Anonima del ejemplo anterior PruebaTextArea.java
        *  btnSaltoLinea.addActionListener(new ActionListener() {
        *      @Override
        *      public void actionPerformed(ActionEvent e) {
        *          boolean saltar = !areaTexto.getLineWrap();
        *          areaTexto.setLineWrap(saltar);
        *          btnSaltoLinea.setText(saltar ? "Quitar Salto" : "Salto Linea");
        *      }
        *  });
        *  Se sustituye la Clase Anónima por una lambda.
        */
        btnSaltoLinea.addActionListener((ActionEvent e) -> {
            boolean saltar = !areaTexto.getLineWrap();
            areaTexto.setLineWrap(saltar);
            btnSaltoLinea.setText(saltar ? "Quitar Salto" : "Salto Linea");
        });
        laminaBtns.add(btnSaltoLinea);
        add(laminaBtns, BorderLayout.SOUTH);
        areaTexto = new JTextArea(8, 20);
        areaTexto.setLineWrap(true);
        laminaBarras = new JScrollPane(areaTexto);
        add(laminaBarras, BorderLayout.CENTER);
    }
    
    private JPanel laminaBtns;
    private JButton btnInsertar, btnSaltoLinea;
    private JTextArea areaTexto;
    private JScrollPane laminaBarras;
}
