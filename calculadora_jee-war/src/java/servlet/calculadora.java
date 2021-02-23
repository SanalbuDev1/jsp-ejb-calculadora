/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import ejb.calculadoraEjbLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author salvarez
 */
@WebServlet(name = "calculadora", urlPatterns = {"/calculadora"})
public class calculadora extends HttpServlet {

    @EJB
    private calculadoraEjbLocal local;
    
    
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
       response.setContentType("text/html;charset=UTF-8");
       String parametro = request.getParameter("v3");
       String valor1 = request.getParameter("v1");
       String valor2 = request.getParameter("v2");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet calculadora</title>");            
            out.println("</head>");
            out.println("<body>");
            if(parametro.equals("+")){
                int sumaEjb = local.sumar(Integer.valueOf(valor1), Integer.valueOf(valor2));                
                out.println("<h1>Servlet calculadora at suma " + sumaEjb + "</h1>");
            }
             if(parametro.equals("-")){
                 int sumaEjb = local.restar(Integer.valueOf(valor1), Integer.valueOf(valor2));   
                out.println("<h1>Servlet calculadora at suma " + sumaEjb + "</h1>");
            }
              if(parametro.equals("/")){
                 double sumaEjb = local.dividir(Integer.valueOf(valor1), Integer.valueOf(valor2));   
                out.println("<h1>Servlet calculadora at suma " + sumaEjb + "</h1>");
            }
               if(parametro.equals("*")){
                double sumaEjb = local.multiplicar(Integer.valueOf(valor1), Integer.valueOf(valor2));   
                out.println("<h1>Servlet calculadora at suma " + sumaEjb + "</h1>");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
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
