<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String[] alumnos = {"Daniel", "Danny", "Gabriel", "Antonio", "Digna"};
    pageContext.setAttribute("alumnos", alumnos);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <br>
        <c:forEach var="a" items="${alumnos}">
            ${a} <br>
        </c:forEach>
    </body>
</html>
