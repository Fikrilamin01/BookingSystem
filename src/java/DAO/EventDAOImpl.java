/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utility.DBConnection;
import Model.Event;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author M S I
 */
public class EventDAOImpl implements DAO<Event> {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List<Event> getAll() {
        List<Event> ul = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM EVENT";
            conn = DBConnection.openConnection();
            //prepared statement
            ps = conn.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Event u = new Event();
                u.setId(rs.getInt("id"));
                u.setEventName(rs.getString("eventName"));
                u.setEventDate(rs.getString("eventDate"));
                u.setEventPrice(rs.getDouble("eventPrice"));
                u.setCustomerId(rs.getString("customerId"));

                ul.add(u);
            }
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
        return ul;
    }

    @Override
    public Event get(int id) {
        Event u = new Event();
        try {
            String SQL = "SELECT * FROM EVENT WHERE id = ?";
            conn = DBConnection.openConnection();
//            prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.next();
            u.setId(rs.getInt("id"));
            u.setEventName(rs.getString("eventName"));
            u.setEventDate(rs.getString("eventDate"));
            u.setEventPrice(rs.getDouble("eventPrice"));
            u.setCustomerId(rs.getString("customerId"));
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
        return u;
    }

    @Override
    public void insert(Event event) {
        try {
            String SQL = "INSERT INTO EVENT "   
                    + "(id,eventName,eventDate,eventPrice,customerId) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)";
            conn = DBConnection.openConnection();
//          prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, event.getId());
            ps.setString(2, event.getEventName());
            ps.setString(3, event.getEventDate());
            ps.setDouble(4, event.getEventPrice());
            ps.setString(5, event.getCustomerId());
            ps.executeUpdate();
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
    }

    @Override
    public void delete(int id) {
        try {
            String SQL = "DELETE FROM EVENT "
                    + "WHERE id = ?";
            //prepare statement
            conn = DBConnection.openConnection();
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, id);
            ps.executeUpdate();
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
    }

    @Override
    public void update(int id, Event event) {
        try {
            String SQL = "UPDATE EVENT SET "
                    + "eventName = ?, "
                    + "eventDate = ?, "
                    + "eventPrice = ?, "
                    + "customerId = ?, "
                    + "WHERE id = ?";
            conn = DBConnection.openConnection();

//            prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, event.getId());
            ps.setString(2, event.getEventName());
            ps.setString(3, event.getEventDate());
            ps.setDouble(4, event.getEventPrice());
            ps.setString(5, event.getCustomerId());
            ps.executeUpdate();
            DBConnection.closeConnection();

        } catch (Exception ex) {
        }
    }

}
