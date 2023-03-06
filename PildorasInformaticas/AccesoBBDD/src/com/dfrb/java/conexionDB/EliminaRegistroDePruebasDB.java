package com.dfrb.java.conexionDB;

import java.sql.*;

/**
 * @author dfrb@ne
 */

public class EliminaRegistroDePruebasDB {
    public static void main(String[] args) {
        try {
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
            Statement miStatement = miConexion.createStatement();
            String sentenciaSql = "DELETE FROM PRODUCTOS WHERE codArticulo = 'ACD017'";
            miStatement.executeUpdate(sentenciaSql);
            System.out.println("Producto Eliminado");
        } catch (Exception e) {
            System.out.println("No se pudo establecer la Conexion con la BD");
            e.printStackTrace();
        }
    }
}
