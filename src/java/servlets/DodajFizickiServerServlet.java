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
import models.Data;
import models.FizickiServer;
import models.FizickoLice;
import models.PravnoLice;

/**
 *
 * @author Uros
 */
public class DodajFizickiServerServlet extends HttpServlet {

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
            for(FizickoLice f:Data.fizickoLice){
            if(f.getId()==idFizickogLica){
            request.setAttribute("fizickoLice", f);
            break;
            }
        }
        }
        else
        {
            for(PravnoLice p:Data.pravnoLice){
            if(p.getId()==idPravnogLica){
            request.setAttribute("pravnoLice", p);
            break;
            }
        }
        }
        request.getRequestDispatcher("dodajFizickiServer.jsp").forward(request, response);
        
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
        if(request.getParameter("idFizickogLica")!=null && !request.getParameter("idFizickogLica").equals("")){
            int idFizickogLica = Integer.parseInt(request.getParameter("idFizickogLica"));
            int procesor = Integer.parseInt(request.getParameter("procesor"));
            int diskovi = Integer.parseInt(request.getParameter("diskovi"));
            int bandwidth = Integer.parseInt(request.getParameter("badndwidth"));
            int ram = Integer.parseInt(request.getParameter("ram"));
            float cena = Integer.parseInt(request.getParameter("cena"));
            FizickiServer fs = new FizickiServer(procesor,ram,diskovi,bandwidth,cena);
            for(FizickoLice f:Data.fizickoLice)
            {
                if(f.getId()==idFizickogLica)
                {
                    f.getFizickiServer().add(fs);
                }
            }
        }   
        
        else{
 
            int idPravnogLica = Integer.parseInt(request.getParameter("idPravnogLica"));
            int procesor = Integer.parseInt(request.getParameter("procesor"));
            int diskovi = Integer.parseInt(request.getParameter("diskovi"));
            int bandwidth = Integer.parseInt(request.getParameter("badndwidth"));
            int ram = Integer.parseInt(request.getParameter("ram"));
            float cena = Integer.parseInt(request.getParameter("cena"));
            FizickiServer fs = new FizickiServer(procesor,ram,diskovi,bandwidth,cena);
            for(PravnoLice p:Data.pravnoLice)
            {
                if(p.getId()==idPravnogLica)
                {
                    p.getFizickiServer().add(fs);
                }
            }
            
        }

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
