package week0.lesson01;

import week0.lesson01.weapons.BFG;
import week0.lesson01.weapons.Gun;
import week0.lesson01.weapons.ShortGun;
import week0.lesson01.weapons.Weapon;

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
