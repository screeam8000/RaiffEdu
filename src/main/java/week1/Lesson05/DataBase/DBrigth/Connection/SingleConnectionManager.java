package week1.Lesson05.DataBase.DBrigth.Connection;

import java.sql.Connection;

public class SingleConnectionManager implements IConnectionManagment {
    private Connection connection;

    public SingleConnectionManager(){

    }

    @Override
    public Connection getConnection() {
        return null;
    }
}
