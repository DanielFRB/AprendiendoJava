package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaTextArea {
    public static void main(String[] args) {
        MarcoPruebaTextArea miMarco = new MarcoPruebaTextArea();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoPruebaTextArea extends JFrame {
    public MarcoPruebaTextArea() {
        setTitle("Prueba con Areas de Texto: 2do Ejemplo");
        setBounds(500, 300, 500, 350);
        setLayout(new BorderLayout());
        laminaBtns = new JPanel();
        btnInsertar = new JButton("Insertar");
        /* Esto se conoce como Instanciar una Clase Anónima y se utiliza para crear un objeto funcional.
        *  Las clases anónimas eran adecuadas para los patrones de diseño clásicos orientados a objetos 
        *  que requerían objetos funcionales.
        *  En este ejemplo al hacer el llamado o construccion de la interzace ActionListener (new) dentro del metodo
        *  addActionListener directamente permite eliminar el paso de construir una clase adicional que implemente
        *  dicha interfaz (ActionListener), se elimina el paso de crear un objeto que reciba la accion, para luego asignarlo
        *  al objeto final que en este caso es un JButton.
        */
        btnInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.append("En un lugar de la Mancha de cuyo nombre no quiero acordarme...");
            }
        });
        
        laminaBtns.add(btnInsertar);
        btnSaltoLinea = new JButton("Salto Linea");
        
        // Aqui se implementa de nuevo la Clase Anonima
        btnSaltoLinea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean saltar = !areaTexto.getLineWrap();
                areaTexto.setLineWrap(saltar);
                btnSaltoLinea.setText(saltar ? "Quitar Salto" : "Salto Linea");
            }
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
