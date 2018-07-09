package Week1.Lesson02.Zoo.Cages;

import Week1.Lesson02.Zoo.Animals.Animal;

public class Paddock extends Cage{
    private int square;

    public Paddock(Week1.Lesson01.OOP.dirty.Animal[] animalsSecond, int square) {
        super(animalsSecond, square);
    }

    public int getSquare() { return square; }

    public void setSquare(int square) {
        this.square = square;
    }

    public Paddock(Animal[] animals, int square) {
        super(animals);
        this.square = square;
    }

    @Override
    public String getCageDescription() {
        StringBuilder descriptionBuilder = new StringBuilder();

        descriptionBuilder.append(super.getCageDescription());
        descriptionBuilder.append("square=");
        descriptionBuilder.append(this.square);

        return descriptionBuilder.toString();
    }
}
