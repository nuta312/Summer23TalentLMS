package com.digital.db;

import com.digital.db.beans.EmployeeBean;
import com.digital.db.db_utils.DBConnection;

import java.sql.SQLException;

public class Tst {
    public static void main(String[] args) throws SQLException {
        DBConnection.open("employees");

        System.out.println(EmployeeBean.searchByFirstNameLastNameDate("Georgi", " Facello ", " = 1986-06-26"));
        DBConnection.close();
//        System.out.println(EmployeeBean.getBy("first_name", "Leondro"));


        DBConnection.close();

    }
}