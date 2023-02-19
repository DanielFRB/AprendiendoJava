package com.dfrb.componentes;

import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaDisposicionAvanzada {
    public static void main(String[] args) {
        MarcoDisposicionAvanzada miMarco = new MarcoDisposicionAvanzada();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoDisposicionAvanzada extends JFrame {
    public MarcoDisposicionAvanzada() throws HeadlessException {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setTitle("Disposiciones Avanzadas I: Box");
        LaminaDisposicionAvanzada miLamina = new LaminaDisposicionAvanzada();
        add(miLamina);
    }
}

class LaminaDisposicionAvanzada extends JPanel {
    public LaminaDisposicionAvanzada() {
        setLayout(new BorderLayout());
        JLabel lblNombre = new JLabel("Nombre");
        JTextField txtNombre = new JTextField(20);
        txtNombre.setMaximumSize(txtNombre.getPreferredSize());
        Box cajaH1 = Box.createHorizontalBox();
        cajaH1.add(lblNombre);
        cajaH1.add(Box.createHorizontalStrut(10));
        cajaH1.add(txtNombre);
        JLabel lblClave = new JLabel("Contraseña");
        JTextField txtClave = new JTextField(20);
        txtClave.setMaximumSize(txtClave.getPreferredSize());
        Box cajaH2 = Box.createHorizontalBox();
        cajaH2.add(lblClave);
        cajaH2.add(Box.createHorizontalStrut(10));
        cajaH2.add(txtClave);
        JButton btnOk = new JButton("Ok");
        JButton btnCancel = new JButton("Cancelar");
        Box cajaH3 = Box.createHorizontalBox();
        cajaH3.add(btnOk);
        cajaH3.add(Box.createHorizontalGlue());
        cajaH3.add(btnCancel);
        Box cajaVertical = Box.createVerticalBox();
        cajaVertical.add(cajaH1);
        cajaVertical.add(cajaH2);
        cajaVertical.add(cajaH3);
        add(cajaVertical, BorderLayout.CENTER);
    }
}
