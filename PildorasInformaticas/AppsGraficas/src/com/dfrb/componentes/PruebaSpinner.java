package com.dfrb.componentes;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaSpinner {
    public static void main(String[] args) {
        MarcoSpinner miMarco = new MarcoSpinner();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoSpinner extends JFrame {
    public MarcoSpinner() {
        setTitle("Prueba con JSpinner");
        setBounds(500, 280, 600, 350);
        LaminaSpinner miLamina = new LaminaSpinner();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaSpinner extends JPanel {
    public LaminaSpinner() {
        // String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        // JSpinner miSpinner = new JSpinner(new SpinnerListModel(fuentes));
        // JSpinner miSpinner = new JSpinner(); Constructor por defecto.
        JSpinner miSpinner = new JSpinner(new SpinnerNumberModel(0,0,20,1) {
            @Override
            public Object getNextValue() {
                return super.getPreviousValue();
            }
            
            @Override
            public Object getPreviousValue() {
                return super.getNextValue();
            }
        });
        miSpinner.setPreferredSize(new Dimension(200, 20));
        add(miSpinner);
    }
    
    /*private class MiModeloJSpinner extends SpinnerNumberModel {
        public MiModeloJSpinner(int value, int minimum, int maximum, int stepSize) {
            super(value,minimum,maximum,stepSize );
        }
        
        @Override
        public Object getNextValue() {
            return super.getPreviousValue();
        }
        
        @Override
        public Object getPreviousValue() {
            return super.getNextValue();
        }
    }*/
}
