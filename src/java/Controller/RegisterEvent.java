/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
        
        if (eventName.equals("basic_fitness")) {
            request.setAttribute("event", eventName);
            request.getRequestDispatcher("View/registerEvent.jsp").forward(request, response);
        } else if (eventName.equals("gym_training")) {
            request.setAttribute("event", eventName);
            request.getRequestDispatcher("View/registerEvent.jsp").forward(request, response);
        } else if (eventName.equals("basic_muscle_course")) {
            request.setAttribute("event", eventName);
            request.getRequestDispatcher("View/registerEvent.jsp").forward(request, response);
        } else if (eventName.equals("advanced_muscle_course")) {
            request.setAttribute("event", eventName);
            request.getRequestDispatcher("View/registerEvent.jsp").forward(request, response);
        } else if (eventName.equals("yoga_training")) {
            request.setAttribute("event", eventName);
            request.getRequestDispatcher("View/registerEvent.jsp").forward(request, response);
        } else if (eventName.equals("body_building_course")) {
            request.setAttribute("event", eventName);
            request.getRequestDispatcher("View/registerEvent.jsp").forward(request, response);
        } 
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
}
