package com.javacourse.application;

import com.javacourse.model.dao.DaoFactory;
import com.javacourse.model.dao.SellerDao;
import com.javacourse.model.entities.Department;
import com.javacourse.model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);

    }
}
