<%-- 
    Document   : pagChofer
    Created on : 11 abr 2023, 9:35:44
    Author     : JOHAN ZELA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.chofer,controlador.Negocio" %>
<!DOCTYPE html><html>
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
        <h2 style="background: #32650D; color: white">Lista de Choferes</h2>
        <table class="table table-striped">
            <thead>
           
                <tr style="background: #72AB49; color: black"><th>Codigo<th>Nombre
                    <td><b>Fec. Ingreso<td><b>Categoria<td><b>Foto<td><b>Viaje
            </thead>  
           <% for ( chofer x : obj.lischofer ()) {
                    out.print("<tr><td>" + x.getCod_chofer()+ "<td>" + x.getNombre()+ "<td>" + x.getFecha()+ "<td>" + x.getCategoria());
  out.print("<td><img src='fotos/fotos/C003.jpg' alt='' height='100' width='100' oneerror =\"src='turismo/sin_foto.jpg'\" class='rounded-circle' </tr>");
  //out.print("<td><tr><img src='turismo/CAJAMARCA.jpg' alt='' height='100' width='100' oneerror =\"src='turismo/sin_foto.jpg'\" class='rounded-circle' </tr>");
  out.print("<td><a class='btn btn-primary' style='background: #32650D' href='pagViajeChofer.jsp' role='button'>Viajes</a>");
                 }
                 
             %>   
                  
            
        </table>
        <a class="btn btn-primary" href="#" onclick="history.back()"role="button" style="background: #32650D">Retornar</a>
    </center>
    </body>
</html>
