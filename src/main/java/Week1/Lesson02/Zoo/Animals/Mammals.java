package Week1.Lesson02.Zoo.Animals;

public class Mammals extends Animal {
    private boolean isWool;

    public boolean isWool() {
        return isWool;
    }

    public Mammals(String name, String colorDescription, boolean isWool) {
        super(name, colorDescription);
        this.isWool = isWool;
    }

    @Override
    public String toString() {
        return "Mleko{" +
                "isWool=" + isWool +
                ", name='" + name + '\'' +
                ", colorDescription='" + colorDescription + '\'' +
                '}';
    }
}
