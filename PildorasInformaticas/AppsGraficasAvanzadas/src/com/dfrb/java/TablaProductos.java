package com.dfrb.java;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author dfrb@ne
 */

public class TablaProductos {
    public static void main(String[] args) {
        JFrame miMarco = new MarcoProductos();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoProductos extends JFrame {
    public MarcoProductos() {
        setBounds(350, 100, 600, 300);
        setTitle("Tabla de Productos");
        JPanel superior = new JPanel();
        nombresDeTablas = new JComboBox();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
            datosBBDD = connection.getMetaData();
            rs = datosBBDD.getTables(null, null, null, null);
            while (rs.next()) {
                nombresDeTablas.addItem(rs.getString("TABLE_NAME"));
            }
        } catch (Exception e) {
            System.out.println("No se puede conectar con la BBDD");
            e.printStackTrace();
        }
        nombresDeTablas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tablaSeleccionada = (String) nombresDeTablas.getSelectedItem();
                String consulta = "SELECT * FROM "+ tablaSeleccionada;
                try {
                    // En el video el metodo createStatement no recibe ningun parametro, pero en mi caso particular me saltara una excepcion
                    // de tipo java.sql.SQLException: Operation not allowed for a result set of type ResultSet.TYPE_FORWARD_ONLY,
                    // dicha excepcion salta en el metodo getRowCount() de la clase ResulSetModeloTabla, porque antes de ejecutar el
                    // return rsRegistros.getRow(), en la linea anterior se debe indicar la sentencia rsRegistros.last(), que ubica el puntero
                    // del resulset al ultimo registro y asi podemos obtener la cantidad de registros de la tabla consultada en la BBDD.
                    // Para resolver esta excepcion agrego los dos parametros que se indican en el metodo createStatement.
                    sentencia = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    rs = sentencia.executeQuery(consulta);
                    modelo = new ResulSetModeloTabla(rs);
                    JTable tabla = new JTable(modelo);
                    add(new JScrollPane(tabla), BorderLayout.CENTER);
                    validate();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        superior.add(nombresDeTablas);
        add(superior, BorderLayout.NORTH);
    }
    
    private JComboBox nombresDeTablas;
    private DatabaseMetaData datosBBDD;
    private ResultSet rs;
    private Connection connection;
    private Statement sentencia;
    private ResulSetModeloTabla modelo;
}

class ResulSetModeloTabla extends AbstractTableModel {
    public ResulSetModeloTabla(ResultSet resultSet) {
        this.rsRegistros = resultSet;
        try {
            this.resmd = rsRegistros.getMetaData();
        } catch (Exception e) {
            System.out.println("No se tiene acceso a la Metadata de la BBDD");
            e.printStackTrace();
        }
    }
    
    @Override
    public int getColumnCount() {
        try {
            return resmd.getColumnCount();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    @Override
    public int getRowCount() {
        try {
            rsRegistros.last();
            return rsRegistros.getRow();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            rsRegistros.absolute(rowIndex + 1);
            return rsRegistros.getObject(columnIndex + 1);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String getColumnName(int col) {
        try {
            return  resmd.getColumnName(col + 1);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private ResultSet rsRegistros;
    private ResultSetMetaData resmd;
}
