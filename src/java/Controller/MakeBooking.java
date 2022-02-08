/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CustomerDAOImpl;
import DAO.HallDAOImpl;
import DAO.UserDAO;
import DAO.UserDAOImpl;
import Model.Hall;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
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
        HallDAOImpl HallDAO = new HallDAOImpl();
        HttpSession session = request.getSession();
        LocalDate a = LocalDate.now();
        
        


        
        
        String Activity= request.getParameter("activity");
        List<Hall> hall_list= HallDAO.getAll();
        
        for(int i=0;i<hall_list.size();i++)
        {
            HallDAO.updatedate(hall_list.get(i), a);
        }
        
        request.setAttribute("t1", hall_list);
        request.setAttribute("activity", Activity);
        request.getRequestDispatcher("View/BookingPage.jsp").forward(request, response);
        
        
        
    
           }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try(PrintWriter out = response.getWriter()){
        
        
    }
    }
   

}
