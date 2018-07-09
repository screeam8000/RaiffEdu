package Week1.Lesson01;

import java.util.Scanner;

public class UpgradeCalc {
    private static int firstCalcNumber;
    private static int secondCalcNumber;
    private static String comand;

    public UpgradeCalc() {
    }

    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstCalcNumber = userScanner.nextInt();
        System.out.println("Enter second number");
        int secondCalcNumber = userScanner.nextInt();
        System.out.println("Enter action");
        String comand = userScanner.next();
        int result = calcResult(firstCalcNumber, secondCalcNumber, comand);
        System.out.println("Your result is:");
        System.out.println(result);
    }

    public static int calcResult(int firstCalcNumber,
                                 int secondCalcNumber,
                                 String comand) {
        int result = 0;
        switch (comand) {
            case "+":
                result = firstCalcNumber + secondCalcNumber;
                break;
            case "-":
                result = firstCalcNumber - secondCalcNumber;
                break;
            case "*":
                result = firstCalcNumber * secondCalcNumber;
                break;
            case "/":
                result = getDivide(firstCalcNumber, secondCalcNumber);
                break;
            case "f":
                result = getFactorial2(firstCalcNumber, secondCalcNumber);
                break;
        }

        return result;
    }

    private static int getFactorial(int firstCalcNumber, int secondCalcNumber) {
        if(firstCalcNumber > 100 | secondCalcNumber > 100
                || (firstCalcNumber > 50
                && secondCalcNumber > 50)
                ) {
            System.out.println("Too big numbers for factorial!");
            return 0;
        }

        int result = 1;
        int step = firstCalcNumber;
        while (step != secondCalcNumber) {
            result *= step; //result = result * step;
            step++;// step = step + 1;
        }

        return result;
    }

    private static int getFactorial2(int firstCalcNumber, int secondCalcNumber) {
        int result = 1;
        for (int i = firstCalcNumber; i < secondCalcNumber; i++) {
            result *= i;
        }

        return result;
    }

    private static int getDivide(int firstCalcNumber, int secondCalcNumber) {
        if(secondCalcNumber == 0) {
            System.out.println("WRONG! Zero!");
            return 0;
        }

        return firstCalcNumber / secondCalcNumber;
    }
}

