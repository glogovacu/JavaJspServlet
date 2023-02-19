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
import java.util.Calendar;
import java.util.Date;
import models.Data;
import models.FizickiServer;
import models.FizickoLice;
import models.PravnoLice;
import models.VirtuelniServer;

/**
 *
 * @author Uros
 */
public class DodajVirtuelniServerServlet extends HttpServlet {

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
        request.getRequestDispatcher("dodajVirtuelniServer.jsp").forward(request, response);
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
            int bandwidth = Integer.parseInt(request.getParameter("bandwidth"));
            String operativni = request.getParameter("operativni");
            int ram = Integer.parseInt(request.getParameter("ram"));
            int cena = Integer.parseInt(request.getParameter("cenaInput"));
            int mesecno = Integer.parseInt(request.getParameter("meseci"));
            Date datumKraja = new Date();
            Date danas = new Date();
            if(mesecno==700){
                Calendar cal = Calendar.getInstance();
                cal.setTime(danas);
                cal.add(Calendar.MONTH, 1);
                datumKraja = cal.getTime();
            }
            if(mesecno==3700){
                Calendar cal = Calendar.getInstance();
                cal.setTime(danas);
                cal.add(Calendar.MONTH, 6);
                datumKraja = cal.getTime();
            }
            if(mesecno==6700){
                Calendar cal = Calendar.getInstance();
                cal.setTime(danas);
                cal.add(Calendar.MONTH, 12);
                datumKraja = cal.getTime();
            }
            VirtuelniServer vs = new VirtuelniServer(procesor,ram,diskovi,bandwidth,operativni,cena,danas,datumKraja);
            for(FizickoLice f:Data.fizickoLice)
            {
                if(f.getId()==idFizickogLica)
                {
                    f.getVirtuelniServer().add(vs);
                }
            }
        }   
        
        else{
            int idPravnogLica = Integer.parseInt(request.getParameter("idPravnogLica"));
            int procesor = Integer.parseInt(request.getParameter("procesor"));
            int diskovi = Integer.parseInt(request.getParameter("diskovi"));
            int bandwidth = Integer.parseInt(request.getParameter("bandwidth"));
            String operativni = request.getParameter("operativni");
            int ram = Integer.parseInt(request.getParameter("ram"));
            float cena = Integer.parseInt(request.getParameter("cenaInput"));
            int mesecno = Integer.parseInt(request.getParameter("meseci"));
            Date datumKraja = new Date();
            Date danas = new Date();
            if(mesecno==700){
                Calendar cal = Calendar.getInstance();
                cal.setTime(danas);
                cal.add(Calendar.MONTH, 1);
                datumKraja = cal.getTime();
            }
            if(mesecno==3700){
                Calendar cal = Calendar.getInstance();
                cal.setTime(danas);
                cal.add(Calendar.MONTH, 6);
                datumKraja = cal.getTime();
            }
            if(mesecno==6700){
                Calendar cal = Calendar.getInstance();
                cal.setTime(danas);
                cal.add(Calendar.MONTH, 12);
                datumKraja = cal.getTime();
            }
            VirtuelniServer vs = new VirtuelniServer(procesor,ram,diskovi,bandwidth,operativni,cena,danas,datumKraja);
            for(PravnoLice p:Data.pravnoLice)
            {
                if(p.getId()==idPravnogLica)
                {
                    p.getVirtuelniServer().add(vs);
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
