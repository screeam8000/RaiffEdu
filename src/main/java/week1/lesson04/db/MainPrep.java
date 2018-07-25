package week1.lesson04.db;

import java.sql.*;
import java.util.Scanner;

public class MainPrep {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        Scanner scanner = new Scanner(System.in);
        int rating = scanner.nextInt();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection =
                    DriverManager
                            .getConnection("jdbc:postgresql://localhost:5433/prison",
                                    "postgres", "root");

            statement = connection.prepareStatement("SELECT pr.name, prl.*, cam.*, cond.*\n" +
                    "FROM public.prisoner pr JOIN public.prisoner_role prl ON pr.prisoner_role_id = prl.id\n" +
                    "                 JOIN public.camera cam ON pr.camera_id = cam.id\n" +
                    "                 JOIN public.condemnation cond ON cond.id = pr.condemnation_id\n" +
                    "WHERE prl.rating = ? AND cam.number = ? ;");

            statement.setInt(1, rating);
            statement.setInt(2, 10);

            ResultSet rs = statement.executeQuery();

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
