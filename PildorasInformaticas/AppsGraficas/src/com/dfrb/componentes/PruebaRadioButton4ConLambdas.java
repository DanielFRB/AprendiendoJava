package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class PruebaRadioButton4ConLambdas {
    public static void main(String[] args) {
        MarcoRadioButton4 miMarco = new MarcoRadioButton4();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRadioButton4 extends JFrame {
    public MarcoRadioButton4() {
        setTitle("Prueba Nro 4 con RadioButtons, Eventos y Lambdas");
        setBounds(500, 280, 500, 350);
        LaminaRadioButton4 miLamina = new LaminaRadioButton4();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaRadioButton4 extends JPanel {
    public LaminaRadioButton4() {
        setLayout(new BorderLayout());
        Font miLetra = new Font("Serif", Font.PLAIN, 14);
        texto = new JLabel("En un lugar de la Mancha...");
        texto.setFont(miLetra);
        JPanel laminaTexto = new JPanel();
        laminaTexto.add(texto);
        add(laminaTexto, BorderLayout.CENTER);
        laminaRadBtn = new JPanel();
        miBtnGroup = new ButtonGroup();
        colocarBtns("Pequeño", false, 8);
        colocarBtns("Normal", true, 14);
        colocarBtns("Grande", false, 26);
        colocarBtns("Muy Grande", false, 42);
        add(laminaRadBtn, BorderLayout.SOUTH);
    }
    
    public void colocarBtns(String nombre, boolean seleccionado, final int tamagno) {
        JRadioButton btn = new JRadioButton(nombre, seleccionado);
        miBtnGroup.add(btn);
        laminaRadBtn.add(btn);
        /* En el Ejercicio del video 94: Botones de Radio II. El codigo planteado por el profesor es el siguiente:
        *  ActionListener miEvento = new ActionListener() {
        *      @Override
        *      public void actionPerformed(ActionEvent) {
        *          //  TODO Auto-generated method stub
        *          texto.setFont(new Font("Serif", Font.PLAIN, tamagno));
        *      }
        *  };
        *  btn.addActionListener(miEvento);
        *
        *  Es de hacer la acotacion de que el profesor esta utilizando Java 7, la cual en el momento de hacer el video,
        *  no estaban definidas las expresiones lambdas por lo que no se hacen referencia en el mismo.
        *  El codigo antes mencionado se puede eliminar.
        *  Yo lo cambio por una expresion lambda */
        btn.addActionListener((ActionEvent e) -> {
            texto.setFont(new Font("Serif", Font.PLAIN, tamagno));
        });
    }
    
    private JLabel texto;
    private JRadioButton radBtn1, radBtn2, radBtn3, radBtn4;
    private ButtonGroup miBtnGroup;
    private JPanel laminaRadBtn;
}
