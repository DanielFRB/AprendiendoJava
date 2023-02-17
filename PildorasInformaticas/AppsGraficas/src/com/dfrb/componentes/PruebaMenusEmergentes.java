package com.dfrb.componentes;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaMenusEmergentes {
    public static void main(String[] args) {
        MarcoMenusEmergentes miMarco = new MarcoMenusEmergentes();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoMenusEmergentes extends JFrame {
    public MarcoMenusEmergentes() {
        setTitle("Prueba de Menus emergentes");
        setBounds(500, 280, 600, 350);
        LaminaMenusEmergentes miLamina = new LaminaMenusEmergentes();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaMenusEmergentes extends JPanel {
    public LaminaMenusEmergentes() {
        setLayout(new BorderLayout());
        JPanel laminaMenus = new JPanel();
        JMenuBar miBarra = new JMenuBar();
        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Estilo");
        JMenu tamagno = new JMenu("Tamaño");
        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamagno);
        laminaMenus.add(miBarra);
        add(laminaMenus, BorderLayout.NORTH);
        JTextPane miPane = new JTextPane();
        add(miPane, BorderLayout.CENTER);
        // ----------------------------------------------------------------------------------------------------------
        JPopupMenu menuEmergente = new JPopupMenu();
        JMenuItem opc1 = new JMenuItem("Opcion 1");
        JMenuItem opc2 = new JMenuItem("Opcion 2");
        JMenuItem opc3 = new JMenuItem("Opcion 3");
        menuEmergente.add(opc1);
        menuEmergente.add(opc2);
        menuEmergente.add(opc3);
        miPane.setComponentPopupMenu(menuEmergente);
    }
}
