package com.dfrb.pruebas;

import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class LaminaBotones extends JPanel {
    public LaminaBotones(String titulo, String[] opciones) {
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        grupoBtn = new ButtonGroup();
        for (int i = 0; i < opciones.length; i++) {
            JRadioButton radBtn = new JRadioButton(opciones[i]);
            radBtn.setActionCommand(opciones[i]);
            add(radBtn);
            grupoBtn.add(radBtn);
            radBtn.setSelected(i == 0);
        }
    }
    
    public String getSeleccion() {
        return grupoBtn.getSelection().getActionCommand();
    }
    
    private ButtonGroup grupoBtn;
}
