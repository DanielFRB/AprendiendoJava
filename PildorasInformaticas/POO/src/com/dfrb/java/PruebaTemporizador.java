package com.dfrb.java;

import java.awt.event.*;
import java.util.Date;
import javax.swing.*;


/**
 * @author dfrb@ne
 */

public class PruebaTemporizador {
    public static void main(String[] args) {
        DameLaHora oyente = new DameLaHora();
        Timer miTemporizador = new Timer(5000, oyente);
        miTemporizador.start();
        JOptionPane.showMessageDialog(null, "Pulce Aceptar para detener");
        System.exit(0);
    }
}

class DameLaHora implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        System.out.println("La hora cada 5 segundos: "+ ahora);
    }
}
