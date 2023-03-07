package com.dfrb.java.modelo;

import java.sql.*;

/**
 * @author dfrb@ne
 */

public class EjecutaConsultas {
    public EjecutaConsultas() {
        conexion = new ConexionDB();
    }
    
    public ResultSet filtraBBDD(String seccion, String pais) {
        Connection conecta = conexion.conectaDB();
        String paisFiltro = pais;
        String seccionFiltro = seccion;
        rs = null;
        try {
            if (!seccionFiltro.equals("Todos") && paisFiltro.equals("Todos")) {
                sendConsultaSeccion = conecta.prepareStatement(sqlSeccion);
                sendConsultaSeccion.setString(1, seccionFiltro);
                rs = sendConsultaSeccion.executeQuery();
            } else if (seccionFiltro.equals("Todos") && !paisFiltro.equals("Todos")) {
                sendConsultaPais = conecta.prepareStatement(sqlPais);
                sendConsultaPais.setString(1, paisFiltro);
                rs = sendConsultaPais.executeQuery();
            } else if (!seccionFiltro.equals("Todos") && !paisFiltro.equals("Todos")) {
                sendConsultaSeccionPais = conecta.prepareStatement(sqlSeccionPais);
                sendConsultaSeccionPais.setString(1, seccionFiltro);
                sendConsultaSeccionPais.setString(2, paisFiltro);
                rs = sendConsultaSeccionPais.executeQuery();
            } else {
                sendConsultaAll = conecta.createStatement();
                rs = sendConsultaAll.executeQuery(sqlAll);
            }
        } catch(SQLException e) {
            e.getMessage();
        }
        return rs;
    }
    
    private ConexionDB conexion;
    private Statement sendConsultaAll;
    private ResultSet rs;
    private PreparedStatement sendConsultaSeccion, sendConsultaPais, sendConsultaSeccionPais;
    private final String sqlSeccion = "SELECT * FROM PRODUCTOS WHERE seccion=?";
    private final String sqlPais = "SELECT * FROM PRODUCTOS WHERE paisDeOrigen=?";
    private final String sqlSeccionPais = "SELECT * FROM PRODUCTOS WHERE seccion=? AND paisDeOrigen=?";
    private final String sqlAll = "SELECT * FROM PRODUCTOS";
}
