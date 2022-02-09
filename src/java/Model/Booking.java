/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author fikri
 */
public class Booking implements Serializable {
    private int Id;
    private String status;
    private String date;
    private double amountToPay;
    private String customerId;
    private int hallNo;
    private String session;
    private String game;

    public Booking() {
    }

    public Booking(int Id, String status, String date, double amountToPay, String customerId, int hallNo, String session, String game) {
        this.Id = Id;
        this.status = status;
        this.date = date;
        this.amountToPay = amountToPay;
        this.customerId = customerId;
        this.hallNo = hallNo;
        this.session = session;
        this.game = game;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

   

    public int getHallNo() {
        return hallNo;
    }

    public void setHallNo(int hallNo) {
        this.hallNo = hallNo;
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(double amountToPay) {
        this.amountToPay = amountToPay;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    

}
