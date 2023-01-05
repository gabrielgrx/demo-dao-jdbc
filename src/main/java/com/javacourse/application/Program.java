package com.javacourse.application;

import com.javacourse.model.dao.DaoFactory;
import com.javacourse.model.dao.SellerDao;
import com.javacourse.model.entities.Department;
import com.javacourse.model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findByAll ====");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

    }
}
