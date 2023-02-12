package com.dfrb.componentes;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * @author dfrb@ne
 */

public class PruebaCampoPassword {
    public static void main(String[] args) {
        MarcoPruebaCampoPassword miMarco = new MarcoPruebaCampoPassword();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoPruebaCampoPassword extends JFrame {
    public MarcoPruebaCampoPassword() {
        setBounds(500, 250, 500, 350);
        LaminaPruebaCampoPassword miLamina = new LaminaPruebaCampoPassword();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaPruebaCampoPassword extends JPanel {
    public LaminaPruebaCampoPassword() {
        setLayout(new BorderLayout());
        JPanel laminaSuperior = new JPanel();
        laminaSuperior.setLayout(new GridLayout(2, 2));
        add(laminaSuperior, BorderLayout.NORTH);
        JLabel etiqueta1 = new JLabel("Usuario");
        JLabel etiqueta2 = new JLabel("Contraseña");
        JTextField usuario = new JTextField(15);
        clave = new JPasswordField(15);
        CompruebaPassword miEvento = new CompruebaPassword();
        clave.getDocument().addDocumentListener(miEvento);
        laminaSuperior.add(etiqueta1);
        laminaSuperior.add(usuario);
        laminaSuperior.add(etiqueta2);
        laminaSuperior.add(clave);
        JButton btnEnviar = new JButton("Enviar");
        add(btnEnviar, BorderLayout.SOUTH);
    }
    
    private class CompruebaPassword implements DocumentListener {
        @Override
        public void insertUpdate(DocumentEvent e) {
            char[] contra;
            contra = clave.getPassword();
            if (contra.length < 8 || contra.length > 12) {
                clave.setBackground(Color.RED);
            } else {
                clave.setBackground(Color.WHITE);
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            char[] contra;
            contra = clave.getPassword();
            if (contra.length < 8 || contra.length > 12) {
                clave.setBackground(Color.RED);
            } else {
                clave.setBackground(Color.WHITE);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            
        }
    }
    
    private JPasswordField clave;
}
