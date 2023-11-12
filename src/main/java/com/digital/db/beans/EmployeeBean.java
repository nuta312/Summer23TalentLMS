package com.digital.db.beans;

import com.digital.db.db_utils.DBConnection;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.dbutils.BeanProcessor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Data
@AllArgsConstructor
public class EmployeeBean {

    private int emp_no;
    private String birth_date;
    private String first_name;
    private String last_name;
    private String gender;
    private String hire_date;

    public EmployeeBean() {
    }

    public static List<EmployeeBean> getAllEmployees() throws SQLException {
        String query = "SELECT * FROM employees";
        try (ResultSet resultSet = DBConnection.query(query)) {
            return new BeanProcessor().toBeanList(resultSet, EmployeeBean.class);
        }
    }

    public static EmployeeBean getBy(String column, String value) throws SQLException {
        String query = "SELECT * FROM employees WHERE " + column + " = ?;";
        ResultSet rs = DBConnection.query(query, value);
        if (!rs.next()) return null;
        return new BeanProcessor().toBean(rs, EmployeeBean.class);
    }

    public EmployeeBean(ResultSet rs) throws SQLException {
        new BeanProcessor().populateBean(rs, this);
    }

    public static EmployeeBean searchByFirstNameLastNameDate(String firstName, String lastName, String date) throws SQLException {
        // Добавляем кавычки и пробелы в SQL-запрос
        String query = "String query = SELECT * FROM employees WHERE first_name = ? AND last_name = ? AND hire_date = ?";

        ResultSet rs = DBConnection.query(query);
        if (!rs.next()) return null;

        return new BeanProcessor().toBean(rs, EmployeeBean.class);
    }

}