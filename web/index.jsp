<%-- 
    Document   : index
    Created on : 20/03/2023, 3:03:13 p. m.
    Author     : samue
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" %>
<%@ page import="java.io.*, java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Programa Alianza Rebelde</title>
        <style>
            body{
                background-color: #fff3cd;
            }
        </style>
    </head>
    <body>
        <form action="ServletOperacion" method="POST">
            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                    <br>Digite el tipo de nave: <input type="text" name="txtTipoDeNave" id="idTipoDeNave"/><br><br>
                    Digite los parsecs recorridos: <input type="text" name="txtParsecsRecorridos" id="idParsescRecorridos"/><br><br>
                    <button type="submit" class="btn btn-success">Enviar Datos</button>
                    </div>
                    <div class="col-md-4">
                    <br>Digite la cantidad de pasajeros:  <input type="text" name="txtCantidadPasajerosNave" id="idCantidadPasajerosNave"/><br><br>
                    Digite la cantidad de naves:  <input type="text" name="txtCantidadDeNaves" id="idCantidadDeNaves"/><br><br>
                    </div>
                </div>
            </div>
        </form>
        <script src="js/jquery-3.4.6.min.js"></script>   
        <script src="js/bootstrap.min.js"></script>
        </body>
</html>
