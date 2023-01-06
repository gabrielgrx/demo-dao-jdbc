package com.javacourse.application;

import com.javacourse.model.dao.DaoFactory;
import com.javacourse.model.dao.DepartmentDao;
import com.javacourse.model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: Department findById ====");
        Department department = departmentDao.findById(9);
        System.out.println(department);

        System.out.println("\n=== TEST 2: Department findAll and Order by Name ====");
        List<Department> list = departmentDao.findAll();
        for (Department dep : list) {
            System.out.println(dep);
        }

        System.out.println("\n=== TEST 3: Department insert ====");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment);
    }
}
