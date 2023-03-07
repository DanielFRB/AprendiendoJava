package com.dfrb.java.vista;

import com.dfrb.java.controlador.ControlCargaComboBox;
import com.dfrb.java.controlador.ControlBotonConsultar;
import java.awt.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class MarcoAplicacionMVC extends JFrame {
    public MarcoAplicacionMVC() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setTitle("Consulta BBDD");
        setLayout(new BorderLayout());
        JPanel menus = new JPanel();
        menus.setLayout(new FlowLayout());
        secciones = new JComboBox();
        secciones.setEditable(false);
        secciones.addItem("Todos");
        paises = new JComboBox();
        paises.setEditable(false);
        paises.addItem("Todos");
        resultado = new JTextArea(4, 50);
        resultado.setEditable(false);
        add(resultado);
        menus.add(secciones);
        menus.add(paises);
        add(menus, BorderLayout.NORTH);
        add(resultado, BorderLayout.CENTER);
        JButton btnConsulta = new JButton("Consultar");
        add(btnConsulta, BorderLayout.SOUTH);
        btnConsulta.addActionListener(new ControlBotonConsultar(this));
        addWindowListener(new ControlCargaComboBox(this));
    }
    
    public JComboBox secciones;
    public JComboBox paises;
    public JTextArea resultado;
}
