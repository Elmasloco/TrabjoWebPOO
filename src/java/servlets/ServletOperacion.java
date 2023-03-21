package servlets;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import poo.AtAt;
import poo.Naves;
import poo.Supremacy;
/**
 *
 * @author samue
 */
@WebServlet(name = "ServletOperacion", urlPatterns = {"/ServletOperacion"})
public class ServletOperacion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            //Naves nave = new Naves();
            String tipoDeNave = request.getParameter("txtTipoDeNave");
            int cantidadPasajerosNave = Integer.parseInt(request.getParameter("txtCantidadPasajerosNave"));
            int cantidadDeNaves = Integer.parseInt(request.getParameter("txtCantidadDeNaves"));
            double parsecsRecorridos = Double.parseDouble(request.getParameter("txtParsecsRecorridos"));
            if (tipoDeNave.equalsIgnoreCase("At-At")) {
                Naves naveAtAT = new AtAt(tipoDeNave, cantidadPasajerosNave, parsecsRecorridos, cantidadDeNaves);
                naveAtAT.setCantidadParsec(parsecsRecorridos);
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Combustible Total Necesario</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>El tipo de nave es: " + naveAtAT.getTipoNave() + "</h1>");
                out.println("<br>");
                out.println("<h1>La cantidad de pasajeros es de: " + naveAtAT.getCantidadPasajeros() + "</h1>");
                out.println("<br>");
                out.println("<h1>La cantidad de naves es de: " + naveAtAT.getCantidadDeNaves() + "</h1>");
                out.println("<br>");
                out.println("<h1>La cantidad de combustible necesario es de: " + naveAtAT.combustibleTotalNecesario(parsecsRecorridos, cantidadDeNaves, cantidadPasajerosNave) + "</h1>");
                out.println("</body>");
                out.println("</html>");
            }else if(tipoDeNave.equalsIgnoreCase("Supremacy")){
                Naves naveSupremacy = new Supremacy(tipoDeNave, cantidadPasajerosNave, parsecsRecorridos, cantidadDeNaves);
                naveSupremacy.setCantidadParsec(parsecsRecorridos);
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Combustible Total Necesario</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>El tipo de nave es: " + naveSupremacy.getTipoNave() + "</h1>");
                out.println("<br>");
                out.println("<h1>La cantidad de pasajeros es de: " + naveSupremacy.getCantidadPasajeros() + "</h1>");
                out.println("<br>");
                out.println("<h1>La cantidad de naves es de: " + naveSupremacy.getCantidadDeNaves() + "</h1>");
                out.println("<br>");
                out.println("<h1>La cantidad de combustible necesario es de: " + naveSupremacy.combustibleTotalNecesario(parsecsRecorridos, cantidadDeNaves, cantidadPasajerosNave) + "</h1>");
                out.println("</body>");
                out.println("</html>");
            }else{
                Naves nave1 = new Naves(tipoDeNave, cantidadPasajerosNave, parsecsRecorridos, cantidadDeNaves);
                nave1.setCantidadParsec(parsecsRecorridos);
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Combustible Total Necesario</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>El tipo de nave es: " + nave1.getTipoNave() + "</h1>");
                out.println("<br>");
                out.println("<h1>La cantidad de pasajeros es de: " + nave1.getCantidadPasajeros() + "</h1>");
                out.println("<br>");
                out.println("<h1>La cantidad de naves es de: " + nave1.getCantidadDeNaves() + "</h1>");
                out.println("<br>");
                out.println("<h1>La cantidad de combustible necesario es de: " + nave1.combustibleTotalNecesario(parsecsRecorridos, cantidadDeNaves, cantidadPasajerosNave) + "</h1>");
                out.println("</body>");
                out.println("</html>");
            }
        }
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
