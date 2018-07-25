package week1.lesson04.database.DBrigth.DAO;

import week1.lesson04.database.DBrigth.connection.IConnectionManagment;

import java.sql.ResultSet;

public abstract class AbstractDAO {
    private static boolean IS_DRIVER_ACCESSIBLE;

    static {
        try {
            Class.forName("org.postgresql.Driver");
            IS_DRIVER_ACCESSIBLE = true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            IS_DRIVER_ACCESSIBLE = false;
        }
    }

    public static boolean isIsDriverAccessible() {
        return IS_DRIVER_ACCESSIBLE;
    }

    protected IConnectionManagment connectionManager;

    public AbstractDAO(IConnectionManagment connectionManager) {
        this.connectionManager = connectionManager;
    }
}
