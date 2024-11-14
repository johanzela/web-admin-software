<%-- 
    Document   : demo1
    Created on : 20 may 2023, 15:58:11
    Author     : JOHAN ZELA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <form action="grafico1.jsp" target="win">
            ingrese año: <input name="an">
            <input type="radio" name="op" value="bar">barras
               <input type="radio" name="op" value="pie">circulo
                  <input type="radio" name="op" value="line">lineal
                  <br><!-- comment -->
                  <input type="submit">
                  
                         
        </form>
        <iframe name="win"height="600" width="600"></iframe>
    </center>
    </body>
</html>
