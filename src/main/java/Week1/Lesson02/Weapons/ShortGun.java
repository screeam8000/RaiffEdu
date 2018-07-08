package Week1.Lesson02.Weapons;

public class ShortGun extends Weapon {
    public ShortGun (int power) { super(power); }

    @Override
    public void shout() {
        System.out.println("Booom!");
    }
}
