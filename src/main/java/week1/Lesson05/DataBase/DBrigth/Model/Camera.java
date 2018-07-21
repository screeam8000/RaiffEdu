package week1.Lesson05.DataBase.DBrigth.Model;

public class Camera {

    private int id;
    private int number;
    private int placeCount;

    public Camera(int id, int number, int placeCount) {
        this.id = id;
        this.number = number;
        this.placeCount = placeCount;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public int getPlaceCount() {
        return placeCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPlaceCount(int placeCount) {
        this.placeCount = placeCount;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "id=" + id +
                ", number=" + number +
                ", placeCount=" + placeCount +
                '}';
    }
}
