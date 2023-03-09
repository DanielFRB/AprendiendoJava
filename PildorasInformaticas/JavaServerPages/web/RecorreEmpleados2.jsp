<%-- 
    Document   : RecorreEmpleados2
    Created on : Jan 22, 2023, 7:13:01 PM
    Author     : dfrb@ne
--%>

<%@page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.*, java.sql.*, com.dfrb.tags.*" %>
<%
    ArrayList<Empleado> empleados = new ArrayList<>();
    Class.forName("com.mysql.cj.jdbc.Driver");
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
        Statement state = conn.createStatement();
        String sql = "SELECT * FROM EMPLEADOS";
        ResultSet rs = state.executeQuery(sql);
        while (rs.next()) {
            empleados.add(new Empleado(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
        }
        rs.close();
        conn.close();
    } catch (Exception e) {
        out.println("Ha habido un error al conectar con la Base de Datos");
    }
    
    pageContext.setAttribute("empleados", empleados);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conexion a una BBDD con JSP y Tags III</title>
    </head>
    <body>
        <h1>Hello Empleados con Bonus y Totales!!!</h1>
        <br>
        <table border="1">
            <thead>
                <tr>
                    <td>Nombre</td>
                    <td>Apellido</td>
                    <td>Puesto</td>
                    <td>Sueldo</td>
                    <td>Bonus</td>
                    <td>Total</td>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="e" items="${empleados}">
                    <tr>
                        <td>${e.nombre}</td>
                        <td>${e.apellido}</td>
                        <td>${e.puesto}</td>
                        <td>${e.sueldo}</td>
                        <td>
                            <c:choose>
                                <c:when test="${e.sueldo < 40000}">${5000.0}</c:when>
                                <c:when test="${e.sueldo > 40000 && e.sueldo <= 50000}">${2000.0}</c:when>
                                <c:otherwise>${0.0}</c:otherwise>
                            </c:choose>
                        </td>
                        <td>
                            <c:choose>
                                <c:when test="${e.sueldo < 40000}">${e.sueldo + 5000.0}</c:when>
                                <c:when test="${e.sueldo > 40000 && e.sueldo <= 50000}">${e.sueldo + 2000.0}</c:when>
                                <c:otherwise>${e.sueldo}</c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                 </c:forEach>
            </tbody>
        </table>
    </body>
</html>
