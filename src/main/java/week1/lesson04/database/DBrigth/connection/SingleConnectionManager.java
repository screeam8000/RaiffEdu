package week1.lesson04.database.DBrigth.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingleConnectionManager implements IConnectionManagment {
    public static final String DB_URL = "jdbc:postgresql://localhost:5433/prison";
    public static final String USER_NAME = "postgres";
    public static final String USER_PASSWORD = "root";

    private Connection connection;

    public SingleConnectionManager() {
        try {
            this.connection =
                    DriverManager
                            .getConnection(DB_URL,
                                    USER_NAME, USER_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() {
        return this.connection;
    }
}

