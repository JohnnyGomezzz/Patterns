package ru.johnnygomezzz.pattern.datamapper.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private DBConnection() {}

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_users",
                    "root",
                    "123456"
            );
        } catch (SQLException e) {
            throw new RuntimeException("SWW during a connection", e);
        }
    }

    public static void close(Connection connection){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException("SWW during connection.close", e);
        }
    }
}
