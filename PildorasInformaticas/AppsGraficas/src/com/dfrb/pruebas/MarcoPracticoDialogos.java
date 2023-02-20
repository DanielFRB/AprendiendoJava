package com.dfrb.pruebas;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Date;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class MarcoPracticoDialogos extends JFrame {
    public MarcoPracticoDialogos() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setTitle("Prueba de Dialogos");
        JPanel laminaCuadricula = new JPanel();
        laminaCuadricula.setLayout(new GridLayout(2,3));
        laminaTipo = new LaminaBotones("Tipo", new String[] {
            "Mensaje", "Confirmar", "Opción", "Entrada"
        });
        laminaTipoMensaje = new LaminaBotones("Tipo de Mensaje", new String[] {
            "ERROR_MESSAGE", "INFORMATION_MESSAGE", "WARNING_MESSAGE", 
            "QUESTION_MESSAGE", "PLAIN_MESSAGE"
        });
        laminaMensaje = new LaminaBotones("Mensaje", new String[] {
            "Cadena", "Icono", "Componente", "Otros", "Object[]"
        });
        laminaConfirmar = new LaminaBotones("Confirmar", new String[] {
            "DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION"
        });
        laminaOpcion = new LaminaBotones("Opción", new String[] {
            "String[]", "Icon[]", "Object[]"
        });
        laminaEntrada = new LaminaBotones("Entrada", new String[] {
            "Campo de Texto", "Combo"
        });
        
        setLayout(new BorderLayout());
        
        laminaCuadricula.add(laminaTipo);
        laminaCuadricula.add(laminaTipoMensaje);
        laminaCuadricula.add(laminaMensaje);
        laminaCuadricula.add(laminaConfirmar);
        laminaCuadricula.add(laminaOpcion);
        laminaCuadricula.add(laminaEntrada);
        
        JPanel laminaBtn = new JPanel();
        JButton btnShow = new JButton("Mostrar");
        btnShow.addActionListener(new AccionMostrar());
        laminaBtn.add(btnShow);
        
        add(laminaCuadricula, BorderLayout.CENTER);
        add(laminaBtn, BorderLayout.SOUTH);
    }
    
    private class AccionMostrar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch (laminaTipo.getSeleccion()) {
                case "Mensaje":
                    JOptionPane.showMessageDialog(MarcoPracticoDialogos.this, getMensaje(), "Titulo", getIconoAndShowConfirmar(laminaTipoMensaje));
                break;
                case "Confirmar":
                    JOptionPane.showConfirmDialog(MarcoPracticoDialogos.this, getMensaje(), "Titulo", getIconoAndShowConfirmar(laminaConfirmar), getIconoAndShowConfirmar(laminaTipoMensaje));
                break;
                case "Opción":
                    JOptionPane.showOptionDialog(MarcoPracticoDialogos.this, getMensaje(), "Titulo", 1, getIconoAndShowConfirmar(laminaTipoMensaje), null, getOpcion(laminaOpcion), null);
                break;
                case "Entrada":
                    if (laminaEntrada.getSeleccion().equals("Campo de Texto")) {
                        JOptionPane.showInputDialog(MarcoPracticoDialogos.this, getMensaje(), "Titulo", getIconoAndShowConfirmar(laminaTipoMensaje));
                    } else {
                        JOptionPane.showInputDialog(MarcoPracticoDialogos.this, getMensaje(), "Titulo", getIconoAndShowConfirmar(laminaTipoMensaje), null, new String[] {"Amarillo", "Azul", "Rojo"}, "Amarillo");
                    }  
                break;
            }
        }
    }
    
    public Object getMensaje() {
        String s = laminaMensaje.getSeleccion();
        switch (s) {
            case "Cadena":
                return cadenaMensaje;
            case "Icono":
                return iconoMensaje;
            case "Componente":
                return compMensaje;
            case "Otros":
                return objetoMensaje;
            case "Object[]":
                return new Object[] {cadenaMensaje, iconoMensaje, compMensaje, objetoMensaje};
            default:
                return null;
        }
    }
    
    public int getIconoAndShowConfirmar(LaminaBotones lamina) {
        String s = lamina.getSeleccion();
        switch (s) {
            case "ERROR_MESSAGE":
            case "YES_NO_OPTION":
                return 0;
            case "INFORMATION_MESSAGE":
            case "YES_NO_CANCEL_OPTION":
                return 1;
            case "WARNING_MESSAGE":
            case "OK_CANCEL_OPTION":
                return 2;
            case "QUESTION_MESSAGE":
                return 3;
            case "PLAIN_MESSAGE":
            case "DEFAULT_OPTION":
                return -1;
            default:
                return 0;
        }
    }
    
    public Object[] getOpcion(LaminaBotones lamina) {
        String s = lamina.getSeleccion();
        switch (s) {
            case "String[]":
                return new String[] {"Amarillo", "Azul", "Rojo"};
            case "Icon[]":
                return new Object[] {new ImageIcon("src/images/bolaAmarilla.gif"), new ImageIcon("src/images/bolaAzul.gif"), new ImageIcon("src/images/bolaRoja.gif")};
            case "Object[]":
                return new Object[] {cadenaMensaje, iconoMensaje, compMensaje, objetoMensaje};
            default:
                return null;
        }
    }
    
    private LaminaBotones laminaTipo, laminaTipoMensaje, laminaMensaje, laminaConfirmar, laminaOpcion, laminaEntrada;
    private String cadenaMensaje = "Mensaje Enviado";
    private Icon iconoMensaje = new ImageIcon("src/images/bolaAzul.gif");
    private Object objetoMensaje = new Date();
    private Component compMensaje = new LaminaMensaje();
}

class LaminaMensaje extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2D = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
        g2D.setColor(Color.YELLOW);
        g2D.fill(rectangulo);
    }
}
