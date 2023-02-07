package com.dfrb.java;

import java.awt.event.*;
import java.util.Date;
import javax.swing.*;
import java.awt.Toolkit;

/**
 * @author dfrb@ne
 */

public class PruebaTemporizador2 {
    public static void main(String[] args) {
        Reloj reloj = new Reloj(3000, true);
        reloj.enMarcha();
        JOptionPane.showMessageDialog(null, "Pulce Aceptar para detener");
        System.exit(0);
    }
}

class Reloj {   
    public Reloj(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }
    
    public void enMarcha() {
        ActionListener evento = new DameLaHora2();
        Timer miTempo = new Timer(intervalo, evento);
        miTempo.start();
    }
    
    private class DameLaHora2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Date ahora = new Date();
            System.out.println("La hora cada 3 segundos: "+ ahora);
            if (sonido) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
    
    private int intervalo;
    private boolean sonido;
}
