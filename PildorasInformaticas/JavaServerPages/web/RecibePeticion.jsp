<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recibe Peticion</title>
    </head>
    <body>
        <%
            // Lectura de los datos enviados por el formulario
            String ciudadFavorita = request.getParameter("ciudadFavorita");
            
            // Creacion de la cookie
            Cookie cookie = new Cookie("agenciaViajes.ciudadFavorita", ciudadFavorita);
            
            // Establecer el tiempo de vida de la cookie
            cookie.setMaxAge(604800);
            
            // Enviar al usuario
            response.addCookie(cookie);
        %>
        <p>Gracias por enviar su preferencia de vuelo</p>
        <br>
        <a href="AgenciaViajes.jsp">Agencia de Viajes</a>
    </body>
</html>
