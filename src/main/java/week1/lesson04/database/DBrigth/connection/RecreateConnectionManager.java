package week1.lesson04.database.DBrigth.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RecreateConnectionManager implements IConnectionManagment {

    public static final String DB_URL = "jdbc:postgresql://localhost:5433/prison";
    public static final String USER_NAME = "postgres";
    public static final String USER_PASSWORD = "root";

    @Override
    public Connection getConnection() {
        Connection connection = null;

        try {
            connection =
                    DriverManager
                            .getConnection(DB_URL,
                                    USER_NAME, USER_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
