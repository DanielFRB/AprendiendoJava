package com.dfrb.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 * @author dfrb@ne
 */

@WebServlet(name="RegistroUsuarios", urlPatterns={"/RegistroUsuarios"})
public class RegistroUsuarios extends HttpServlet {
    public RegistroUsuarios() {
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
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='en'>");
            out.println("<head>");
            out.println("<title>Servlet  Registro Usuarios</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Nombre Introducido: "+ request.getParameter("nombre") +"</p>");
            out.println("<p>Apellido Introducido: "+ request.getParameter("apellido") +"</p>");
            out.println("<p>Hora del registro: " + new Date() + "</p>");
            out.println("</body>");
            out.println("</html>");
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
}
