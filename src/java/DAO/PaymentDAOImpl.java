/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utility.DBConnection;
import Model.Booking;
import Model.Payment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fikri
 */
public class PaymentDAOImpl implements DAO<Payment> {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List<Payment> getAll() {
        List<Payment> paymentList = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM PAYMENT";
            conn = DBConnection.openConnection();
            //prepared statement
            ps = conn.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Payment payment = new Payment();
                payment.setInvoiceId(rs.getInt("invoiceId"));
                payment.setDate(rs.getString("date"));
                payment.setCustomerId(rs.getString("customerId"));
                paymentList.add(payment);
            }
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
        return paymentList;
    }

    @Override
    public Payment get(int id) {
        Payment payment = new Payment();
        try {
            String SQL = "SELECT * FROM PAYMENT WHERE invoiceId = ?";
            conn = DBConnection.openConnection();
//            prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.next();
            payment.setInvoiceId(rs.getInt("invoiceId"));
            payment.setDate(rs.getString("date"));
            payment.setCustomerId(rs.getString("customerId"));
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
        return payment;
    }

    @Override
    public void insert(Payment payment) {
        try {
            String SQL = "INSERT INTO PAYMENT "
                    + "(invoiceId,date,customerId) "
                    + "VALUES "
                    + "(?, ?, ?)";
            conn = DBConnection.openConnection();
//          prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, payment.getInvoiceId());
            ps.setString(2, payment.getDate());
            ps.setString(3, payment.getCustomerId());
            ps.executeUpdate();
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
    }

    @Override
    public void delete(int id) {
        try {
            String SQL = "DELETE FROM PAYMENT "
                    + "WHERE invoiceId = ?";
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
    public void update(int id, Payment payment) {
        try {
            String SQL = "UPDATE PAYMENT SET "
                    + "date = ?, "
                    + "customerId = ? "
                    + "WHERE invoiceId = ?";
            conn = DBConnection.openConnection();
            
//            prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setString(1, payment.getDate());
            ps.setString(2, payment.getCustomerId());
            ps.setInt(3, id);
            ps.executeUpdate();
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
    }

    @Override
    public Payment get1(String cId) {
        Payment payment = new Payment();
        try {
            String SQL = "SELECT * FROM PAYMENT WHERE customerId = ?";
            conn = DBConnection.openConnection();
//            prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setString(1, cId);
            rs = ps.executeQuery();
            rs.next();
            payment.setInvoiceId(rs.getInt("invoiceId"));
            payment.setDate(rs.getString("date"));
            payment.setCustomerId(rs.getString("customerId"));
            DBConnection.closeConnection();
        } catch (Exception ex) {
        }
        return payment;
    }

}
