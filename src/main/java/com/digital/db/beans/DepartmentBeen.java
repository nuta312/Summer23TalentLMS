package com.digital.db.beans;

import com.digital.db.db_utils.DBConnection;
import org.apache.commons.dbutils.BeanProcessor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.digital.db.db_utils.DBConnection;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.dbutils.BeanProcessor;

@Data
@AllArgsConstructor
public class DepartmentBeen {
    private String dept_no;
    private String dept_name;

    public DepartmentBeen(){};
    public static List<DepartmentBeen> getAll() throws SQLException {
        String query = "SELECT * FROM departments";
        try(ResultSet resultSet = DBConnection.query(query)){
            return new BeanProcessor().toBeanList(resultSet, DepartmentBeen.class);
        }
    }

    public static DepartmentBeen getDeptNo(String column, String value) throws SQLException {
        String query = "SELECT *  FROM departments WHERE " + column + " = ?;";
        ResultSet rs = DBConnection.query(query, value);
        if(!rs.next()) return null;
        return new BeanProcessor().toBean(rs, DepartmentBeen.class);
    }

    public DepartmentBeen(ResultSet rs) throws SQLException {
        new BeanProcessor().populateBean(rs, this);
    }
}
