/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.HallDAO;
import DAO.HallDAOImpl;
import Model.Hall;
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
@WebServlet(name = "ViewHall", urlPatterns = {"/ViewHall"})
public class ViewHall extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //UserDAO dao = new UserDAOImpl();
        HallDAO dao = new HallDAOImpl();
        List<Hall> ul = dao.getAll();
        request.setAttribute("ul", ul);
        log("size = "+ul.size());
        request.getRequestDispatcher("/View/manageHall.jsp").forward(request, response);
        
    }
}
