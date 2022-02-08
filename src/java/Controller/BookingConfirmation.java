/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author pc
 */
@WebServlet(name = "BookingConfirmation", urlPatterns = {"/BookingConfirmation"})
public class BookingConfirmation extends HttpServlet {

 

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = new User();
        user=(User) session.getAttribute("user");
        String game= request.getParameter("game");
        String time= request.getParameter("time");
        
        
        int hallNo= Integer.parseInt(request.getParameter("hall"));
        
        session.setAttribute("game",game);
        session.setAttribute("time",time);
        session.setAttribute("hallNo",hallNo);
        request.getRequestDispatcher("View/BookingPageConfirmation.jsp").forward(request, response);
        
        
    }

    

}
