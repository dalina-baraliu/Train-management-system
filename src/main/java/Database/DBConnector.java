
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    private static Connection connection = null;

    private static final String DB_URL =
            "jdbc:postgresql://localhost:5432/knk_project";

    private static final String DB_USER = "postgres";

    private static final String DB_PASSWORD = System.getenv("DB_PASSWORD");

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(
                        DB_URL, DB_USER, DB_PASSWORD
                );
            }
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

