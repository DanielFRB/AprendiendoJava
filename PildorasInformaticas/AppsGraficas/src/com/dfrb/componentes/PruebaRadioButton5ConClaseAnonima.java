package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaRadioButton5ConClaseAnonima {
    public static void main(String[] args) {
        MarcoRadioButton5 miMarco = new MarcoRadioButton5();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRadioButton5 extends JFrame {
    public MarcoRadioButton5() {
        setTitle("Prueba Nro 5 con RadioButtons, Eventos y Clase Anónima");
        setBounds(500, 280, 500, 350);
        LaminaRadioButton5 miLamina = new LaminaRadioButton5();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaRadioButton5 extends JPanel {
    public LaminaRadioButton5() {
        setLayout(new BorderLayout());
        Font miLetra = new Font("Serif", Font.PLAIN, 14);
        texto = new JLabel("En un lugar de la Mancha...");
        texto.setFont(miLetra);
        JPanel laminaTexto = new JPanel();
        laminaTexto.add(texto);
        add(laminaTexto, BorderLayout.CENTER);
        laminaRadBtn = new JPanel();
        miBtnGroup = new ButtonGroup();
        ponerBtns("Pequeño", false, 8);
        ponerBtns("Normal", true, 14);
        ponerBtns("Grande", false, 26);
        ponerBtns("Muy Grande", false, 42);
        add(laminaRadBtn, BorderLayout.SOUTH);
    }
    
    public void ponerBtns(String nombre, boolean seleccionado, final int tamagno) {
        JRadioButton btn = new JRadioButton(nombre, seleccionado);
        miBtnGroup.add(btn);
        laminaRadBtn.add(btn);
        // Utilizando una Clase Anónima
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font("Serif", Font.PLAIN, tamagno));
            }
        });
    }
    
    private JLabel texto;
    private JRadioButton radBtn1, radBtn2, radBtn3, radBtn4;
    private ButtonGroup miBtnGroup;
    private JPanel laminaRadBtn;
}
