/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Model.Hall;
import Utility.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class HallDAOImpl implements HallDAO<Hall> {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public List<Hall> getAll() {
        List<Hall> ul = new ArrayList<>();
        try
        {
            String SQL = "SELECT * FROM HALL";
            conn = DBConnection.openConnection();
            //prepared statement
            ps = conn.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next())
            {
                Hall hall = new Hall();
                hall.setDate(rs.getString("date"));
                hall.setGame(rs.getString("game"));
                hall.setHallNo(rs.getInt("hallNo"));
                hall.setTime(rs.getString("time"));
                hall.setVacancy(rs.getBoolean("vacancy"));
                ul.add(hall);
            }
            DBConnection.closeConnection();
           
        }
        
    catch(Exception ex)
    {
        
    }
        return ul;
    }

    @Override
    public Hall gethall(int a,String g,String t) {
        Hall hall = new Hall();
        try 
        {
           String SQL="SELECT * FROM HALL WHERE hallNo = ? AND game = ? AND time = ? ";
           conn= DBConnection.openConnection();
           //prepare statement
           ps=conn.prepareStatement(SQL);
           ps.setInt(1, a);
           ps.setString(2, g);
           ps.setString(3, t);
           
           rs = ps.executeQuery();
           rs.next();
           hall.setDate(rs.getString("date"));//string format
           hall.setGame(rs.getString("game"));
           hall.setHallNo(rs.getInt("hallNo"));
           hall.setTime(rs.getString("time"));
           hall.setVacancy(rs.getBoolean("vacancy"));
           DBConnection.closeConnection();
        }
        catch(Exception ex)
        {
            
        }
        return hall;
    }

    @Override
    public void insert(Hall t) {
        try
        {
           String SQL ="INSERT INTO HALL "
                   + "(date,game,hallNo,time,vacancy) "
                   + "VALUES "
                   + "(?,?,?,?,?)";
           conn = DBConnection.openConnection();
           //prepare statement
           ps =conn.prepareStatement(SQL);
           ps.setString(1, t.getDate());
           ps.setString(2, t.getGame());
           ps.setInt(3, t.getHallNo());
           ps.setString(4, t.getTime());
           ps.setBoolean(5, t.isVacancy());
           ps.executeUpdate();
           DBConnection.closeConnection();
        }
        catch(Exception ex)
        {
            
        }
    }

    @Override
    public void delete(int id) {
        try
        {
            String SQL = "DELETE FROM HALL "
                    +"WHERE hallNo = ?";
            //prepapre statement
            conn = DBConnection.openConnection();
            ps = conn.prepareStatement(SQL);
            ps.setInt(1, id);
            ps.executeUpdate();
            DBConnection.closeConnection();
        }
        catch(Exception ex)
        {
            
        }
    }

    @Override
    public void update(int id, Hall t) {
        try
        {
            
            String SQL = "UPDATE HALL SET "
                    + "date = ?, "
                    + "vacancy = ? "
                    + "WHERE hallNo = ? AND "
                    + "game = ? AND "
                    + "time = ? ";
            conn = DBConnection.openConnection();
            
            //prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setString(1, t.getDate());
            ps.setBoolean(2, t.isVacancy());
            ps.setInt(3, id);
            ps.setString(4, t.getGame());
            ps.setString(5, t.getTime());
            
            ps.executeUpdate();
            DBConnection.closeConnection();
            
            
        }
        catch(Exception ex)
        {
            
        }
    }
    public void updatedate(Hall a, LocalDate t) {
        try
        {
            
            String SQL = "UPDATE HALL SET "
                    + "date = ? "
                    + "WHERE hallNo = ? AND "
                    + "game = ? AND "
                    + "time = ? ";
            conn = DBConnection.openConnection();
            
            //prepare statement
            ps = conn.prepareStatement(SQL);
            ps.setString(1, t.toString());
            ps.setInt(2, a.getHallNo());
            ps.setString(3, a.getGame());
            ps.setString(4, a.getTime());
            
            ps.executeUpdate();
            DBConnection.closeConnection();
            
            
        }
        catch(Exception ex)
        {
            
        }
    }

    @Override
    public Hall get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
