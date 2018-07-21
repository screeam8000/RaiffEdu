package week1.Lesson05.DataBase.DBrigth.Model;

public class Judgment {

    private int id;
    private String description;
    private int years;

    public Judgment(int id, String description, int years) {
        this.id = id;
        this.description = description;
        this.years = years;
    }

    @Override
    public String toString() {
        return "Judgment{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", years=" + years +
                '}';
    }
}
