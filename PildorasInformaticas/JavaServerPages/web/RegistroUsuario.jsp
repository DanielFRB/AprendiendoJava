<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Registro de Clietes</title>
    </head>
    <body>
        <h2>Usuarios Registrados</h2>
        <br>
        <p>Usuario Registrado:</p>
        <br>
        <p>Nombre: <%= request.getParameter("nombre") %> </p>
        <br>
        <p>Apellido: <%= request.getParameter("apellido") %> </p>
        <br><p>Email: <%= request.getParameter("email") %> </p>
    </body>
</html>