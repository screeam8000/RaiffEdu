package HomeWorks.Lesson02.Bankomat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();

        Money money = new Money(val, "RUR");
        atm.getCreditScore().addMoney(money);
    }
}
