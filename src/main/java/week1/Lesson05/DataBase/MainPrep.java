package week1.Lesson05.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MainPrep {
    public static void main (String[] args){
        try{
            Class.forName("some.name.org.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        Scanner scanner = new Scanner(System.in);
        int rating = scanner.nextInt();

        Connection connection = null;
        PreparedStatement statement = null;

        try{
            connection =
                    DriverManager.getConnection("url bd", "postgres", "parol");
            //create constant from string it is better :)

            statement = connection.prepareStatement("select sql ");


        }
    }
}
