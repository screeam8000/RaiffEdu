package week1.Lesson05.DataBase.DBrigth.DAO;

import week1.Lesson05.DataBase.DBrigth.Connection.IConnectionManagment;
import week1.Lesson05.DataBase.DBrigth.Model.Camera;
import week1.Lesson05.DataBase.DBrigth.Model.Prisoner;
import week1.Lesson05.DataBase.DBrigth.Model.PrisonerRole;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PrisonerDAO extends AbstractDAO {

    public PrisonerDAO(IConnectionManagment connectionManagment) {
        super(connectionManagment);
    }

    //операции по запросу к БД

    public List<Prisoner> getAllPrisoners() {
        List<Prisoner> prisoners = new ArrayList<>();

        Statement statement = null;

        //код из препмаин где описывается селект в конструкции трай кэтч

        Camera camera = new Camera

        PrisonerRole prisonerRole =
                new PrisonerRole(prisoners.get(1),);

        Jugdment jugdment = new judgement;

        Prisoner prisoner = new Prisoner(
                rs.get(1),
                rs.getString(2),

        );

        return prisoners;
    }
}
