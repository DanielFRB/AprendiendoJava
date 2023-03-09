<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.*, java.sql.*, com.dfrb.tags.*" %>
<%
    ArrayList<Empleado> empleados = new ArrayList<>();
    Class.forName("com.mysql.cj.jdbc.Driver");
    try {
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
        Statement estado = conexion.createStatement();
        String sql = "SELECT * FROM EMPLEADOS";
        ResultSet resultado = estado.executeQuery(sql);
        while (resultado.next()) {
            empleados.add(new Empleado(resultado.getString(1), resultado.getString(2), resultado.getString(3), resultado.getDouble(4)));
        }
        resultado.close();
        conexion.close();
    } catch (Exception e) {
        out.println("Ha habido un error al conectar con la Base de Datos");
    }
    
    pageContext.setAttribute("empleados", empleados);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conexion a una BBDD con JSP y Tags II</title>
    </head>
    <body>
        <h1>Hello Empleados con Bonus!!!</h1>
        <br>
        <table border="1">
            <thead>
                <tr>
                    <td>Nombre</td>
                    <td>Apellido</td>
                    <td>Puesto</td>
                    <td>Sueldo</td>
                    <td>Bonus</td>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="emp" items="${empleados}">
                    <tr>
                        <td>${emp.nombre}</td>
                        <td>${emp.apellido}</td>
                        <td>${emp.puesto}</td>
                        <td>${emp.sueldo}</td>
                        <td>
                            <c:if test="${emp.sueldo < 50000}">${5000.0}</c:if>
                            <c:if test="${emp.sueldo >= 50000}">${0.0}</c:if>
                        </td>
                    </tr>
                 </c:forEach>
            </tbody>
        </table>
    </body>
</html>
