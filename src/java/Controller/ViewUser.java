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
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Legion
 */
@WebServlet(name = "ViewUser", urlPatterns = {"/ViewUser"})
public class ViewUser extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        String username = request.getParameter("username");
        
        UserDAO dao = new UserDAOImpl();
        User u = (User) dao.get(username);
        request.setAttribute("u", u);
        
        UserDAO dao2 = new CustomerDAOImpl();
        Customer c = (Customer) dao2.get(username);
        request.setAttribute("c", c);
        
        request.getRequestDispatcher("/View/manageUser.jsp").forward(request, response);
    }


}
