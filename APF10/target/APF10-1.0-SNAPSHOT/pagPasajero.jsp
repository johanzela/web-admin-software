<%-- 
    Document   : pagPasajero
    Created on : 11 abr 2023, 9:27:01
    Author     : JOHAN ZELA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.pasajero,controlador.Negocio" %>
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
        <h2 style="background: #32650D; color: white">Pasajero:</h2>
        <table class="table table-striped">
            <thead>
                <tr style="background: #72AB49; color: black"><th>Boleto<th>Nombre
                    <td><b>Asiento<td><b>Pago<td><b>Choferes<td><B>Asesor Venta<td><b>Anular<td><b>Editar
            </thead>  
            <% for ( pasajero x : obj.lispasajero()) {
                    out.print("<tr><td>" + x.getCod_boleto()+ "<td>" + x.getNombre()+ "<td>" + x.getAsiento()+ "<td>" + x.getPago());
  out.print("<td><a class='btn btn-primary' style='background: #32650D' href='pagChofer.jsp' role='button'>Choferes</a>");
  out.print("<td><a class='btn btn-primary' style='background: #32650D' href='AsesorVenta.jsp' role='button'>Asesor Venta</a>");
  //out.print("<td><a class='btn btn-primary' style='background: #32650D' href='control?opc=3&id=<%=x.getNro()%></");
                 }
                 
             %>  
        <td><a class='btn btn-primary' style='background: #32650D' role='button' href="control?opc=3&id=<%=x.getCod_boleto()%>">Anula</a>
<td><a class='btn btn-primary' style='background: #32650D' role='button' href="control?opc=4&id=<%=x.getCod_boleto()%>">Editar</a>
                <%
                    }

                %>   
    
  
            
             <%--
    <td><a class="btn btn-primary" href="pagChofer.jsp" role="button" style="background: #32650D">Choferes</a>
     <td><a class="btn btn-primary" href="AsesorVenta.jsp" role="button" style="background: #32650D">Asesor Venta</a>  
     <td><a class="btn btn-primary" href="borra.jsp" role="button" style="background: #32650D">Anula</a>
     --%>
            
        </table>
        <a class="btn btn-primary" href="pagRegistro.jsp" style="background: #32650D">Agregar Pasajero</a>
    </center>
     <a class="btn btn-primary" href="pagRuta.jsp" role="button" style="background: #32650D">Retornar</a>
    </body>
</html>
