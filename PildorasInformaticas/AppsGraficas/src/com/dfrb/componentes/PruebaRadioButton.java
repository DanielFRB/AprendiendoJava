package com.dfrb.componentes;

import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaRadioButton {
    public static void main(String[] args) {
        MarcoRadioButton miMarco = new MarcoRadioButton();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRadioButton extends JFrame {
    public MarcoRadioButton() {
        setTitle("Prueba con RadioButtons");
        setBounds(500, 280, 500, 350);
        LaminaRadioButton miLamina = new LaminaRadioButton();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaRadioButton extends JPanel {
    public LaminaRadioButton() {
        ButtonGroup miBtnGrupo1 = new ButtonGroup();
        ButtonGroup miBtnGrupo2 = new ButtonGroup();
        JRadioButton radBtn1 = new JRadioButton("Azul", false);
        JRadioButton radBtn2 = new JRadioButton("Rojo", true);
        JRadioButton radBtn3 = new JRadioButton("Verde", false);
        JRadioButton radBtn4 = new JRadioButton("Masculino", false);
        JRadioButton radBtn5 = new JRadioButton("Femenino", false);
        miBtnGrupo1.add(radBtn1);
        miBtnGrupo1.add(radBtn2);
        miBtnGrupo1.add(radBtn3);
        miBtnGrupo2.add(radBtn4);
        miBtnGrupo2.add(radBtn5);
        add(radBtn1);
        add(radBtn2);
        add(radBtn3);
        add(radBtn4);
        add(radBtn5);
    }
}
