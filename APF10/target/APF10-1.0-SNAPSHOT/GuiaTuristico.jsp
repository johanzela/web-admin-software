<%-- 
    Document   : GuiaTuristico
    Created on : 27 abr 2023, 23:26:13
    Author     : JOHAN ZELA
--%>

<%@page import="modelo.lisguia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.lisruta,controlador.Negocio,java.util.*" %>

<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
      <%
            List<lisguia> lis = (ArrayList<lisguia>) request.getAttribute("dato");
            
            String ruta = (String)request.getAttribute("ruta");
           
        %>
    <center>
        <h2 style="background: #32650D; color: white">Lista de Guias Turistas de <%= ruta %> </h2>
        <table class="table table-striped">
            <thead>
           
                <tr style="background: #72AB49; color: black"><th>Codigo<th>Nombre
                    <td><b>Fec. Ingreso<td><b>Lugar de origen<td><b>Foto<td><b>Guias
            </thead>  
            
            <% for ( lisguia x : lis){
                    out.print("<tr><td>" + x.getId_guia()+ "<td>" + x.getNombre()+ "<td>" + x.getFecha()+ "<td>" + x.getOrigen());
  out.print("<td><img src='fotos/fotos/C001.jpg' alt='' height='100' width='100' oneerror =\"src='turismo/sin_foto.jpg'\" class='rounded-circle' </tr>");
  //out.print("<td><tr><img src='turismo/CAJAMARCA.jpg' alt='' height='100' width='100' oneerror =\"src='turismo/sin_foto.jpg'\" class='rounded-circle' </tr>");
  out.print("<td><a class='btn btn-primary' style='background: #32650D' href='Guias.jsp' role='button'>Guias</a>");
                 }
                 
             %>  
             <%--<tr><td>00011<td>Manuel Alfarez<td>201-06-10<td>Ayacucho 
            
               <td><img src="fotos/fotos/C001.jpg" height="100" width="100"
              oneerror ="src='fotos/sin_foto.jpg'" class="rounded-circle">
              <td><a class="btn btn-primary" href="Guias.jsp" role="button" style="background: #32650D">Guias</a>
            --%>
        </table>
        <a class="btn btn-primary" href="#" onclick="history.back()"role="button" style="background: #32650D">Retornar</a>
    </center>
    </body>
</html>

