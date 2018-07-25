package week1.lesson03.weapons;

import java.util.Scanner;

public class WeaponExecutor {
    public WeaponExecutor() {
    }

    public static void main(String[] args) {
        Weapon[] weapons = new Weapon[]{new Gun(10), new ShortGun(5), new Gun(15), new BFG(100), new Gun(4), new BFG(200)};
        Scanner scanner = new Scanner(System.in);
        System.out.println("What weapon do you want to ban?");
        String bannedWeaponName = scanner.next();
        Weapon[] var4 = weapons;
        int var5 = weapons.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            Weapon weapon = var4[var6];
            if (weapon.getClass().getName().equals(bannedWeaponName)) {
                System.out.println("Sorry " + bannedWeaponName + " is banned!");
            } else {
                weapon.shout();
            }
        }

    }
}
