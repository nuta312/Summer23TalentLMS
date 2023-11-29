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
public class SalariesBean {
    private int emp_no;
    private String salary;
    private String from_date;
    private String to_date;

    public SalariesBean(){};

    public static List<SalariesBean> getAll() throws SQLException {
        String query = "select * from salaries;";
        ResultSet resultSet = DBConnection.query(query);
        return resultSet.next() ? new BeanProcessor().toBeanList(resultSet, SalariesBean.class) : null;
    };

    public static SalariesBean getByParams(String column, String value) throws SQLException {
        String query = "select * from salaries where " + column + " = ?;";
        ResultSet resultSet = DBConnection.query(query,value);
        return resultSet.next() ? new BeanProcessor().toBean(resultSet, SalariesBean.class) : null;
    }

}
