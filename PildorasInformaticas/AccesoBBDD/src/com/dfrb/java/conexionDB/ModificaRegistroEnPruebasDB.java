package com.dfrb.java.conexionDB;

import java.sql.*;

/**
 * @author dfrb@ne
 */

public class ModificaRegistroEnPruebasDB {
    public static void main(String[] args) {
        try {
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
            Statement miStatement = miConexion.createStatement();
            String sentenciaSql = "UPDATE PRODUCTOS SET PRECIO=PRECIO*2 WHERE codArticulo = 'ACD012'";
            miStatement.executeUpdate(sentenciaSql);
            System.out.println("Precio del Producto Actualizado");
        } catch (Exception e) {
            System.out.println("No se pudo establecer la Conexion con la BD");
            e.printStackTrace();
        }
    }
}
