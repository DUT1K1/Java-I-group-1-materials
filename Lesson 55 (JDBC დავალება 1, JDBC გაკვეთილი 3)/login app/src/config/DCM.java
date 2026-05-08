package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DCM {
    private static String url =
            "jdbc:postgresql://localhost:5433/test";
    private static String user =
            "postgres";
    private static String password =
            "admin";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                url,
                user,
                password
        );
    }
}
