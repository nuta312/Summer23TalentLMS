package com.digital.db;

import com.digital.db.beans.EmployeeBean;
import com.digital.db.db_utils.DBConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Tst {
    public static void main(String[] args) throws SQLException {
        DBConnection.open("employees");

      // EmployeeBean.getAllEmployees().forEach(System.out::println);


//        ResultSet rs= DBConnection.query("select * from employees where first_name = ?;" ,"Leandro");
//        rs.next();
//        System.out.println(new EmployeeBean(rs));

     //   System.out.println(EmployeeBean.getBy("first_name", "Leandro"));

        System.out.println(EmployeeBean.searchByFirstNameLastNameDate("Leandro", " Speel", "1986-06-26"));





        DBConnection.close();

    }
}