/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.HashSet;
import models.Data;
import models.FizickoLice;
import models.PravnoLice;

/**
 *
 * @author Uros
 */
public class DetaljnijeOServerimaServlet extends HttpServlet {

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
        int idFizickogLica = 0;
        int idPravnogLica =0;
        if(request.getParameter("idFizickoLice")!=null)
        {
        idFizickogLica= Integer.parseInt(request.getParameter("idFizickoLice"));
        }
        if(request.getParameter("idPravnoLice")!=null)
        {
        idPravnogLica= Integer.parseInt(request.getParameter("idPravnoLice"));
        }
        if(idFizickogLica!=0)
        {
            FizickoLice f = null;
            for(FizickoLice fl:Data.fizickoLice){
            if(fl.getId()==idFizickogLica){
            f = fl;
            break;
            }
        }
            request.setAttribute("fizickoLice", f);
            
        }
        else
        {
            PravnoLice p = null;
            for(PravnoLice pl:Data.pravnoLice){
            if(pl.getId()==idPravnogLica){
            p = pl;
            break;
            }
        }
            request.setAttribute("pravnoLice", p);
            
        }
        request.getRequestDispatcher("detaljnijeOServerima.jsp").forward(request, response);
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
