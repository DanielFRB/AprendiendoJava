<%-- 
    Document   : insertaProducto
    Created on : Jan 30, 2023, 9:20:06 PM
    Author     : dfrb@ne
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Producto</title>
        <style>
            body {
                box-sizing: border-box;
                margin: 0;
                padding: 0;
                background-color: lightgrey;
                font-family: "lato", sans-serif;
            }

            .regisform {
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
            }

            .form {
                background-color: lavender;
                width: 600px;
                border-radius: 8px;
                padding: 20px 40px;
                box-shadow: 0 10px 25px rgba(92, 99, 105, .2);
            }

            .titulo {
                font-size: 40px;
                margin-bottom: 30px;
                margin-top: 0px;
                text-align: center;
            }

            .inputCont {
                position: relative;
                height: 45px;
                width: 90%;
                margin-bottom: 10px;
            }

            .input {
                position: absolute;
                top: 0px;
                left: 170px;
                height: 100%;
                width: 70%;
                border: 1px solid #9a9faa;
                border-radius: 7px;
                font-size: 16px;
                padding: 0px 20px;
                outline: none;
                background: none;
                z-index: 1;
            }

            ::placeholder {
                color: #9a9faa;
            }

            .label {
                position: absolute;
                top: 15px;
                left: 0px;
                padding: 0 4px;
                background-color: lavender;
                color: black;
                font-weight: bold;
                font-size: 16px;
                transition: 0.5s;
                z-index: 0;
            }
            
            .submitBtn {
                display: block;
                margin-left: auto;
                padding: 15px 70px;
                border: none;
                background-color: blue;
                color: white;
                border-radius: 6px;
                cursor: pointer;
                font-size: 16px;
                margin-top: 20px;
            }
            
            .submitBtn:hover {
                background-color:  #33a2ff;
            }
        </style>
    </head>
    <body>
        <div class="regisform">
            <form action="ProductController" class="form" method="GET">
                <input type="hidden" name="instruccion" value="insertaBBDD"/>
                <h1 class="titulo">Nuevo Producto</h1>
                <div class="inputCont">
                    <label class="label">Codigo Articulo:</label>
                    <input type="text" class="input" name="codArticulo"/>
                </div>
                <div class="inputCont">
                    <label class="label">Seccion:</label>
                    <input type="text" class="input" name="seccion"/>
                </div>
                <div class="inputCont">
                    <label class="label">Nombre del Articulo:</label>
                    <input type="text" class="input" name="nombreArticulo"/>
                </div>
                <div class="inputCont">
                    <label class="label">Fecha:</label>
                    <input type="text" class="input" name="fecha"/>
                </div>
                <div class="inputCont">
                    <label class="label">Precio:</label>
                    <input type="text" class="input" name="precio"/>
                </div>
                <div class="inputCont">
                    <label class="label">Importado:</label>
                    <input type="text" class="input" name="importado" maxlength="2"/>
                </div>
                <div class="inputCont">
                    <label class="label">Pais de Origen:</label>
                    <input type="text" class="input" name="paisDeOrigen"/>
                </div>
                <input type="submit" class="submitBtn" value="Enviar"/>
            </form>
        </div>
    </body>
</html>
