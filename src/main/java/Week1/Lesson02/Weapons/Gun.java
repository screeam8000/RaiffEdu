package Week1.Lesson02.Weapons;

public class Gun extends Weapon {
    public Gun(int power) {super(power);}

    @Override
    public void shout() {
        System.out.println("Bang!");
    }
}
