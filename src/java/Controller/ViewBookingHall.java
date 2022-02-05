/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAO;
import DAO.BookingDAOImpl;
import Model.Booking;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Legion
 */
@WebServlet(name = "ViewBookingHall", urlPatterns = {"/ViewBookingHall"})
public class ViewBookingHall extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //UserDAO dao = new UserDAOImpl();
        DAO dao = new BookingDAOImpl();
        List<Booking> ul = dao.getAll();
        request.setAttribute("ul", ul);
        log("size = "+ul.size());
        request.getRequestDispatcher("/View/manageBooking.jsp").forward(request, response);
        
    }

}
