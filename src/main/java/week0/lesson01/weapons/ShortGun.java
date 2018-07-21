package week0.lesson01.weapons;

public class ShortGun extends Weapon {
    public ShortGun (int power) { super(power); }

    @Override
    public void shout() {
        System.out.println("Booom!");
    }
}
