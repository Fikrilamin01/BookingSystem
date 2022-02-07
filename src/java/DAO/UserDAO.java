/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.User;
import java.util.List;

/**
 *
 * @author fikri
 */
public interface UserDAO<T> {
     //define all the methods available to access the data
    public List<T> getAll();
    public T get(String username);
    public void insert(T t);
    public void delete(String username);
    public void update(String username, T t);   
    public void adminUpdate(String username, T t);   
}
