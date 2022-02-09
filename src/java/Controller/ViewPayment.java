/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAO;
import DAO.PaymentDAOImpl;
import Model.Payment;
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
@WebServlet(name = "ViewPayment", urlPatterns = {"/ViewPayment"})
public class ViewPayment extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
        DAO dao = new PaymentDAOImpl();
        List<Payment> ul = dao.getAll();
        request.setAttribute("ul", ul);
        log("size = "+ul.size());
        request.getRequestDispatcher("/View/managePayment.jsp").forward(request, response);
        
    }
}
