package com.dfrb.java;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * @author dfrb@ne
 */

public class PruebaTemporizador3 {
    public static void main(String[] args) {
        Reloj2 reloj = new Reloj2();
        reloj.enMarcha(3000, true);
        JOptionPane.showMessageDialog(null, "Pulce Aceptar para detener");
        System.exit(0);
    }
}

class Reloj2 {
    public void enMarcha(int intervalo, final boolean sonido) {
        class DameLaHora3 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date ahora = new Date();
                System.out.println("La hora cada 3 segundos: "+ ahora);
                if (sonido) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        ActionListener oyente = new DameLaHora3();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }
}
