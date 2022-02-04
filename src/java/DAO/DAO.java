/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author fikri
 */
public interface DAO<T> {
    //define all the methods available to access the data
    public List<T> getAll();
    public T get(int id);
    public void insert(T t);
    public void delete(int id);
    public void update(int id, T t);   
}
