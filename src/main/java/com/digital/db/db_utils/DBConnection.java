package com.digital.db.db_utils;
import com.digital.config.ConfigReader;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.apache.commons.dbutils.BeanProcessor;

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

    public static <T> T insertAndRetrieveBean(String insertQuery, String retrieveQuery,Class<T> beanClass, Object... insertParams) throws SQLException {
        // Выполнение вставки
        PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
        for (int i = 0; i < insertParams.length; i++) {
            insertStatement.setObject(i + 1, insertParams[i]);
        }
        insertStatement.executeUpdate();

        // Получение созданного объекта Java Bean
        PreparedStatement retrieveStatement = connection.prepareStatement(retrieveQuery);
        // Предположим, что retrieveQuery возвращает только одну запись и ваш Java Bean может быть создан с использованием BeanProcessor
        ResultSet resultSet = retrieveStatement.executeQuery();
        if (resultSet.next()) {
            return new BeanProcessor().toBean(resultSet, beanClass);
        } else {
            return null; // Возвращаем null, если запись не найдена
        }
    }

    public static <T> T updateAndRetrieveBean(String updateQuery, String retrieveQuery, Class<T> beanClass, Object... insertParams) throws SQLException {
        try {
            PreparedStatement insertStatement = connection.prepareStatement(updateQuery);
            for (int i = 0; i < insertParams.length; i++) {
                insertStatement.setObject(i + 1, insertParams[i]);
            }
            int rowsUpdated = insertStatement.executeUpdate();
            if (rowsUpdated == 0) {
                System.out.println("No rows updated. Returning null.");
                return null;
            }
            PreparedStatement retrieveStatement = connection.prepareStatement(retrieveQuery);
            ResultSet resultSet = retrieveStatement.executeQuery();

            if (resultSet.next()) {
                return new BeanProcessor().toBean(resultSet, beanClass);
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static <T> T deleteBean(String deleteQuery, String retrieveQuery,Class<T> beanClass, Object... insertParams) throws SQLException {
        PreparedStatement insertStatement = connection.prepareStatement(deleteQuery);
        for (int i = 0; i < insertParams.length; i++) {
            insertStatement.setObject(i + 1, insertParams[i]);
        }
        insertStatement.executeUpdate();
        PreparedStatement retrieveStatement = connection.prepareStatement(retrieveQuery);
        ResultSet resultSet = retrieveStatement.executeQuery();
        if (resultSet.next()) {
            return new BeanProcessor().toBean(resultSet, beanClass);
        } else {
            return null;
        }
    }

    //метод для добавления изменения удаления


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
        dataSource.setServerTimezone("UTC");
        dataSource.setDatabaseName(database);
        return dataSource;
    }


}