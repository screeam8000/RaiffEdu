package week1.Lesson05.DataBase.DBrigth.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class PooledConnectionManager implements IConnectionManagment {

    private Map <Integer, Connection> connectionPool = new HashMap<>();
    private int poolCapacity;

    public PooledConnectionManager(Map<Integer, Connection> connectionPool, int poolCapacity) {
                this.poolCapacity = poolCapacity;

        for (int i = 0; i < poolCapacity; i++){
            try{
                Connection connection = DriverManager.getConnection((""));

                connectionPool.put(i, connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Connection getConnection() {
         Integer firstKey = connectionPool.keySet().iterator().next();
         Connection connection = connectionPool.get(firstKey);
         connectionPool.remove(firstKey);

        return connection;
    }

    public void returnConnection (Connection connection){
        Integer newKey = 0;
        for (Integer key:
                connectionPool.keySet()){
            newKey = key;
        }

        newKey++;

        connectionPool.put(newKey, connection);
    }

}
