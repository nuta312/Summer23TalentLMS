package com.digital.db;

import com.digital.db.beans.DepartmentBeen;
import com.digital.db.beans.EmployeeBean;
import com.digital.db.db_utils.DBConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Tst {
    public static void main(String[] args) throws SQLException {
        DBConnection.open("employees");


//        EmployeeBean.getAll().forEach(System.out::println);
//        ResultSet rs = DBConnection.query("select * from employees where first_name = ?;","Leandro");
//        rs.next();
//        System.out.println(new EmployeeBean(rs));

//        System.out.println(EmployeeBean.getBy("first_name", "Leondro"));
//        System.out.println(EmployeeBean.searchByFirstNameLastNameDate("Georgi", "Facello", "1986-06-26"));


        DepartmentBeen.getAll().forEach(System.out::println);
//        ResultSet rs = DBConnection.query("select * from  departments where dept_name = ?;","Finance");
//        rs.next();
//        System.out.println(new DepartmentBeen(rs));
//        System.out.println(DepartmentBeen.getDeptNo("dept_no", "d009"));

        DBConnection.close();

    }
}