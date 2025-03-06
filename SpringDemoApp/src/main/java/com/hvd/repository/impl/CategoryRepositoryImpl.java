/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvd.repository.impl;

import com.hvd.pojo.Category;
import com.hvd.springdemoapp.HibernateUtils;
import jakarta.persistence.Query;
import java.util.List;

import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class CategoryRepositoryImpl {
    public List<Category> getCates(){
        try(Session s =HibernateUtils.getFACTORY().openSession()){
        Query q = s.createQuery("FROM Category",Category.class);
        return q.getResultList();
        }
    }
}
