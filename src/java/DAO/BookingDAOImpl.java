/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utility.DBConnection;
import Model.Booking;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fikri
 */
public class BookingDAOImpl implements DAO<Booking> {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List<Booking> getAll() {
        List<Booking> ul = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM BOOKING";
            conn = DBConnection.openConnection();
            //prepared statement
            ps = conn.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Booking u = new Booking();
                u.setId(rs.getInt("id"));
                u.setStatus(rs.getString("status"));
                u.setDate(rs.getString("date"));
                u.setAmountToPay(rs.getDouble("amountToPay"));
                u.setCustomerId(rs.getString("customerId"));
                u.setPaymentRef(rs.getInt("paymentRef"));
                ul.add(u);
            }
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
        return ul;
    }

    @Override
    public Booking get(int id) {
        Booking u = new Booking();
        try {
            String SQL = "SELECT * FROM BOOKING WHERE id = ?";
            conn = DBConnection.openConnection();
//            prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.next();
            u.setId(rs.getInt("id"));
            u.setStatus(rs.getString("status"));
            u.setDate(rs.getString("date"));
            u.setAmountToPay(rs.getDouble("amountToPay"));
            u.setCustomerId(rs.getString("customerId"));
            u.setPaymentRef(rs.getInt("paymentRef"));
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
        return u;
    }

    @Override
    public void insert(Booking booking) {
        try {
            String SQL = "INSERT INTO BOOKING "
                    + "(id,status,date,amountToPay,customerId,paymentRef) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?, ?)";
            conn = DBConnection.openConnection();
//          prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, booking.getId());
            ps.setString(2, booking.getStatus());
            ps.setString(3, booking.getDate());
            ps.setDouble(4, booking.getAmountToPay());
            ps.setString(5, booking.getCustomerId());
            ps.setInt(6, booking.getPaymentRef());
            ps.executeUpdate();
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
    }

    @Override
    public void delete(int id) {
        try {
            String SQL = "DELETE FROM BOOKING "
                    + "WHERE id = ?";
//          prepare statement
            conn = DBConnection.openConnection();
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, id);
            ps.executeUpdate();
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
    }

    @Override
    public void update(int id, Booking booking) {
        try {
            String SQL = "UPDATE BOOKING SET "
                    + "status = ?, "
                    + "date = ?, "
                    + "amountToPay = ?, "
                    + "customerId = ?, "
                    + "paymentRef = ? "
                    + "WHERE id = ?";
            conn = DBConnection.openConnection();

//            prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setString(1, booking.getStatus());
            ps.setString(2, booking.getDate());
            ps.setDouble(3, booking.getAmountToPay());
            ps.setString(4, booking.getCustomerId());
            ps.setInt(5, booking.getPaymentRef());
            ps.setInt(6, id);
            ps.executeUpdate();
            DBConnection.closeConnection();

        } catch (Exception ex) {
        }
    }
}
