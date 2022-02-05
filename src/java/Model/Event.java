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
    private String name;
    private String description;
    private String date;
    private double price;
    
    
    public Event(){}

    public Event(int Id, String name, String description, String date, double price) {
        this.Id = Id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
