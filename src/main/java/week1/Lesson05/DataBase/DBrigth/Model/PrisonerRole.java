package week1.Lesson05.DataBase.DBrigth.Model;

public class PrisonerRole {

    private int id;
    private String name;
    private int rating;

    public PrisonerRole(int id, String name, int rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "PrisonerRole{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
