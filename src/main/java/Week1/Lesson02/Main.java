package Week1.Lesson02;

import Week1.Lesson02.Weapons.BFG;
import Week1.Lesson02.Weapons.Gun;
import Week1.Lesson02.Weapons.ShortGun;
import Week1.Lesson02.Weapons.Weapon;

public class Main {

    public static void main(String[] args){
        Weapon[] weapons = new Weapon[5];

        weapons[0] = new Gun(5);
        weapons[1] = new ShortGun(15);
        weapons[2] = new BFG(76);
        weapons[3] = new ShortGun(43);
        weapons[4] = new Gun(900);

        for (Weapon weapon:
                weapons){
            weapon.shout();
        }
    }
}
