package Week1.Lesson02.Zoo;

import Week1.Lesson01.OOP.dirty.Animal;
import Week1.Lesson02.Zoo.Animals.Africa.Monkey;
import Week1.Lesson02.Zoo.Animals.Europe.Eagle;
import Week1.Lesson02.Zoo.Cages.Aviary;
import Week1.Lesson02.Zoo.Cages.Cage;
import Week1.Lesson02.Zoo.Cages.Paddock;

public class Zoo {
    private Cage[] cages;

    public Zoo(){
        cages = new Cage[2];

        Animal[] animalsFirst = new Animal[2];
        animalsFirst[0] = new Monkey ("Aby", "Brown", true, 4);
        animalsFirst[1] = new Monkey("Mister", "Black", true, 3);
        Cage first = new Aviary(animalsFirst, 10);
        cages[0] = first;

        Animal[] animalSecond = new Animal[2];
        animalSecond[0] = new Eagle("SharpEyed", "Black", (short) 10, 6);
        animalSecond[1] = new Eagle("Apt", "Grey", (short) 5, 4);
        Cage second = new Paddock(animalSecond, 10);
        cages[1] = second;
    }

    public String getCageReport(int cageNumber)
    { return cages[cageNumber].getCageDescription(); }

    public void buyTicket() {
    }

    public int getCageNumberByAnimalName(String animalName) {
        return 0;
    }
}