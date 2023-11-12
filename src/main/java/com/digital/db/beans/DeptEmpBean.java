package com.digital.db.beans;

import com.digital.db.db_utils.DBConnection;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.dbutils.BeanProcessor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Data
@AllArgsConstructor
public class DeptEmpBean {
    private int emp_no;
    private String dept_no;
    private String from_date;
    private String to_date;
    public DeptEmpBean() {};

    public static List<DeptEmpBean> getAll() throws SQLException {
      String query = "select * from dept_emp;";
        ResultSet resultSet = DBConnection.query(query);
        return resultSet.next() ? new BeanProcessor().toBeanList(resultSet,DeptEmpBean.class) : null;
    };

    public static  DeptEmpBean getByParams(String column,String value) throws SQLException {
        String query = "select * from dept_emp where " + column + " = ?;";
        ResultSet resultSet = DBConnection.query(query,value);
        return resultSet.next() ? new BeanProcessor().toBean(resultSet,DeptEmpBean.class) : null;
    }
}
