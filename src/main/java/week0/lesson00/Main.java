package week0.lesson00;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstCalcNumber = userScanner.nextInt();
        System.out.println("Enter second number");
        int secondCalcNumber = userScanner.nextInt();
        System.out.println("Enter action");
        String comand = userScanner.next();
        int result = 0;
        if (comand.equals("+")) {
            result = firstCalcNumber + secondCalcNumber;
        }

        if (comand.equals("-")) {
            result = firstCalcNumber - secondCalcNumber;
        }

        System.out.println("Your result is");
        System.out.println(result);
    }
}
