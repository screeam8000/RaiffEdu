package Week1.Lesson02.Zoo.Animals;

public class Animal {
    protected String name;
    protected String colorDescription;

    public String getName() {
        return name;
    }

    public String getColorDescription() {
        return colorDescription;
    }

    public Animal(String name, String colorDescription) {
        this.name = name;
        this.colorDescription = colorDescription;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", colorDescription='" + colorDescription + '\'' +
                '}';
    }
}
