package week0.lesson01.weapons;

public class BFG extends Weapon {
    public BFG(int power) {super(power);}

    @Override
    public void shout() {
        System.out.println("Big BADA BOOM!!!");
    }
}
