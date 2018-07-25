package week1.lesson03.reflection;

public class Child extends Parent implements IPlayer {
    public String name;
    protected int totalCash;
    private boolean isVirgin = true;

    public Child() {
    }

    public void saySome() {
        System.out.println("Bla bla");
    }

    protected int getTotalCash() {
        return this.totalCash;
    }

    private void changeVirgin() {
        this.isVirgin = false;
    }

    public void play(String gameName) {
        System.out.println("i play " + gameName);
    }

    public int getPlayEnjoy() {
        return 10;
    }
}
