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
import javax.servlet.http.HttpSession;

/**
 *
 * @author fikri
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Login</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        Customer customer = (Customer)session.getAttribute("customer");
        if(user!= null){
            //return to admin dashboard
            return;
        }
        
        if (customer!=null){
            //return to booking page
            response.sendRedirect("Profile");
            return;
        }
        //if the user is not authenticated yet, redirect to login page
        request.getRequestDispatcher("View/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //fecth data
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserDAO userDAO = new UserDAOImpl();
        User user = (User) userDAO.get(username);
        //login authentication
        if (user != null) {
            if (password.equals(user.getPassword())) {
                //authenthicated valid, proceed to view the page
                HttpSession session = request.getSession();
                
                //check role
                if (user.getRole().equals("admin")) {
                    //redirect to admin dashboard
                    //add to session
                    session.setAttribute("user", user);
                    //redirect to profile page
                    response.sendRedirect("");
                    return;
                } else {
                    //Customer will redirect to their profile page
                    //add to session
                    UserDAO customerDAO = new CustomerDAOImpl();
                    Customer customer = (Customer) customerDAO.get(username);
                    session.setAttribute("customer", customer);
                    
                    //redirect to profile page
                    response.sendRedirect("Profile");
                }
                return;
            }
        }

        //redirect to login page
        //add error message
        request.setAttribute("errorLogin", "Failed to authenticated."
                + " Incorrect username or password");
        request.getRequestDispatcher("View/login.jsp").forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
