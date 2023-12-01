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
public class TitlesBean {
    private int emp_no;
    private String title;
    private String from_date;
    private String to_date;

    public TitlesBean(){};
    public static List<TitlesBean> getAll() throws SQLException {
        String query = "select * from titles;";
        ResultSet resultSet = DBConnection.query(query);

        return resultSet.next() ? new BeanProcessor().toBeanList(resultSet, TitlesBean.class) : null;
    };

    public static TitlesBean getByParams(String column, String value) throws SQLException {
        String query = "select * from titles where " + column + " = ?;";
        ResultSet resultSet = DBConnection.query(query,value);
        return resultSet.next() ? new BeanProcessor().toBean(resultSet, TitlesBean.class) : null;
    }
}
