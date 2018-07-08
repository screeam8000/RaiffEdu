package Week1.Lesson02.Zoo.Cages;

import Week1.Lesson02.Zoo.Animals.Animal;

public class Aviary extends Cage {
    private int radius;

    public Aviary(Animal[] animals, int radius) {
        super(animals);
        this.radius = radius;
    }

    @Override
    public String getCageDescription() {
        StringBuilder descriptionBuilder = new StringBuilder();

        descriptionBuilder.append(super.getCageDescription());
        descriptionBuilder.append("Aviary raduis=");
        descriptionBuilder.append(this.radius);

        return descriptionBuilder.toString();
    }
}
