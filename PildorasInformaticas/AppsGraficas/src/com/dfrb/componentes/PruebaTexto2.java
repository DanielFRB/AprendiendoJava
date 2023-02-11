package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaTexto2 {
    public static void main(String[] args) {
        MarcoTexto2 miMarco = new MarcoTexto2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoTexto2 extends JFrame {
    public MarcoTexto2() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setVisible(true);
        setTitle("Cuadros de Texto");
        LaminaTexto2 miLamina = new LaminaTexto2();
        add(miLamina);
    }
}

class LaminaTexto2 extends JPanel {
    public LaminaTexto2 () {
        setLayout(new BorderLayout());
        miLamina2 = new JPanel();
        miLamina2.setLayout(new FlowLayout());
        resultado = new JLabel("", JLabel.CENTER);
        JLabel txt1 = new JLabel("Email: ");
        miLamina2.add(txt1);
        campo1 = new JTextField(20);
        miLamina2.add(campo1);
        add(resultado);
        JButton miBtn = new JButton("Comprobar");
        DameTexto miEvento = new DameTexto();
        miBtn.addActionListener(miEvento);
        miLamina2.add(miBtn);
        add(miLamina2, BorderLayout.NORTH);
    }
    
    private class DameTexto implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int correcto = 0;
            String email = campo1.getText().trim();
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    correcto++;
                }
            }
            if (correcto != 1) {
                resultado.setText("Incorrecto");
            } else {
                resultado.setText("Correcto");
            }
        }
    }
    
    private JPanel miLamina2;
    private JTextField campo1;
    private JLabel resultado;
}
