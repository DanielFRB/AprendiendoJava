package com.dfrb.webapp;

import java.io.*;
import java.sql.*;
import javax.annotation.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.sql.*;

/**
 * @author dfrb@ne
 */

@WebServlet(name="ServletPruebasConexionBD", urlPatterns={"/ServletPruebasConexionBD"})
public class ServletPruebasConexionBD extends HttpServlet {
    public ServletPruebasConexionBD() {
        super();
    }

     /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request.
     * @param response servlet response.
     * @throws ServletException if a servlet-specific error occurs.
     * @throws IOException if an I/O error occurs.
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter output = response.getWriter();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = conextionPool.getConnection();
            String sqlSelectSentence = "SELECT * FROM PRODUCTOS";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlSelectSentence);
            while (resultSet.next()) {
                String nombreArticulo = resultSet.getString(3);
                output.println("<p>"+ nombreArticulo +"</p>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request.
     * @param response servlet response.
     * @throws ServletException if a servlet-specific error occurs.
     * @throws IOException if an I/O error occurs.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request.
     * @param response servlet response.
     * @throws ServletException if a servlet-specific error occurs.
     * @throws IOException if an I/O error occurs.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Resource(name = "jdbc/Productos")
    private DataSource conextionPool;
}
