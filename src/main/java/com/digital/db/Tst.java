package com.digital.db;

import com.digital.db.db_utils.DBConnection;

import java.sql.SQLException;

public class Tst {
    public static void main(String[] args) throws SQLException {
        DBConnection.open("employees");
        DBConnection.close();

    }
}