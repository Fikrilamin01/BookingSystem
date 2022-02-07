/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CustomerDAOImpl;
import DAO.HallDAOImpl;
import DAO.UserDAO;
import Model.Hall;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Boolean.FALSE;
import java.sql.Date;
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
           try(PrintWriter out = response.getWriter()){
        UserDAO customerDAO = new CustomerDAOImpl();
        HallDAOImpl HallDAO = new HallDAOImpl();
        HttpSession session = request.getSession();
        Hall t = new Hall("pingpong",1,"14:00","2000-02-06",FALSE,"meng");
        
        String Activity= request.getParameter("activity");
      
        
        if(Activity.equals("pingpong"))
        {
            request.setAttribute("activity", Activity);
            request.getRequestDispatcher("View/BookingPagePingPong.jsp").forward(request, response);
            
            HallDAO.insert(t);
        }
        else if(Activity.equals("basketball"))
        {   
            session.setAttribute("hall", t);
            request.setAttribute("activity", Activity);
            request.getRequestDispatcher("View/BookingPageBasketball.jsp").forward(request, response);
            
        }
        else 
        {
            request.setAttribute("activity", Activity);
            request.getRequestDispatcher("View/BookingPageGymnasium.jsp").forward(request, response);
        }
        
        
    }
        
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
//            out.println("Ping-Pong Receive");
        }
        else if(Activity.equals("Basketball"))
        {
            
        }
        else
        {
            
        }
        request.setAttribute("Activity", out);
        request.getRequestDispatcher("/View/BookingPage.jsp");
        
    }
    }
   

}
