/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;


/**
 *
 * @author pc
 */
public interface HallDAO<T> {
    public List<T> getAll();
    public T get(int id);
    public void insert(T t);
    public void delete(int id);
    public void update(int id, T t);
     public T gethall(int a,String g,String t);
}
