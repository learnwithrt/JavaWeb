/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neubao.services;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;//This is the class which will make a java class to a servlet class
import javax.servlet.http.HttpServletRequest;//This is the one which will have request information(Question)
import javax.servlet.http.HttpServletResponse;//this is the one which will have Response information(Answer)
import org.neubao.dao.CustomerDao;
import org.neubao.model.Customer;

/**
 *
 * @author rahul
 */
public class RegisterServlet extends HttpServlet {
    CustomerDao cdao=new CustomerDao();
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
            //get the information
            String resp=null;
            String uname=request.getParameter("uname");
            String email=request.getParameter("email");
            String pwd=request.getParameter("pwd");
            //print the information
            Customer c=new Customer(uname,email,pwd);
            if(cdao.saveCustomer(c))
                resp="okay";
            else
                resp="not";
            response.setContentType("text/plain");
            response.getWriter().write(resp);
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
