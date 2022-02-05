/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CustomerDAOImpl;
import DAO.UserDAO;
import DAO.UserDAOImpl;
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
@WebServlet(name = "Register2", urlPatterns = {"/Register2"})
public class Register2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("Login");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //receive all the information
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        int postalCode = Integer.parseInt(request.getParameter("postalCode"));
        String country = request.getParameter("country");
                
                
        //Create user in the database
        UserDAO userDao = new CustomerDAOImpl();
        Customer newCustomer = new Customer(age, address, city, country, postalCode, name, username, email, password, "CUSTOMER");
        userDao.insert(newCustomer);
        
        //add into session
        HttpSession session = request.getSession();
        session.setAttribute("customer", newCustomer);
        
        response.sendRedirect("Profile");
    }
}
