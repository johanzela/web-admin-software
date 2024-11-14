<%-- 
    Document   : pagViaje
    Created on : 11 abr 2023, 8:59:29
    Author     : JOHAN ZELA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.viajes,controlador.Negocio" %>
<!DOCTYPE html>
<html>
 <head>
 <meta charset="UTF-8">
 <title></title>
 <link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootst
rap.min.css" rel="stylesheet">
 </head>
 <body>
 <%
            Negocio obj = new Negocio();
        %> 
 <center>
 <h2 style="background: #32650D; color: white"> Ruta: </h2>
 <td><img src="turismo/AREQUIPA.jpg" height="200"
width="200"
 oneerror ="src='turismo/sin_foto.jpg'" class="roundedcircle">
 <table class="table table-striped">
 </td>
 <thead>
 <tr  style="background: #72AB49; color: black"><th>Viaje<th>Fecha
 <td><b>Hora<td><b>Costo<td><b>Pasajeros
 </thead>

            <% for ( viajes x : obj.viajes()) {
                    out.print("<tr><td>" + x.getCod_viaje()+ "<td>" + x.getFecha()+ "<td>" + x.getHora()+ "<td>" + x.getCosto());
  //out.print("<td><tr><img src='turismo/CAJAMARCA.jpg' alt='' height='100' width='100' oneerror =\"src='turismo/sin_foto.jpg'\" class='rounded-circle' </tr>");
  out.print("<td><a class='btn btn-primary' style='background: #32650D' href='pagPasajero.jsp' role='button'>Pasajeros</a>");
                 }
                 
             %>   

 



 </table>
 <a class="btn btn-primary" href="#"
onclick="history.back()"role="button" style="background: #32650D">Retornar</a>
 </center>
 </body>
</html>
