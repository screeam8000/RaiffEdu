package Week1.Lesson02.Zoo.Animals.Africa;

import Week1.Lesson02.Zoo.Animals.Mammals;

public class Monkey extends Mammals {
    private int wordKnown;

    public int getWordKnown(){ return wordKnown; }

    public void setWordKnown(int wordKnown) { this.wordKnown = wordKnown; }

    public Monkey(String name, String colorDescription, boolean isWool, int wordKnown) {
        super(name, colorDescription, isWool);
        this.wordKnown = wordKnown;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "wordKnown=" + wordKnown +
                ", name='" + name + '\'' +
                ", colorDescription='" + colorDescription + '\'' +
                '}';
    }
}
