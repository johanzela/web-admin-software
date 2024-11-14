<%-- 
    Document   : grafico1
    Created on : 20 may 2023, 15:47:35
    Author     : JOHAN ZELA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*,controlador.*"%>
<html>

    <b style="font-size: 2.5em">Las Rutas Preferidas</b>

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
            
            
            String label = "", dato = "";
            for (lisruta x : obj.grafico()) {
                label = label + "'" + x.getRuta() + "',";//'administrador','empleado',
                dato += x.getCantidad() + ","; // 1,1,
              
            }

            label = "[" + label.substring(0, label.length() - 1) + "]";
            dato = "[" + dato.substring(0, dato.length() - 1) + "]";

            String color = "['#202645','#82cad1','#e34b8a','#FFE333','red','black']";

        %>
 
        <div class="container">
          
            <div>
                <canvas id="myChart"></canvas>
            </div>
           
        </div>
    </body>
<script>
            var ctx = document.getElementById("myChart").getContext("2d");
            var myChart = new Chart(ctx, {
                type: "bar", //line 
                data: {
                    labels: <%=label%>,
                    datasets: [
                        {
                            label: "work load",
                            data: <%=dato%>,
                            backgroundColor: <%=color%>,
                        },
                    ],
                },
            });
        </script>
      <a class="btn btn-primary" href="pagRuta.jsp"  role="button" style="background: #32650D; color: white; align-items: center "> Retornar</a>

        
</html>

