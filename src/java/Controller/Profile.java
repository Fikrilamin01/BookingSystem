/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CustomerDAOImpl;
import DAO.UserDAO;
import Model.Customer;
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
 * @author fikri
 */
@WebServlet(name = "Profile", urlPatterns = {"/Profile"})
public class Profile extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //redirect to profile page
        request.getRequestDispatcher("View/profile.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //fetch the data
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String country = request.getParameter("country");
        int postal = Integer.parseInt(request.getParameter("postal"));
        
        //update the profile
        UserDAO customerDAO = new CustomerDAOImpl();
        HttpSession session = request.getSession();
        Customer customer = (Customer) session.getAttribute("customer");
        customer.setName(name);
        customer.setEmail(email);
        customer.setAge(age);
        customer.setPostal(postal);
        customer.setAddress(address);
        customer.setCountry(country);
        customer.setCity(city);
        
        customerDAO.update(customer.getUserName(), customer);
        session.setAttribute("customer", customer);
        //redirect to profile page
        request.getRequestDispatcher("View/profile.jsp").forward(request, response);
    }

}
