<%-- 
    Document   : ListaProductos
    Created on : Jan 30, 2023, 5:56:48 PM
    Author     : dfrb@ne
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Productos</title>
        <style>
            thead {
                font-size: 1.2em;
                font-weight: bold;
                color: white;
                background-color: blue;
            }
            
            tbody {
                text-align: center;
                background-color: lightblue;
            }
            
            table {
                float: left;
            }
        </style>
    </head>
    <body>
        <h1>Listado de Productos</h1>
        <table>
            <thead>
                <tr>
                    <th>Codigo Articulo</th>
                    <th>Seccion</th>
                    <th>Nombre Articulo</th>
                    <th>Fecha</th>
                    <th>Precio</th>
                    <th>Importado</th>
                    <th>Pais de Origen</th>
                    <th>Opciones</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="p" items="${listaProductos}">
                    <c:url var="linkCargar" value="ProductController">
                        <c:param name="instruccion" value="cargar"></c:param>
                        <c:param name="codArticulo" value="${p.codArticulo}"></c:param>
                    </c:url>
                    <c:url var="linkEliminar" value="ProductController">
                        <c:param name="instruccion" value="eliminar"></c:param>
                        <c:param name="codArticulo" value="${p.codArticulo}"></c:param>
                    </c:url>
                    <tr>
                        <td>${p.codArticulo}</td>
                        <td>${p.seccion}</td>
                        <td>${p.nombreArticulo}</td>
                        <td>${p.fecha}</td>
                        <td>${p.precio}</td>
                        <td>${p.importado}</td>
                        <td>${p.paisDeOrigen}</td>
                        <td>
                            <a href="${linkCargar}">Actualizar</a>&nbsp;&nbsp;<a href="${linkEliminar}">Eliminar</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div id="buttonContainer">
            <button type="button" onclick="window.location.href='insertaProducto.jsp'">Nuevo Producto</button>
        </div>
    </body>
</html>
