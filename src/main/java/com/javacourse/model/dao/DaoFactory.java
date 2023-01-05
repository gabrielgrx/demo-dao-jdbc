package com.javacourse.model.dao;

import com.javacourse.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static  SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
