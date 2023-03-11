package com.dfrb.java;

import java.awt.*;
import java.util.List;
import javax.swing.*;
import javax.swing.event.*;

/**
 * @author dfrb@ne
 */

public class PruebaLista {
    public static void main(String[] args) {
        JFrame miMarco = new MarcoDeLista();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoDeLista extends JFrame {
    public MarcoDeLista()  {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        setTitle("Prueba de JList");
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", 
                                         "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        listaMeses = new JList<>(meses);
        listaMeses.setVisibleRowCount(5);
        JScrollPane laminaDesplazamiento = new JScrollPane(listaMeses);
        laminaLista = new JPanel();
        laminaLista.add(laminaDesplazamiento);
        laminaTexto = new JPanel();
        rotulo = new JLabel("Mes seleccionado: ");
        laminaTexto.add(rotulo);
        /** Usando una Clase Interna como se Muestra en el Video
        listaMeses.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                List<String> valores = listaMeses.getSelectedValuesList();
                StringBuilder texto = new StringBuilder("Mes seleccionado: ");
                for (String elem : valores) {
                    String palabra = elem;
                    texto.append(palabra);
                    texto.append(" ");
                }
                rotulo.setText(texto.toString());
            }
        });
        */
        listaMeses.addListSelectionListener((ListSelectionEvent e) -> {
            List<String> valores = listaMeses.getSelectedValuesList();
            StringBuilder texto = new StringBuilder("Mes seleccionado: ");
            for (String elem : valores) {
                String palabra = elem;
                texto.append(palabra);
                texto.append(" ");
            }
            rotulo.setText(texto.toString());
        });
        add(laminaLista, BorderLayout.NORTH);
        add(laminaTexto, BorderLayout.SOUTH);
    }
    
    private JList<String> listaMeses;
    private JPanel laminaLista, laminaTexto;
    private JLabel rotulo;
}
