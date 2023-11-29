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
public class
DepartmentsBean {
    private String dept_no;
    private String dept_name;

    public DepartmentsBean(){};
    public static List<DepartmentsBean> getAll() throws SQLException {
      String query = "select * from departments";
        ResultSet resultSet = DBConnection.query(query);
        return resultSet.next() ? new BeanProcessor().toBeanList(resultSet, DepartmentsBean.class) : null;
    };

    public static DepartmentsBean getByParams(String column,String value) throws SQLException {
      String query = "select * from departments where " + column + " = ?";
      ResultSet resultSet = DBConnection.query(query,value);
        return resultSet.next() ? new BeanProcessor().toBean(resultSet, DepartmentsBean.class) : null;
    };


}
