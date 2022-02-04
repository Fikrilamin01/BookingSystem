/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author fikri
 */
public class Customer extends User implements Serializable{
    private int age;
    private String address;
    private String city;
    private String country;
    private int postal;

    public Customer() {
    }

    public Customer(int age, String address, String city, String country, int postal, String name, String userName, String email, String password, String role) {
        super(name, userName, email, password, role);
        this.age = age;
        this.address = address;
        this.city = city;
        this.country = country;
        this.postal = postal;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPostal() {
        return postal;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
