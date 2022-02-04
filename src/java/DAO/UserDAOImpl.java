/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBUtility.DBConnection;
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
public class UserDAOImpl implements UserDAO<User> {

    
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List<User> getAll() {
        List<User> ul = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM USER";
            conn = DBConnection.openConnection();

            //prepared statement
            ps = conn.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setUserName(rs.getString("username"));
                u.setName(rs.getString("name"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setRole(rs.getString("role"));
                ul.add(u);
            }
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }

        return ul;
    }

    @Override
    public User get(String username) {
        User u = new User();
        try {
            String SQL = "SELECT * FROM USER WHERE username = ?";
            conn = DBConnection.openConnection();
//            prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setString(1, username);
            rs = ps.executeQuery();
            rs.next();
            u.setUserName(rs.getString("username"));
            u.setName(rs.getString("name"));
            u.setEmail(rs.getString("email"));
            u.setPassword(rs.getString("password"));
            u.setRole(rs.getString("role"));
            DBConnection.closeConnection();
        } catch (Exception ex) {
           return null;
        }

        return u;
    }

    @Override
    public void insert(User u) {
        try {
            String SQL = "INSERT INTO USER "
                    + "(username,name,email,password,role) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)";
            conn = DBConnection.openConnection();
//          prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setString(1, u.getUserName());
            ps.setString(2, u.getName());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getPassword());
            ps.setString(5, u.getRole());
            ps.executeUpdate();
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
    }

    @Override
    public void delete(String username) {
        try {
            String SQL = "DELETE FROM USER "
                    + "WHERE username = ?";
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
    public void update(String username, User user) {
        try {
            String SQL = "UPDATE USER SET "
                    + "name = ?, "
                    + "email = ?, "
                    + "password = ?, "
                    + "role = ? "
                    + "WHERE username = ?";
            conn = DBConnection.openConnection();

//            prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getRole());
            ps.setString(5, username);
            ps.executeUpdate();
            DBConnection.closeConnection();

        } catch (Exception ex) {
        }
    }

}
