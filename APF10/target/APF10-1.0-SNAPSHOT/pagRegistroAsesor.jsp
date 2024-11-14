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
     <input type="hidden"  name="" value="">
     <!-- agregar name y value-->
     <h3 style="color: #32650D"><b>REGISTRAR ASESOR DE VENTA</h3>
                <tr><br><td>Nombre<td><br>
                    <input type="text" name="nombre" id="nombre" required placeholder="Ingrese el nombre aqui"><br>
                <tr><br><td>Fecha de Ingreso<td><br>
                    <input type="text" name="asiento" id="asiento" required placeholder="Ingrese Fecha"><br>
                 <tr><br><td>Area<td><br>
                     <input type="text" name="pago" id="pago" required placeholder="Ingrese Area"><br>
              
                <br>
                <tr><br><td><input style="background: #32650D; color: white" type="submit" href="AsesorVenta.jsp"  value="ENVIAR DATA">
                     
            </form>
    </center>
    <a class="btn btn-primary" href="AsesorVenta.jsp"  role="button" style="background: #32650D; color: white; align-items: center "> Retornar</a>

</body>


</html>
