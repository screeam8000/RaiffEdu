//package week1.lesson04.database.DBrigth.DAO;
//
//import week1.lesson04.database.DBrigth.connection.IConnectionManagment;
//import week1.lesson04.database.DBrigth.model.Camera;
//import week1.lesson04.database.DBrigth.model.Judgment;
//import week1.lesson04.database.DBrigth.model.Prisoner;
//import week1.lesson04.database.DBrigth.model.PrisonerRole;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//public class PrisonerDAO extends AbstractDAO {
//    public PrisonerDAO(IConnectionManagment connectionManager) {
//        super(connectionManager);
//    }
//
//    public List<Prisoner> getAllPrisoners() {
//        List<Prisoner> prisoners = new ArrayList<>();
//
//        Statement statement = null;
//
//        try{
//            statement = super.connectionManager.getConnection()
//                    .createStatement();
//
//            ResultSet rs = statement.executeQuery("SELECT pr.*, prl.*, cam.*, cond.*\n" +
//                    "FROM public.prisoner pr JOIN public.prisoner_role prl ON pr.prisoner_role_id = prl.id\n" +
//                    "                 JOIN public.camera cam ON pr.camera_id = cam.id\n" +
//                    "                 JOIN public.condemnation cond ON cond.id = pr.condemnation_id\n"
//            );
//
//            while (rs.next()) {
//                PrisonerRole prisonerRole =
//                        new PrisonerRole(rs.getInt(3),
//                                rs.getString(7),
//                                rs.getInt(8));
//
//                Camera camera =
//                        new Camera(rs.getInt(9),
//                                rs.getInt(10),
//                                rs.getInt(11));
//
//                Judgment condemnation =
//                        new Judgment(
//                                rs.getInt(12),
//                                rs.getString(13),
//                                rs.getInt(14)
//                        );
//
//                Prisoner prisoner = new Prisoner(
//                        rs.getInt(1),
//                        rs.getString(2),
//                        prisonerRole,
//                        camera,
//                        condemnation
//                );
//
//                prisoners.add(prisoner);
//            }
//        } catch (SQLException sqlEX) {
//            sqlEX.printStackTrace();
//        }
//
//        return prisoners;
//    }
//}
