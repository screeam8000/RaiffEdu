package week0.lesson01.zoo;


import week0.lesson01.zoo.animals.africa.Monkey;
import week0.lesson01.zoo.animals.Animal;
import week0.lesson01.zoo.animals.europe.Eagle;
import week0.lesson01.zoo.cages.Aviary;
import week0.lesson01.zoo.cages.Cage;
import week0.lesson01.zoo.cages.Paddock;

public class Zoo {
    private Cage[] cages;

    public Zoo() {
        cages = new Cage[2];

        Animal[] animalsFirst = new Animal[2];
        animalsFirst[0] = new Monkey("Aby", "Brown", true, 4);
        animalsFirst[1] = new Monkey("Mister", "Black", true, 3);
        Cage first = new Aviary(animalsFirst,10);
        cages[0] = first;

        Animal[] animalsSecond = new Animal[2];
        animalsSecond[0] = new Eagle("Zorkii", "black", (short) 10, 6);
        animalsSecond[1] = new Eagle("Metkii", "gray", (short) 5, 4);
        Cage second = new Paddock(animalsSecond,10);
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
