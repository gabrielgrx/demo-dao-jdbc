package com.javacourse.application;

import com.javacourse.model.dao.DaoFactory;
import com.javacourse.model.dao.SellerDao;
import com.javacourse.model.entities.Department;
import com.javacourse.model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {


        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

    }
}
