<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agencia de Viajes</title>
        <style>
            h1 {
                text-align: center
            }
        </style>
    </head>
    <body>
        <h1>Agencia de Viajes</h1>
        <%
            // Valor por defecto
            String ciudadFavorita = "Caracas";
            
            // Leer la cookie
            Cookie[] cookies = request.getCookies();
            
            // Buscar las preferencias del usuario
            if (cookies != null) {
                for (Cookie c : cookies) {
                    if ("agenciaViajes.ciudadFavorita".equals(c.getName())) {
                        ciudadFavorita = c.getValue();
                        break;
                    }
                }
            }
        %>
        
        <h3>Vuelos a <%= ciudadFavorita%></h3>
        <p>Valor retornado por la consulta a la Base de Datos</p>
        <p>Valor retornado por la consulta a la Base de Datos</p>
        <p>Valor retornado por la consulta a la Base de Datos</p>
        <p>Valor retornado por la consulta a la Base de Datos</p>
        <br>
        <h3>Hoteles en <%= ciudadFavorita%></h3>
        <p>Valor retornado por la consulta a la Base de Datos</p>
        <p>Valor retornado por la consulta a la Base de Datos</p>
        <p>Valor retornado por la consulta a la Base de Datos</p>
        <p>Valor retornado por la consulta a la Base de Datos</p>
        <br>
        <h3>Descuentos en Restaurantes de <%= ciudadFavorita%></h3>
        <p>Valor retornado por la consulta a la Base de Datos</p>
        <p>Valor retornado por la consulta a la Base de Datos</p>
        <p>Valor retornado por la consulta a la Base de Datos</p>
        <p>Valor retornado por la consulta a la Base de Datos</p>
        
    </body>
</html>
