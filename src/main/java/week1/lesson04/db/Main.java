package week1.lesson04.db;


import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        Connection connection = null;
        Statement statement = null;

        try {
            connection =
                    DriverManager
                            .getConnection("jdbc:postgresql://localhost:5433/prison",
                                    "postgres", "root");

            statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("SELECT pr.name, prl.*, cam.*, cond.*\n" +
                    "FROM public.prisoner pr JOIN public.prisoner_role prl ON pr.prisoner_role_id = prl.id\n" +
                    "                 JOIN public.camera cam ON pr.camera_id = cam.id\n" +
                    "                 JOIN public.condemnation cond ON cond.id = pr.condemnation_id\n" +
                    "WHERE prl.rating = 100;");

            while (rs.next()) {
                System.out.print(rs.getString(1));
                System.out.print(" ");
                System.out.print(rs.getString(2));
                System.out.print(" ");
                System.out.print(rs.getString(3));
                System.out.print(" ");
                System.out.print(rs.getString("rating"));
                System.out.println();
            }
        } catch (SQLException sqlEx){
            sqlEx.printStackTrace();
        } finally {
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}