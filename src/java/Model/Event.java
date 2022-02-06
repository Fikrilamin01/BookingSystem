/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
/**
 *
 * @author M S I
 */
public class Event implements Serializable{

    private int Id;
    private String eventName;
    private String eventDate;
    private double eventPrice;
    private String customerId;

    public Event() {
    }

    public Event(int Id, String eventName, String eventDate, double eventPrice, String customerId) {
        this.Id = Id;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventPrice = eventPrice;
        this.customerId = customerId;
    }

    public int getId() {
        return Id;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public double getEventPrice() {
        return eventPrice;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public void setEventPrice(double eventPrice) {
        this.eventPrice = eventPrice;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
}
