package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaRadioButton3 {
    public static void main(String[] args) {
        MarcoRadioButton3 miMarco = new MarcoRadioButton3();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRadioButton3 extends JFrame {
    public MarcoRadioButton3() {
        setTitle("Prueba Nro 3 con RadioButtons y Eventos");
        setBounds(500, 280, 500, 350);
        LaminaRadioButton3 miLamina = new LaminaRadioButton3();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaRadioButton3 extends JPanel {
    public LaminaRadioButton3() {
        setLayout(new BorderLayout());
        Font miLetra = new Font("Serif", Font.PLAIN, 14);
        texto = new JLabel("En un lugar de la Mancha...");
        texto.setFont(miLetra);
        JPanel laminaTexto = new JPanel();
        laminaTexto.add(texto);
        add(laminaTexto, BorderLayout.CENTER);
        laminaRadBtn = new JPanel();
        miBtnGroup = new ButtonGroup();
        colocarBtn("Pequeño", false, 8);
        colocarBtn("Normal", true, 14);
        colocarBtn("Grande", false, 26);
        colocarBtn("Muy Grande", false, 42);
        add(laminaRadBtn, BorderLayout.SOUTH);
    }
    
    public void colocarBtn(String nombre, boolean seleccionado, final int tamagno) {
        JRadioButton btn = new JRadioButton(nombre, seleccionado);
        miBtnGroup.add(btn);
        laminaRadBtn.add(btn);
        ActionListener miEvento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font("Serif", Font.PLAIN, tamagno));
            }
        };
        btn.addActionListener(miEvento);
    }
    
    private JLabel texto;
    private JRadioButton radBtn1, radBtn2, radBtn3, radBtn4;
    private ButtonGroup miBtnGroup;
    private JPanel laminaRadBtn;
}
