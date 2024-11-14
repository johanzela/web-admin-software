<%-- 
    Document   : pagRuta
    Created on : 11 abr 2023, 8:42:07
    Author     : JOHAN ZELA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.lisruta,controlador.Negocio" %>
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
        <h2 style="background: #32650D; color: white">Lista de Rutas</h2>
        <a class="btn btn-primary"  style="background: #32650D" href="grafico1_1_1_1.jsp" target="blanck">Las Rutas Preferidas</a> 
         <a class="btn btn-primary" style="background: #32650D" href="grafico1_1_1.jsp" target="blanck">Guias Realizadas</a> 
        <a class="btn btn-primary" style="background: #32650D" href="grafico1.jsp" target="blanck">Destinos Turisticos</a> 
        <a class="btn btn-primary" style="background: #32650D" href="grafico1_1.jsp" target="blanck" >Graficos de guias</a>
        <table class="table table-striped"><input type="hidden" name="opc" value="4">
            <thead>
                <tr style="background: #72AB49; color: black"><th>Ruta codigo<th>Ruta
                    <td><b>Imagen<td><b>Guia Turistico<td><b>ver      
            </thead>  
             
             <% for ( lisruta x : obj.lisru() ) {
                    out.print("<tr><td>" + x.getId_ruta()+ "<td>" + x.getRuta() );
  out.print("<td><img src='turismo/AREQUIPA.jpg' alt='' height='100' width='100' oneerror =\"src='turismo/sin_foto.jpg'\" class='rounded-circle' </tr>");
  //out.print("<td><tr><img src='turismo/CAJAMARCA.jpg' alt='' height='100' width='100' oneerror =\"src='turismo/sin_foto.jpg'\" class='rounded-circle' </tr>");
  out.print("<td><a class='btn btn-primary' style='background: #32650D' href='control?opc=6&cod="+x.getId_ruta()+"&ruta="+ x.getRuta()+"' role='button'>Guia turistico</a><td><a class='btn btn-primary' style='background: #32650D' href='pagViaje.jsp' role='button'>Ver</a> ");
                 }
                 
             %>  

            
        </table>
         
    </center>
    </body>
</html>
