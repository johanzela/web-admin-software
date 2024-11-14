<%-- 
    Document   : grafico1
    Created on : 20 may 2023, 15:47:35
    Author     : JOHAN ZELA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*,controlador.*"%>
<html>
    <b style="font-size: 2.5em">Grafico de Guias </b>

    <script src=
    "https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.2.2/Chart.min.js"></script>
    <style>
        .container {
            width: 70%;
            margin: 15px auto;
        }
        body {
            text-align: center;
            color: green;
        }
        h2 {
            text-align: center;
            font-family: "Verdana", sans-serif;
            font-size: 30px;
        }
    </style>
    <body>
       
  <%
        Negocio obj= new Negocio();
 
            String label1 = "", dato1 = "";
            for (lisguia x : obj.grafico1()) {
                label1= label1 + "'" + x.getNombre()+ "',";//'administrador','empleado',
                dato1 += x.getCantidad() + ","; // 1,1,
              
            }

            label1 = "[" + label1.substring(0, label1.length() - 1) + "]";
            dato1 = "[" + dato1.substring(0, dato1.length() - 1) + "]";

            String color1= "['red','yellow','green','purple','black','blue']";

        %>
        <div class="container">
          
           
            <div>
                <canvas id="myChart1"></canvas>
            </div>
        </div>
    </body>
<script>

            var ctx1 = document.getElementById("myChart1").getContext("2d");
            var myChart1 = new Chart(ctx1, {
                type: "pie", //barra
                data: {
                    labels: <%=label1%>,
                    datasets: [
                        {
                            label: "work load",
                            data: <%=dato1%>,
                            backgroundColor: <%=color1%>,
                        },
                    ],
                },
            });
        </script>
              <a class="btn btn-primary" href="pagRuta.jsp"  role="button" style="background: #32650D; color: white; align-items: center "> Retornar</a>
 
</html>
