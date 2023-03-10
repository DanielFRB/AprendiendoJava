package com.dfrb.webapp;

import java.sql.*;
import java.util.*;
import javax.sql.DataSource;

/**
 * @author dfrb@ne
 */

public class ModeloProductos {
    public ModeloProductos(DataSource conextionPool) {
        this.conextionPool = conextionPool;
    }
    
    public List<Productos> getProductos() throws Exception {
        List<Productos> listaProductos = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = conextionPool.getConnection();
            String selectSentence = "SELECT * FROM PRODUCTOS";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSentence);
            while (resultSet.next()) {
                String codArt = resultSet.getString("codArticulo");
                String seccArt = resultSet.getString("seccion");
                String nombArt = resultSet.getString("nombreArticulo");
                double precioArt = resultSet.getDouble("precio");
                String fechaArt = resultSet.getString("fecha");
                String importArt = resultSet.getString("importado");
                String pOrigen = resultSet.getString("paisDeOrigen");
                Productos tempProductos = new Productos(codArt, seccArt, nombArt, precioArt, fechaArt, importArt, pOrigen);
                listaProductos.add(tempProductos);
            }
        } finally {
            resultSet.close();
            statement.close();
            connection.close();
        }
        return listaProductos;
    }
    
    public void createProducto(Productos p) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = conextionPool.getConnection();
            String insertSentence = "INSERT INTO PRODUCTOS (codArticulo, seccion, nombreArticulo, precio, fecha, importado, paisDeOrigen) VALUES (?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(insertSentence);
            statement.setString(1, p.getCodArticulo());
            statement.setString(2, p.getSeccion());
            statement.setString(3, p.getNombreArticulo());
            statement.setDouble(4, p.getPrecio());
            statement.setString(5, p.getFecha());
            statement.setString(6, p.getImportado());
            statement.setString(7, p.getPaisDeOrigen());
            statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            statement.close();
            connection.close();
        }
    }

    public Productos getProducto(String codArt) throws Exception {
        Productos prod = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = conextionPool.getConnection();
            String selectSentence = "SELECT * FROM PRODUCTOS WHERE codArticulo=?";
            statement = connection.prepareStatement(selectSentence);
            statement.setString(1, codArt);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String codArtic = resultSet.getString("codArticulo");
                String seccArt = resultSet.getString("seccion");
                String nombArt = resultSet.getString("nombreArticulo");
                double precioArt = resultSet.getDouble("precio");
                String fechaArt = resultSet.getString("fecha");
                String importArt = resultSet.getString("importado");
                String pOrigen = resultSet.getString("paisDeOrigen");
                prod = new Productos(codArtic, seccArt, nombArt, precioArt, fechaArt, importArt, pOrigen);
            } else {
                throw new Exception("No se ha encontrado el producto con codigo articulo = "+ codArt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            resultSet.close();
            statement.close();
            connection.close();
        }
        return prod;
    }

    public void updateProducto(Productos pActualizar) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = conextionPool.getConnection();
            String updateSentence = "UPDATE PRODUCTOS SET seccion=?, nombreArticulo=?, precio=?, fecha=?, importado=?, paisDeOrigen=?  WHERE codArticulo=?";
            statement = connection.prepareStatement(updateSentence);
            statement.setString(1, pActualizar.getSeccion());
            statement.setString(2, pActualizar.getNombreArticulo());
            statement.setDouble(3, pActualizar.getPrecio());
            statement.setString(4, pActualizar.getFecha());
            statement.setString(5, pActualizar.getImportado());
            statement.setString(6, pActualizar.getPaisDeOrigen());
            statement.setString(7, pActualizar.getCodArticulo());
            statement.execute();
        } finally {
            statement.close();
            connection.close();
        }
    }

    public void deleteProduct(String codArt) throws Exception {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = conextionPool.getConnection();
            String deleteSentence = "DELETE FROM PRODUCTOS WHERE codArticulo=?";
            statement = connection.prepareStatement(deleteSentence);
            statement.setString(1, codArt);
            statement.execute();
        } finally {
            statement.close();
            connection.close();
        }
    }
    
    private DataSource conextionPool;
}
