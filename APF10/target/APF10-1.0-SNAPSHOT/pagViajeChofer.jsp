<%-- 
    Document   : pagViajeChofer
    Created on : 11 abr 2023, 10:12:51
    Author     : JOHAN ZELA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.viajesChofer,controlador.Negocio" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
      <%
            Negocio obj = new Negocio();
        %> 
    <center>
        <h2 style="background: #32650D; color: white"> Viajes del chofer</h2>

        <table class="table table-striped">
            <thead>
            
                <tr style="background: #72AB49; color: black"><th>CODIGO RUTA
                    <td><b>HORAS<td><b>FECHA<td><b>COSVIA
            </thead>  
           <% for ( viajesChofer x : obj.lisviajechofer()) {
                    out.print("<tr><td>" + x.getCod_ruta()+ "<td>" + x.getHoras()+ "<td>" + x.getFecha()+ "<td>" + x.getCosvia());

                 }
                 
             %>  
                   
        </table>
        <a class="btn btn-primary" href="#" onclick="history.back()"role="button" style="background: #32650D">Retornar</a>
    </center>
    </body>
</html>