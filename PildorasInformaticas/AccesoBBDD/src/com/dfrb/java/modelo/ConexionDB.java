package com.dfrb.java.modelo;

import java.sql.*;

/**
 * @author dfrb@ne
 */

public class ConexionDB {
    public ConexionDB() {
    }
    
    public Connection conectaDB() {
        try {
            conexionPruebasDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
        } catch (Exception e) {
            System.out.println("No se pudo establecer la Conexion con la BBDD");
            e.printStackTrace();
        }
        return conexionPruebasDB;
    }
    
    private Connection conexionPruebasDB = null;
}
