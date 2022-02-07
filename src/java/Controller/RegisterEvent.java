/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.EventDAOImpl;
import Model.Event;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author M S I
 */
@WebServlet(name = "RegisterEvent", urlPatterns = {"/RegisterEvent"})
public class RegisterEvent extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String eventName = request.getParameter("event");


        switch (eventName) {
            case "Basic Fitness":
                request.setAttribute("event", eventName);
//                EventDAO.insert(event);
                break;
            case "Gym Training":
                request.setAttribute("event", eventName);
                break;
            case "Basic Muscle Course":
                request.setAttribute("event", eventName);
                break;
            case "Advanced Muscle Course":
                request.setAttribute("event", eventName);
                break;
            case "Yoga Training":
                request.setAttribute("event", eventName);
                break;
            case "Body Building Course":
                request.setAttribute("event", eventName);
                break;
            default:
                break;
        }
        request.getRequestDispatcher("View/registerEvent.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String eventName = request.getParameter("eventName");
        String eventDate = request.getParameter("eventDate");
        String username = request.getParameter("username");
        double eventPrice = 15.00;
        
        HttpSession session = request.getSession();
        EventDAOImpl EventDAO = new EventDAOImpl();
        Event event = new Event(1,eventName,eventDate,15.00,username);
        EventDAO.insert(event);
        
        response.sendRedirect("Profile");
        
    }

}
