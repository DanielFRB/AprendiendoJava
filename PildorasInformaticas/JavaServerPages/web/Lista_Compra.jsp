<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Lista de Compras con Sesiones</title>
    </head>
    <body>
        <h2>Lista de Productos a Comprar</h2>
        <form name="Formulario_Compra" action="Lista_Compra.jsp">
            <p>
	<label><input type="checkbox" name="articulos" value="Agua" />Agua</label>
	<br>
	<label><input type="checkbox" name="articulos" value="Leche" />Leche</label>
	<br>
	<label><input type="checkbox" name="articulos" value="Pan" />Pan</label>
	<br>
	<label><input type="checkbox" name="articulos" value="Manzanas" />Manzanas</label>
	<br>
	<label><input type="checkbox" name="articulos" value="Carne" />Carne</label>
	<br>
	<label><input type="checkbox" name="articulos" value="Pescado" />Pescado</label>
            </p>
            <p>
                <input type="submit" name="button" id="button" value="Enviar" />
	<br>
            </p>
        </form>
        <h2>Carro de Compra:</h2>
        <ul>
            <%
                List<String> listaCompras = (List<String>) session.getAttribute("misCompras");
                if (listaCompras == null) {
                    listaCompras = new ArrayList<>();
                    session.setAttribute("misCompras", listaCompras);
                }
                String[] productos = request.getParameterValues("articulos");
                if (productos != null) {
                    for (String p : productos) {
                        listaCompras.add(p);
                    }
                }
                for (String p : listaCompras) {
                    out.println("<li>"+ p +"</li>");
                }
            %>
        </ul>
    </body>
</html>