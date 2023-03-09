<%-- 
    Document   : DemoTagsCoreFunction
    Created on : Jan 22, 2023, 8:52:55 PM
    Author     : dfrb@ne
--%>

<%@page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page import="java.util.*, java.sql.*, com.dfrb.tags.*" %>

<%
    ArrayList<Empleado> empleados = new ArrayList<>();
    Class.forName("com.mysql.cj.jdbc.Driver");
    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM EMPLEADOS";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            empleados.add(new Empleado(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
        }
        rs.close();
        connection.close();
    } catch (Exception e) {
        out.println("Ha habido un error al conectar con la Base de Datos");
    }
    pageContext.setAttribute("empleados", empleados);
%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conexion a una BBDD con JSP usando Tags Core y Function</title>
    </head>
    <body>
        <c:set var="firstEmpleado" value="${empleados[0].nombre}, ${empleados[0].apellido}, ${empleados[0].puesto}, ${empleados[0].sueldo}"/>
        <c:set var="firstEmpArray" value="${fn:split(firstEmpleado, ',')}"/>
        <h1>Hello World!</h1>
        <br>
        <label for="nombre">Nombre:</label>
        <input type="text" value="${firstEmpArray[0]}" name="nombre"/>
        <br>
        <label for="nombre">Apellido:</label>
        <input type="text" value="${firstEmpArray[1]}" name="apellido"/>
        <br>
        <label for="nombre">Puesto:</label>
        <input type="text" value="${firstEmpArray[2]}" name="puesto"/>
        <br>
        <label for="nombre">Sueldo:</label>
        <input type="text" value="${firstEmpArray[3]}" name="sueldo"/>
    </body>
</html>
