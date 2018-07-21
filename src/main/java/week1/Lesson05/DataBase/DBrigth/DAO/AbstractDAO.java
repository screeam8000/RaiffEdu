package week1.Lesson05.DataBase.DBrigth.DAO;

import week1.Lesson05.DataBase.DBrigth.Connection.IConnectionManagment;

import java.sql.ResultSet;

public abstract class AbstractDAO {

    private static boolean IS_DRIVER_ACCESSEBLE;
    ResultSet rs =

    static {
        //прогрузить блок драйвера
    }

    protected IConnectionManagment connectionManagment;

    public AbstractDAO(IConnectionManagment connectionManagment) {
        this.connectionManagment = connectionManagment;
    }
}
