package com.dfrb.java.controlador;

import com.dfrb.java.modelo.*;
import com.dfrb.java.vista.*;
import java.awt.event.*;

/**
 * @author dfrb@ne
 */

public class ControlCargaComboBox extends WindowAdapter {
    public ControlCargaComboBox(MarcoAplicacionMVC marco) {
        this.marco = marco;
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        obj.ejecutaConsultas();
        try {
            while (obj.rs.next()) {
                marco.secciones.addItem(obj.rs.getString(1));
            }
            while (obj.rs2.next()) {
                marco.paises.addItem(obj.rs2.getString(1));
            }
        } catch (Exception e2) {
            System.out.println("No se pudo establecer la Conexion con la BD");
            e2.printStackTrace();
        }
    }
    
    CargaComboBox obj = new CargaComboBox();
    private MarcoAplicacionMVC marco;
}
