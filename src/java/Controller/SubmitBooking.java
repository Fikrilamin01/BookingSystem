/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.BookingDAOImpl;
import DAO.HallDAOImpl;
import Model.Booking;
import Model.Customer;
import Model.Hall;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
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
@WebServlet(name = "SubmitBooking", urlPatterns = {"/SubmitBooking"})
public class SubmitBooking extends HttpServlet {

    
    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HallDAOImpl hall = new HallDAOImpl();
        BookingDAOImpl book = new BookingDAOImpl();
        HttpSession session =request.getSession();
        
        Hall a=new Hall();
        LocalDate date = LocalDate.now();
        int h= Integer.parseInt(request.getParameter("hall"));
        Customer customer= (Customer)session.getAttribute("customer");
        String g= (String) session.getAttribute("game");
        String t= (String) session.getAttribute("time");
        int bookId=0;
        String status="Booked";
        double pay;
        if(g.equals("ping-pong"))
        {
            pay=19.00;
        }
        else if(g.equals("basketball"))
        {
            pay=39.00;
        }
        else
        {
            pay=9.00;
        }
        a=hall.gethall(h, g, t);
        a.setVacancy(false);
        Booking b = new Booking(bookId,status,date.toString(),pay,customer.getUserName(),h,t,g);
        book.insert(b);
        hall.update(h, a);
<<<<<<< HEAD
        
        session.setAttribute("pay", pay);
        request.getRequestDispatcher("View/receiptHall.jsp").forward(request, response);
=======
        request.getRequestDispatcher("View/index.jsp").forward(request, response);
>>>>>>> e4acd4506f632dff7bdb591292e35db9554427c9
        
        
        
        
    }


}
