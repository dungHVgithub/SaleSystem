/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hvd.springdemoapp;

import com.hvd.pojo.Product;
import com.hvd.repository.impl.CategoryRepositoryImpl;
import com.hvd.repository.impl.ProductRepositoryImpl;
import com.hvd.repository.impl.StatsRepositoryImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public class SpringDemoApp {

    public static void main(String[] args) {
//        System.out.println("Danh sách category\n=============================\n");
//        CategoryRepositoryImpl s = new CategoryRepositoryImpl();
//        s.getCates().forEach(c -> System.out.println(c.getName()));
//        
//        
//        Map<String,String> params = new HashMap<>();
//       
//        //params.put("categoryId","2");
//         params.put("page","2");
//        ProductRepositoryImpl s3 = new ProductRepositoryImpl();
//        s3.getProds(params).forEach(p -> System.out.printf("%d-%s-%.1f\n",p.getId(),p.getName(),p.getPrice()));
//         
        StatsRepositoryImpl s = new StatsRepositoryImpl();
        s.statsRevenueByProduct().forEach(o -> System.out.printf("%d-%s: %.1f\n",o[0],o[1],o[2]));
    }
}
