package Week1.Lesson02.Weapons;

public class BFG extends Weapon {
    public BFG(int power) {super(power);}

    @Override
    public void shout() {
        System.out.println("Big BADA BOOM!!!");
    }
}
