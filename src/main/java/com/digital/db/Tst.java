package com.digital.db;

import com.digital.db.beans.DepartmentsBean;
import com.digital.db.beans.DeptEmpBean;
import com.digital.db.beans.EmployeeBean;
import com.digital.db.db_utils.DBConnection;

import java.sql.SQLException;

public class Tst {
    public static void main(String[] args) throws SQLException {
        DBConnection.open("employees");
//        DepartmentsBean.getAll().forEach(System.out::println);
//        System.out.println( DepartmentsBean.getByParams("dept_no", "d005"));
//        DeptEmpBean.getAll().forEach(System.out::println);
//        System.out.println(DeptEmpBean.getByParams("dept_no", "d009"));
        DBConnection.close();

    }
}