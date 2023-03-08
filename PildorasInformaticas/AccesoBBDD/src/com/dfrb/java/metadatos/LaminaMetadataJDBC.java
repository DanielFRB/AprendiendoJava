package com.dfrb.java.metadatos;

import java.awt.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.filechooser.*;

/**
 * @author dfrb@ne
 */

public class LaminaMetadataJDBC extends JPanel {
    public LaminaMetadataJDBC() {
        setLayout(new BorderLayout());
        comboTablas = new JComboBox();
        areaInfo = new JTextArea();
        add(areaInfo, BorderLayout.CENTER);
        conectarBBDD();
        obtenerTablas();
        comboTablas.addActionListener((e) -> {
            String tabla = (String) comboTablas.getSelectedItem();
            mostrarInfoTabla(tabla);
        });
        add(comboTablas, BorderLayout.NORTH);
    }

    public void conectarBBDD() {
        conexion = null;
        String[] datos = new String[3];
        try {
            entradaTxt = new FileReader("C:/Proyectos/AprendiendoJava/PildorasInformaticas/AccesoBBDD/src/config_bbdd.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Archivo de Configuracion No encontrado");
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo txt","txt");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(this);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                try {
                    entradaTxt = new FileReader(chooser.getSelectedFile().getAbsolutePath());
                } catch (FileNotFoundException ex) {
                    System.out.println("No se Puede Abrir el Archivo");
                }
            }
        }
        try {
            BufferedReader bufer = new BufferedReader(entradaTxt);
            for (int i = 0; i <= 2; i++) {
                datos[i] = bufer.readLine();
            }
            conexion = DriverManager.getConnection(datos[0], datos[1], datos[2]);
            entradaTxt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void obtenerTablas() {
        ResultSet resultSet = null;
        try {
            DatabaseMetaData dataBBDD = conexion.getMetaData();
            resultSet = dataBBDD.getTables(null, null, null, new String[]{"TABLE"});
            while (resultSet.next()) {
                comboTablas.addItem(resultSet.getString("TABLE_NAME"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mostrarInfoTabla(String tabla) {
        ArrayList<String> listaCampos = new ArrayList<String>();
        String consulta = "SELECT * FROM "+ tabla;
        try {
            areaInfo.setText("");
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);
            ResultSetMetaData rsMD = resultSet.getMetaData();
            for (int i = 1; i <= rsMD.getColumnCount(); i++) {
                listaCampos.add(rsMD.getColumnLabel(i));
            }
            while (resultSet.next()) {
                for (String nc : listaCampos) {
                    areaInfo.append(resultSet.getString(nc) + " ");
                }
                areaInfo.append("\n");
            }
        } catch (Exception e) {
            System.out.println("No se puede Acceder a esta Tabla");
        }
    }
    
    private JComboBox comboTablas;
    private JTextArea areaInfo;
    private Connection conexion;
    private FileReader entradaTxt;
}
