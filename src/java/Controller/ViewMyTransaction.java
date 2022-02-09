/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAO;
import DAO.PaymentDAOImpl;
import Model.Payment;
import Utility.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Legion
 */
@WebServlet(name = "ViewMyTransaction", urlPatterns = {"/ViewMyTransaction"})
public class ViewMyTransaction extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String customerId = request.getParameter("customerId");
        
        DAO dao = new PaymentDAOImpl();
        Payment u = (Payment) dao.get1(customerId);
        request.setAttribute("u", u);

        request.getRequestDispatcher("View/myTransaction.jsp").forward(request, response);
    }

}
