package com.digital.db.db_utils;
import com.digital.config.ConfigReader;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;

public class DBConnection {
    private static Connection connection;
    private static Statement statement;

    private DBConnection() {
    }

    public static void open(String db) throws SQLException {
        if (connection == null) {
            connection = getBaseDataSource(db).getConnection();
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            // создает объект Statement, который позволяет выполнять SQL-запросы
            // с возможностью прокрутки результата вперед и назад, но только для чтения, без возможности внесения изменений в базу данных
        }
    }

    //создает запрос
                                               //параметры возможные - optional
    public static ResultSet query(String query, Object... params) throws SQLException {
        if (params.length == 0)
            return statement.executeQuery(query);
            //  Statement является ключевым объектом для отправки SQL-запросов к базе данных
            //Он предоставляет методы для выполнения различных видов SQL-запросов
        else {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
              //при выполнении более сложных операций, таких как использование параметризованных запросов,
              // рекомендуется использовать PreparedStatement, так как это обеспечивает безопасность от SQL-инъекций и повышает производительность.
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }

            return preparedStatement.executeQuery();
        }
    }


    public static void close() {
        try {
            if (statement != null) {
                statement.close();
                statement = null;
            }
            if (connection != null) {
                connection.close();
                connection = null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static MysqlDataSource getBaseDataSource(String database) throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName(ConfigReader.getProperty("server"));
        dataSource.setPortNumber(Integer.parseInt(ConfigReader.getProperty("port")));
        dataSource.setServerTimezone("UTC");
        dataSource.setUser(ConfigReader.getProperty("user"));
        dataSource.setPassword(ConfigReader.getProperty("password"));
        dataSource.setDatabaseName(database);
        return dataSource;
    }
}