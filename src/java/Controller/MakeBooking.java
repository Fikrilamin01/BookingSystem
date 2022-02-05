/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CustomerDAOImpl;
import DAO.UserDAO;
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
@WebServlet(name = "MakeBooking", urlPatterns = {"/MakeBooking"})
public class MakeBooking extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try(PrintWriter out = response.getWriter()){
        UserDAO customerDAO = new CustomerDAOImpl();
        HttpSession session = request.getSession();
        String Activity= request.getParameter("activity");
        
        if(Activity.equals("pingpong"))
        {
            out.println("Ping-Pong Receive");
        }
        else if(Activity.equals("Basketball"))
        {
            
        }
        else
        {
            
        }
        
        
        
    }
    }
   

}
