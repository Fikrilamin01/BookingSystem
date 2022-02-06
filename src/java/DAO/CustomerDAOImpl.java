/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBUtility.DBConnection;
import Model.Customer;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fikri
 */
public class CustomerDAOImpl implements UserDAO<Customer> {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    UserDAO userDaoImpl = new UserDAOImpl();

    @Override
    public List<Customer> getAll() {
        List<Customer> ul = new ArrayList<>();
        try {
            List<User> userList = userDaoImpl.getAll();
            String SQL = "SELECT * FROM CUSTOMER";
            conn = DBConnection.openConnection();
            //prepared statement
            ps = conn.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Customer u = new Customer();
                u.setUserName(rs.getString("userId"));
                u.setAge(rs.getInt("age"));
                u.setAddress(rs.getString("address"));
                u.setCity(rs.getString("city"));
                u.setCountry(rs.getString("country"));
                u.setPostal(rs.getInt("postal"));
                ul.add(u);
            }
            for (User user : userList) {
                for (Customer customer : ul) {
                    if (user.getUserName().equals(customer.getUserName())) {
                        customer.setName(user.getName());
                        customer.setEmail(user.getEmail());
                        customer.setPassword(user.getEmail());
                        customer.setRole(user.getRole());
                    }
                }
            }
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
        return ul;
    }

    @Override
    public Customer get(String username) {
        Customer u = new Customer();
        try {
            User user = (User) userDaoImpl.get(username);
            String SQL = "SELECT * FROM CUSTOMER WHERE userId = ?";
            conn = DBConnection.openConnection();
//            prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setString(1, username);
            rs = ps.executeQuery();
            rs.next();
            u.setUserName(rs.getString("userId"));
            u.setName(user.getName());
            u.setEmail(user.getEmail());
            u.setPassword(user.getPassword());
            u.setRole(user.getRole());
            u.setAge(rs.getInt("age"));
            u.setAddress(rs.getString("address"));
            u.setCity(rs.getString("city"));
            u.setCountry(rs.getString("country"));
            u.setPostal(rs.getInt("postal"));
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }

        return u;
    }

    @Override
    public void insert(Customer u) {
        try {
            User tempUser = new User (u.getName(), u.getUserName(), u.getEmail(), u.getPassword(), u.getRole());
            userDaoImpl.insert(tempUser);
            String SQL = "INSERT INTO CUSTOMER "
                    + "(userId,age,address,city,country,postal) "
                    + "VALUES "
                    + "(?,?,?,?,?,?)";
            conn = DBConnection.openConnection();
//          prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setString(1, u.getUserName());
            ps.setInt(2, u.getAge());
            ps.setString(3, u.getAddress());
            ps.setString(4, u.getCity());
            ps.setString(5, u.getCountry());
            ps.setInt(6, u.getPostal());
            ps.executeUpdate();
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
    }

    @Override
    public void delete(String username) {
        try {
            userDaoImpl.delete(username);
            String SQL = "DELETE FROM CUSTOMER WHERE userId = ?";

//          prepare statement
            conn = DBConnection.openConnection();
            ps = conn.prepareStatement(SQL);
            ps.setString(1, username);
            ps.executeUpdate();
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
    }

    @Override
    public void update(String username, Customer u) {
        try {
            User tempUser = new User(u.getName(), u.getUserName(), u.getEmail(), u.getPassword(), u.getRole());
            userDaoImpl.update(username, tempUser);
            String SQL = "UPDATE CUSTOMER SET "
                    + "age = ?, "
                    + "address = ?, "
                    + "city = ?, "
                    + "country = ?, "
                    + "postal = ? "
                    + "WHERE userId = ?";
            conn = DBConnection.openConnection();
//            prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, u.getAge());
            ps.setString(2, u.getAddress());
            ps.setString(3, u.getCity());
            ps.setString(4, u.getCountry());
            ps.setInt(5, u.getPostal());
            ps.setString(6, username);
            ps.executeUpdate();
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
    }

     @Override
    public void adminUpdate(String username, Customer u) {
    }
    
}
