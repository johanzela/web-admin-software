<%-- 
    Document   : GuiaTuristico
    Created on : 27 abr 2023, 23:26:13
    Author     : JOHAN ZELA
--%>

<%@page import="modelo.lisguia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.pasajero,controlador.Negocio" %>
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
        <h2 style="background: #32650D; color: white">Lista de pasajeros</h2>
    </center>
         <h4>Costo del viaje S/.60.00  <a class="btn btn-primary" href="Registro.jsp" role="button" style="background: #32650D">Registrar Pasajero</a>
         <center></h4>
        
            
        <table class="table table-striped">
            <thead>
                <tr style="background: #72AB49; color: black"><th>Boleto<th>Nombre<th>Asiento<th>Pago<th>Anular
                </tr>
            </thead>   
           <%
                for (pasajero x : obj.lispasajero()) {
                    out.print("<tr><td>" + x.getCod_boleto()+ "<td>" + x.getNombre()+ "<td>" + x.getAsiento()+ "<td>" + x.getPago()
                            );

            %>        
          
            <td><a href="control?opc=3&cod_boleto=<%=x.getCod_boleto()%>">Anula</a>

                <%
                    }

                %>    
        </table>
        <a class="btn btn-primary" href="#" onclick="history.back()"role="button" style="background: #32650D">Retornar</a>
    </center>
    </body>
</html>
