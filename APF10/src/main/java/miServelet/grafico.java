/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package miServelet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Total_Mes;
import controlador.Negocio1;
import java.io.OutputStream;
import org.jfree.chart.*;
import org.jfree.data.general.DefaultPieDataset;//para graficos circulares

/**
 *
 * @author JOHAN ZELA
 */
public class grafico extends HttpServlet {
Negocio1 obj=new Negocio1();
JFreeChart torta(int an){
     DefaultPieDataset ds=new DefaultPieDataset();
     for(Total_Mes x:obj.lisMes(an)){
         ds.setValue(x.Lmes(), x.getTotal());
     }
     JFreeChart gr=ChartFactory.createPieChart3D("anio "+an, ds);
     return gr;
 }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
        response.setContentType("image/jpeg");
       int an=Integer.parseInt(request.getParameter("an"));
       OutputStream flujo=response.getOutputStream();
       ChartUtilities.writeChartAsJPEG(flujo, torta(an), 500,500);
       flujo.close();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
