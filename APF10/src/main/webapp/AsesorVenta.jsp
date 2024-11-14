<%-- 
    Document   : AsesorVenta
    Created on : 27 abr 2023, 23:46:05
    Author     : JOHAN ZELA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.asesorVenta,controlador.Negocio" %>

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
        <h2 style="background: #32650D; color: white">Lista de Asesores de Venta</h2>
        <table class="table table-striped">
            <thead> 
                <tr style="background: #72AB49; color: black"><th>Codigo<th>Nombre
                    <td><b>Fec. Ingreso<td><b>Area<td><b>Foto<td><b>Anula
            </thead>  
             
            <% for ( asesorVenta x : obj.lisasesor()) {
                    out.print("<tr><td>" + x.getCod_asesor()+ "<td>" + x.getNombre()+ "<td>" + x.getFecha()+ "<td>" + x.getArea());
  out.print("<td><img src='fotos/fotos/C002.jpg' alt='' height='100' width='100' oneerror =\"src='turismo/sin_foto.jpg'\" class='rounded-circle' </tr>");
  out.print("<td><a class='btn btn-primary' style='background: #32650D' role='button' >Anula</a>");
                 }
                 
             %>  
    
               
                    
            
        </table>
               <a class="btn btn-primary" href="pagRegistroAsesor.jsp" style="background: #32650D">Agregar Asesor</a>
        <a class="btn btn-primary" href="pagPasajero.jsp" onclick="history.back()"role="button" style="background: #32650D">Retornar</a>
    </center>
    </body>
</html>
