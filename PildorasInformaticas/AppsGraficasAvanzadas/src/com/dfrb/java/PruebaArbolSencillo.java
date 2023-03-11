package com.dfrb.java;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

/**
 * @author dfrb@ne
 */

public class PruebaArbolSencillo {
    public static void main(String[] args) {
        JFrame miMarco = new MarcoDeArbol();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoDeArbol extends JFrame {
    public MarcoDeArbol() {
         setTitle("Prueba de JTree");
         setBounds(350, 100, 600, 400);
         DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Mundo");
         DefaultMutableTreeNode pais = new DefaultMutableTreeNode("Venezuela");
         raiz.add(pais);
         DefaultMutableTreeNode capital = new DefaultMutableTreeNode("Caracas");
         pais.add(capital);
         DefaultMutableTreeNode distrito = new DefaultMutableTreeNode("Libertador");
         capital.add(distrito);
         distrito = new DefaultMutableTreeNode("Chacao");
         capital.add(distrito);
         DefaultMutableTreeNode estado = new DefaultMutableTreeNode("Portuguesa");
         pais.add(estado);
         distrito = new DefaultMutableTreeNode("Acarigua");
         estado.add(distrito);
         distrito = new DefaultMutableTreeNode("Guanare");
         estado.add(distrito);
         pais = new DefaultMutableTreeNode("España");
         raiz.add(pais);
         capital = new DefaultMutableTreeNode("Madrid");
         pais.add(capital);
         distrito = new DefaultMutableTreeNode("Chamartin");
         capital.add(distrito);
         distrito = new DefaultMutableTreeNode("Retiro");
         capital.add(distrito);
         estado = new DefaultMutableTreeNode("Toledo");
         pais.add(estado);
         distrito = new DefaultMutableTreeNode("Casco Histórico");
         estado.add(distrito);
         distrito = new DefaultMutableTreeNode("Santa Barbara");
         estado.add(distrito);
         JTree arbol = new JTree(raiz);
         // LaminaDeArbol miLamina = new LaminaDeArbol(arbol);
         // add(miLamina);
         Container laminaContenido = getContentPane();
         laminaContenido.add(new JScrollPane(arbol));
    }
}

class LaminaDeArbol extends JPanel { 
    public LaminaDeArbol(JTree arbol) {
        setLayout(new BorderLayout());
        add(arbol, BorderLayout.NORTH);
    }
}
