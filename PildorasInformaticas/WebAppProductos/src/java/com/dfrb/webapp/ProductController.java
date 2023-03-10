package com.dfrb.webapp;

import java.io.*;
import java.util.*;
import javax.annotation.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.sql.DataSource;

/**
 * @author dfrb@ne
 */

@WebServlet(name="ProductController", urlPatterns={"/ProductController"})
public class ProductController extends HttpServlet {
    private ModeloProductos modeloProductos;
    @Resource(name = "jdbc/Productos")
    private DataSource conextionPool;
    
    @Override
    public void init() throws ServletException {
        super.init();
        try {
            modeloProductos = new ModeloProductos(conextionPool);
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
    
    private void listarProductos(HttpServletRequest request, HttpServletResponse response) {
        List<Productos> productos;
        try {
            productos = modeloProductos.getProductos();
            request.setAttribute("listaProductos", productos);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/ListaProductos.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void agregarProducto(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String codArt = request.getParameter("codArticulo");
        String seccArt = request.getParameter("seccion");
        String nombArt = request.getParameter("nombreArticulo");
        String fechArt = request.getParameter("fecha");
        double precArt = Double.parseDouble(request.getParameter("precio"));
        String artImport = request.getParameter("importado");
        String pOrigen = request.getParameter("paisDeOrigen");
        Productos nuevoProducto = new Productos(codArt, seccArt, nombArt, precArt, fechArt, artImport, pOrigen);
        modeloProductos.createProducto(nuevoProducto);
        listarProductos(request, response);
    }

    private void cargarProducto(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String codArt = request.getParameter("codArticulo");
        Productos producto = modeloProductos.getProducto(codArt);
        request.setAttribute("actualizarProducto", producto);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/actualizarProducto.jsp");
        dispatcher.forward(request, response);
    }

    private void actualizarProducto(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String codArt = request.getParameter("codArticulo");
        String seccArt = request.getParameter("seccion");
        String nombArt = request.getParameter("nombreArticulo");
        String fechArt = request.getParameter("fecha");
        double precArt = Double.parseDouble(request.getParameter("precio"));
        String artImport = request.getParameter("importado");
        String pOrigen = request.getParameter("paisDeOrigen");
        Productos pActualizar = new Productos(codArt, seccArt, nombArt, precArt, fechArt, artImport, pOrigen);
        modeloProductos.updateProducto(pActualizar);
        listarProductos(request, response);
    }

    private void eliminarProducto(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String codArt = request.getParameter("codArticulo");
        modeloProductos.deleteProduct(codArt);
        listarProductos(request, response);
    }
    
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request.
     * @param response servlet response.
     * @throws ServletException if a servlet-specific error occurs.
     * @throws IOException if an I/O error occurs.
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String instruccion = request.getParameter("instruccion");
        if (instruccion == null) instruccion = "listar";
        switch (instruccion) {
            case "listar":
                listarProductos(request, response);
            break;
            case "insertaBBDD":
            {
                try {
                    agregarProducto(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            break;
            case "cargar":
            {
                try {
                    cargarProducto(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            break;
            case "actualizarBBDD":
            {
                try {
                    actualizarProducto(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            break;
            case "eliminar":
            {
                try {
                    eliminarProducto(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            break;
            default:
                listarProductos(request, response);
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
}
