package com.dfrb.java;

import javax.swing.*;
import javax.swing.table.*;

/**
 * @author dfrb@ne
 */

public class PruebaJTable2 {
    public static void main(String[] args) {
        JFrame miMarco = new MarcoTablaPersonalizada();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoTablaPersonalizada extends JFrame {
    public MarcoTablaPersonalizada() {
        setBounds(350, 100, 600, 300);
        setTitle("Prueba de JTable: Los Planetas");
        TableModel modeloTabla = new ModeloTablaPersonalizada();
        JTable tabla = new JTable(modeloTabla);
        add(new JScrollPane(tabla));
        
    }
}

class ModeloTablaPersonalizada extends AbstractTableModel {
    @Override
    public int getRowCount() {
        return 5;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        int z = rowIndex + 1;
        int y = columnIndex + 1;
        return " " + z + " "+ y;
    }
    
    @Override
    public String getColumnName(int c) {
        int n = c + 1;
        return "Columna "+ n;
    }
    
}
