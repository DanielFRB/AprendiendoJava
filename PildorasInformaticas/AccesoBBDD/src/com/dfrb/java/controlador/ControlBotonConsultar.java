package com.dfrb.java.controlador;

import com.dfrb.java.modelo.*;
import com.dfrb.java.vista.*;
import java.awt.event.*;
import java.sql.*;

/**
 * @author dfrb@ne
 */

public class ControlBotonConsultar implements ActionListener {
    public ControlBotonConsultar(MarcoAplicacionMVC marco) {
        this.marco = marco;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String selectSeccion = marco.secciones.getSelectedItem().toString();
        String selectPais = marco.paises.getSelectedItem().toString();
        resultadoConsulta = obj.filtraBBDD(selectSeccion, selectPais);
        try {
            marco.resultado.setText("");
            while(resultadoConsulta.next()) {
                marco.resultado.append(resultadoConsulta.getString(1));
                marco.resultado.append(", ");
                marco.resultado.append(resultadoConsulta.getString(2));
                marco.resultado.append(", ");
                marco.resultado.append(resultadoConsulta.getString(3));
                marco.resultado.append(", ");
                marco.resultado.append(resultadoConsulta.getString(4));
                marco.resultado.append(", ");
                marco.resultado.append(resultadoConsulta.getString(5));
                marco.resultado.append(", ");
                marco.resultado.append(resultadoConsulta.getString(6));
                marco.resultado.append(", ");
                marco.resultado.append(resultadoConsulta.getString(7));
                marco.resultado.append("\n");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    EjecutaConsultas obj = new EjecutaConsultas();
    private MarcoAplicacionMVC marco;
    private ResultSet resultadoConsulta;
}
