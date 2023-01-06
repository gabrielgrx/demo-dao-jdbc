package com.javacourse.model.dao;

import com.javacourse.db.DB;
import com.javacourse.model.dao.impl.DepartmentDaoJDBC;
import com.javacourse.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static  SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
