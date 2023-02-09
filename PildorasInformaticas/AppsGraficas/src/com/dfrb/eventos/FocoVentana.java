package com.dfrb.eventos;

import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class FocoVentana extends JFrame implements WindowFocusListener {
    public static void main(String[] args) {
        FocoVentana miVentana = new FocoVentana();
        miVentana.Iniciar();
    }
    
    public void Iniciar() {
        marco1 = new FocoVentana();
        marco2 = new FocoVentana();
        marco1.setVisible(true);
        marco2.setVisible(true);
        marco1.setBounds(200, 200, 400, 250);
        marco2.setBounds(800, 200, 400, 250);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        if (e.getSource() == marco1) {
            marco1.setTitle("Tengo el foco");
        } else {
            marco2.setTitle("Tengo el foco");
        }
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        if (e.getSource() == marco1) {
            marco1.setTitle("");
        } else {
            marco2.setTitle("");
        }
    }
    
    FocoVentana marco1;
    FocoVentana marco2;
}
