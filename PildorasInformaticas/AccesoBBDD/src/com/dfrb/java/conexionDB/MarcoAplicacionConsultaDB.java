package com.dfrb.java.conexionDB;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class MarcoAplicacionConsultaDB extends JFrame {
    public MarcoAplicacionConsultaDB() {
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
        btnConsulta.addActionListener((ActionEvent e) -> {
            ejecutaConsulta();
        });
        add(btnConsulta, BorderLayout.SOUTH);
        
        try {
            pruebasDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
            Statement miState = pruebasDB.createStatement();
            String consulta = "SELECT DISTINCTROW seccion FROM PRODUCTOS";
            ResultSet rs = miState.executeQuery(consulta);
            while (rs.next()) {
                secciones.addItem(rs.getString(1));
            }
            rs.close();
            consulta = "SELECT DISTINCTROW paisDeOrigen FROM PRODUCTOS";
            rs = miState.executeQuery(consulta);
            while (rs.next()) {
                paises.addItem(rs.getString(1));
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("No se pudo establecer la Conexion con la BD");
            e.printStackTrace();
        }
    }
    
    private void ejecutaConsulta() {
        ResultSet rs = null;
        try {
            resultado.setText("");
            String seccion = secciones.getSelectedItem().toString();
            String pais = paises.getSelectedItem().toString();
            if (!seccion.equals("Todos") && pais.equals("Todos")) {
                sendQuerySeccion = pruebasDB.prepareStatement(querySeccion);
                sendQuerySeccion.setString(1, seccion);
                rs = sendQuerySeccion.executeQuery();
            } else if (seccion.equals("Todos") && !pais.equals("Todos")) {
                sendQueryPais = pruebasDB.prepareStatement(queryPais);
                sendQueryPais.setString(1, pais);
                rs = sendQueryPais.executeQuery();
            } else if (!seccion.equals("Todos") && !pais.equals("Todos")) {
                sendQuerySeccionAndPais = pruebasDB.prepareStatement(querySeccionAndPais);
                sendQuerySeccionAndPais.setString(1, seccion);
                sendQuerySeccionAndPais.setString(2, pais);
                rs = sendQuerySeccionAndPais.executeQuery();
            } else {
                miStatement = pruebasDB.createStatement();
                rs = miStatement.executeQuery(queryAll);
            }
            while (rs.next()) {
                resultado.append(rs.getString(1));
                resultado.append(", ");
                resultado.append(rs.getString(2));
                resultado.append(", ");
                resultado.append(rs.getString(3));
                resultado.append(", ");
                resultado.append(rs.getString(4));
                resultado.append(", ");
                resultado.append(rs.getString(7));
                resultado.append("\n");
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private Connection pruebasDB;
    private Statement miStatement;
    private PreparedStatement sendQuerySeccion, sendQueryPais, sendQuerySeccionAndPais;
    private final String querySeccion = "SELECT * FROM PRODUCTOS WHERE seccion=?";
    private final String queryPais = "SELECT * FROM PRODUCTOS WHERE paisDeOrigen=?";
    private final String querySeccionAndPais = "SELECT * FROM PRODUCTOS WHERE seccion=? AND paisDeOrigen=?";
    private final String queryAll = "SELECT * FROM PRODUCTOS";
    private JComboBox secciones;
    private JComboBox paises;
    private JTextArea resultado;
}
