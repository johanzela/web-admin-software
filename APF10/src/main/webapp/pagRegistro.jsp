<%-- 
    Document   : pagRegistro
    Created on : 11 abr 2023, 10:09:01
    Author     : JOHAN ZELA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="estilos.css"><!-- estilos -->
    </head>
    
    <center>
        <body style="background-image:url(fotos/paisaje2.webp); background-size: cover; 
       background-repeat: no-repeat; background-attachment: fixed;"> 
            <div class="form-container">

 <form action="control"  class="form"  >
     <input type="hidden"  name="opc" value="1">
     
     <h3 style="color: #32650D"><b>REGISTRAR PASAJERO</h3>
                <tr><br><td>Nombre<td><br>
                    <input type="text" name="nombre" id="nombre" required placeholder="Ingrese el nombre aqui"><br>
                <tr><br><td>Asiento<td><br>
                    <input type="text" name="asiento" id="asiento" required placeholder="Numero de asiento"><br>
                 <tr><br><td>Pago<td><br>
                     <input type="number" name="pago" id="pago" required placeholder="Ingrese el monto"><br>
              
                <br>
                <tr><br><td><input style="background: #32650D; color: white" type="submit"  value="ENVIAR DATA">
                     
            </form>
    </center>
    <a class="btn btn-primary" href="pagPasajero.jsp"  role="button" style="background: #32650D; color: white; align-items: center "> Retornar</a>

</body>


</html>

