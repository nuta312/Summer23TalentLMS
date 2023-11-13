package com.digital.db;

import com.digital.db.beans.EmployeeBean;
import com.digital.db.db_utils.DBConnection;
import org.testng.Assert;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Tst {
    public static void main(String[] args) throws SQLException {
        DBConnection.open("employees");
//        int expectedIndex = 1;
//        int actualIndex =  EmployeeBean.getByNameLastName("Aibike","Imanbaeva").getEmp_no();
//        System.out.println(actualIndex);
//        Assert.assertEquals(expectedIndex,actualIndex);
//        System.out.println(EmployeeBean.getBy("emp_no", "1"));

//        EmployeeBean denis  = new EmployeeBean(5, "2000-07-15", "denis", "doe", "m", "2022-02-02");
//        try {
//            EmployeeBean result = EmployeeBean.createNewEmployee(denis, 5);
//            System.out.println(result);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
        Map<String, Object> updates = new LinkedHashMap<>();
        updates.put("first_name", "denis");
        updates.put("last_name", "totosheva");
       EmployeeBean res =  EmployeeBean.updateEmployee(2, updates);
        System.out.println(res);
        DBConnection.close();

    }
}