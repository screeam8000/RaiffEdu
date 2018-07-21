package week1.Lesson05.DataBase.DBrigth;

import week1.Lesson05.DataBase.DBrigth.Connection.SingleConnectionManager;
import week1.Lesson05.DataBase.DBrigth.DAO.PrisonerDAO;

public class Main {
    public static void main(String[] args) {

        PrisonerDAO prisonerDAO = new PrisonerDAO(new SingleConnectionManager());

        System.out.println(prisonerDAO.getAllPrisoners());
    }
}
