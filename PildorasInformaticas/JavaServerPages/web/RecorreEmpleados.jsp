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
        <title>Conexion a una BBDD con JSP y Tags</title>
    </head>
    <body>
        <h1>Hello Empleados!</h1>
        <br>
        <table border="1">
            <thead>
                <tr>
                    <td>Nombre</td>
                    <td>Apellido</td>
                    <td>Puesto</td>
                    <td>Sueldo</td>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="empleado" items="${empleados}">
                    <tr>
                        <td>${empleado.nombre}</td>
                        <td>${empleado.apellido}</td>
                        <td>${empleado.puesto}</td>
                        <td>${empleado.sueldo}</td>
                    </tr>
                 </c:forEach>
            </tbody>
        </table>
    </body>
</html>
