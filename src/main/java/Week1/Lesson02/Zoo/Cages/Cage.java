package Week1.Lesson02.Zoo.Cages;

import Week1.Lesson02.Zoo.Animals.Animal;

public class Cage implements ICageDescriptor {
    protected Animal[] animals;

    public Cage (Animal[] animals){ this.animals = animals; }

    @Override
    public String getCageDescription() {
        StringBuilder descriptionBuilder = new StringBuilder();

        for (Animal animal:
                animals){
            descriptionBuilder.append(animal.toString());
        }

        return descriptionBuilder.toString();
    }
}
