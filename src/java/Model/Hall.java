/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;


/**
 *
 * @author pc
 */
public class Hall implements Serializable {
    private String Game;
    private int HallNo;
    private String time;
    private String date;
    private boolean vacancy;
    private String customerId;

    public Hall(String Game, int HallNo, String time, String date, boolean vacancy, String customerId) {
        this.Game = Game;
        this.HallNo = HallNo;
        this.time = time;
        this.date = date;
        this.vacancy = vacancy;
        this.customerId = customerId;
    }

    public Hall() {
        
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    public String getGame() {
        return Game;
    }

    public void setGame(String Game) {
        this.Game = Game;
    }

    public int getHallNo() {
        return HallNo;
    }

    public void setHallNo(int HallNo) {
        this.HallNo = HallNo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isVacancy() {
        return vacancy;
    }

    public void setVacancy(boolean vacancy) {
        this.vacancy = vacancy;
    }
    
    
    
    
    
}
