package com.dfrb.java.conexionDB;

import java.sql.*;

/**
 * @author dfrb@ne
 */

public class InsertaRegistroEnPruebasDB {
    public static void main(String[] args) {
        try {
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
            Statement miStatement = miConexion.createStatement();
            String sentenciaSql = "INSERT INTO PRODUCTOS (codArticulo, seccion, nombreArticulo, precio, fecha, importado, paisDeOrigen) VALUES ('ACD030', 'DEPORTES', 'BOTINES PARA BASE BALL', 128.60, '2022-08-01', '1', 'USA')";
            miStatement.executeUpdate(sentenciaSql);
            System.out.println("Datos Ingresados Correctamente a la tabla PRODUCTOS");
        } catch (Exception e) {
            System.out.println("No se pudo establecer la Conexion con la BD");
            e.printStackTrace();
        }
    }
}
