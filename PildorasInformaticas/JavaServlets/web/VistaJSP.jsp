<%-- 
    Document   : VistaJSP
    Created on : Jan 23, 2023, 7:13:23 PM
    Author     : dfrb@ne
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="losProductos" items="${productos}">
            ${losProductos}<br>
        </c:forEach>
    </body>
</html>
