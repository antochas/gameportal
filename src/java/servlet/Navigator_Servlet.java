/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;


import DAO.HomeDAO;
import database.model.Games;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.LoginModel;


/**
 *
 * @author a
 */

@WebServlet(name = "navigator_Controller", urlPatterns = {"/login", "/search", "/categories","/home"})
public class Navigator_Servlet extends HttpServlet {

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
            
        String URL = request.getServletPath();
        
        switch (URL) {
            case "/login":
                {
                    LoginModel lm = new LoginModel();
                    String result = lm.validateLogin(request.getParameter("uname"), request.getParameter("upassword"));
                    RequestDispatcher rd = request.getRequestDispatcher(result);
                    rd.forward(request, response);
                    break;
                }
            case "/search":
                break;
            case "/categories":
                break;
            case "/home":
                {
                    HomeDAO hd = new HomeDAO();
                    List<Games> gamelist = hd.fetchGamesFromFeatured();
                    request.getSession(true).setAttribute("featuredgamelist", gamelist);
                    RequestDispatcher rd = request.getRequestDispatcher("/pages/home/home.jsp");
                    rd.forward(request, response);
                    break;
                }
            default:
                break;
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
     * Handles the HTTP <code>POST</code> method.
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
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}