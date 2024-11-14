<%-- 
    Document   : Guias
    Created on : 27 abr 2023, 23:35:14
    Author     : JOHAN ZELA
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.guias,controlador.Negocio" %>
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
        <h2 style="background: #32650D; color: white"> Guias del Personal Turistico</h2>

        <table class="table table-striped">
            <thead>

                <tr style="background: #72AB49; color: black"><th>CODIGO RUTA
                    <td><b>HORAS<td><b>FECHA<td><b>COSGUIA
                                            </thead>  
          <% for ( guias x : obj.guias()) {
                    out.print("<tr><td>" + x.getCod_guia()+ "<td>" + x.getHoras()+ "<td>" + x.getFecha()+ "<td>" + x.getCosguia());

                 }
                 
             %>  

                                           

 </table> 
        <a class="btn btn-primary" href="#" onclick="history.back()"role="button" style="background: #32650D">Retornar</a>
                                       </center>
                                                    </body>
                                                    </html>
