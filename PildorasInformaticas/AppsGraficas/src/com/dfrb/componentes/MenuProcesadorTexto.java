package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class MenuProcesadorTexto {
    public static void main(String[] args) {
        MarcoProcesadorTexto miMarco = new MarcoProcesadorTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoProcesadorTexto extends JFrame {
    public MarcoProcesadorTexto() {
        setTitle("Procesador de Textos V1.0");
        setBounds(500, 280, 600, 350);
        LaminaProcesadorTexto miLamina = new LaminaProcesadorTexto();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaProcesadorTexto extends JPanel {
    public  LaminaProcesadorTexto() {
        setLayout(new BorderLayout());
        JPanel laminaMenus = new JPanel();
        JMenuBar miMenuBar = new JMenuBar();
        // -------------------------------------------------------------------------------------------
        JMenu menuFuente = new JMenu("Fuente");
        JMenuItem arial = new JMenuItem("Arial");
        arial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miPane.setFont(new Font("Arial", Font.PLAIN, 18));
            }
        });
        JMenuItem courier = new JMenuItem("Courier");
        courier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miPane.setFont(new Font("Courier", Font.PLAIN, 18));
            }
        });
        JMenuItem verdana = new JMenuItem("Verdana");
        verdana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miPane.setFont(new Font("Verdana", Font.PLAIN, 18));
            }
        });
        menuFuente.add(arial);
        menuFuente.add(courier);
        menuFuente.add(verdana);
        // -------------------------------------------------------------------------------------------
        JMenu menuEstilo = new JMenu("Estilos");
        JMenuItem negrita = new JMenuItem("Negrita");
        JMenuItem cursiva = new JMenuItem("Cursiva");
        menuEstilo.add(negrita);
        menuEstilo.add(cursiva);
        // -------------------------------------------------------------------------------------------
        JMenu menuTamagno = new JMenu("Tamaño");
        JMenuItem tam12 = new JMenuItem("12");
        JMenuItem tam16 = new JMenuItem("16");
        JMenuItem tam20 = new JMenuItem("20");
        JMenuItem tam24 = new JMenuItem("24");
        menuTamagno.add(tam12);
        menuTamagno.add(tam16);
        menuTamagno.add(tam20);
        menuTamagno.add(tam24);
        // -------------------------------------------------------------------------------------------
        miMenuBar.add(menuFuente);
        miMenuBar.add(menuEstilo);
        miMenuBar.add(menuTamagno);
       // -------------------------------------------------------------------------------------------
        laminaMenus.add(miMenuBar);
        add(laminaMenus, BorderLayout.NORTH);
        miPane = new JTextPane();
        add(miPane, BorderLayout.CENTER);
    }
    
    private JTextPane miPane;
}
