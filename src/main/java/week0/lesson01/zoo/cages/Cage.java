package week0.lesson01.zoo.cages;

import week0.lesson01.zoo.animals.Animal;

public class Cage implements ICageDescriptor {
    protected Animal[] animals;

    public Cage (Animal[] animals){ this.animals = animals; }

    public Cage(week0.lesson00.OOP.dirty.Animal[] animalsFirst, int radius) {

    }

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
