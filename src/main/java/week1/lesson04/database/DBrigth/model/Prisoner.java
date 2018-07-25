package week1.lesson04.database.DBrigth.model;

import javafx.scene.Camera;

public class Prisoner {
    private int id;
    private String name;
    private PrisonerRole prisonerRole;
    private Camera camera;
    private Judgment judgment;

    public Prisoner(int id, String name, PrisonerRole prisonerRole, Camera camera, Judgment judgment) {
        this.id = id;
        this.name = name;
        this.prisonerRole = prisonerRole;
        this.camera = camera;
        this.judgment = judgment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Prisoner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prisonerRole=" + prisonerRole +
                ", camera=" + camera +
                ", judgment=" + judgment +
                '}';
    }
}
