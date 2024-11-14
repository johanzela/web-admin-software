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
import controlador.Negocio;
import modelo.*;

/**
 *
 * @author JOHAN ZELA
 */
public class control extends HttpServlet {

    Negocio obj = new Negocio();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int op = Integer.parseInt(request.getParameter("opc"));
        if (op == 1) {
            adicion(request, response);
        } else if (op == 2) {
            cambia(request, response);
        } else if (op == 4) {
            obtener(request, response);
        } else if (op == 3) {
            anula(request, response);
        } else if (op == 5) {
            anulasesor(request, response);
        } else if (op == 6) {
            lisguia(request, response);
        }
    }

    protected void adicion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        pasajero p = new pasajero();
        p.setNombre(request.getParameter("nombre"));
        p.setAsiento(Integer.parseInt(request.getParameter("asiento")));
        p.setPago(Double.parseDouble(request.getParameter("pago")));
        if (!busca(p.getNombre())) {
            obj.adicion(p);
        }

        String pag = "/pagPasajero.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }

    boolean busca(String nom) {
        boolean sw = false;
        for (pasajero p : obj.lispasajero()) {
            if (p.getNombre().equalsIgnoreCase(nom)) {
                sw = true;
                break;
            }
        }
        return sw;
    }

    protected void cambia(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        pasajero p = new pasajero();

        p.setNombre(request.getParameter("nombre"));
        p.setAsiento(Integer.parseInt(request.getParameter("asiento")));
        p.setPago(Double.parseDouble(request.getParameter("pago")));
        p.setCod_boleto(Integer.parseInt(request.getParameter("codboleto")));
        obj.cambia(p);

        request.getRequestDispatcher("/pagPasajero.jsp").forward(request, response);
    }

    protected void obtener(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int coboleto = Integer.parseInt(request.getParameter("id"));

        request.setAttribute("dato", obj.obtener(coboleto));

        request.getRequestDispatcher("/pagEditarPasajero.jsp").forward(request, response);
    }

    protected void anula(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int cod_boleto = Integer.parseInt(request.getParameter("id"));
        obj.anula(cod_boleto);
        String pag = "/pagPasajero.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }

    protected void anulasesor(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cod_asesor = (request.getParameter("id"));
        obj.anulasesor(cod_asesor);
        String pag = "/AsesorVenta.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }

    protected void lisguia(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String cod =request.getParameter("cod");

        request.setAttribute("ruta", request.getParameter("ruta"));

        request.setAttribute("dato", obj.lisguia(cod));
        request.getRequestDispatcher("GuiaTuristico.jsp").forward(request, response);
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
