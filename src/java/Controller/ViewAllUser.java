package Controller;


import DAO.UserDAO;
import DAO.UserDAOImpl;
import Model.User;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ViewAllUser", urlPatterns = {"/ViewAllUser"})
public class ViewAllUser extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        UserDAO dao = new UserDAOImpl();
        List<User> ul = dao.getAll();
        request.setAttribute("ul", ul);
        log("size = "+ul.size());
        request.getRequestDispatcher("/View/manageAllUser.jsp").forward(request, response);
        
    }


}
