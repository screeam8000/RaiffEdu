package Week1.Lesson01;

import java.util.Scanner;

public class UpgradeCalc {
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
        byte var5 = -1;
        switch (comand.hashCode()) {
            case 42:
                if (comand.equals("*")) {
                    var5 = 2;
                }
                break;
            case 43:
                if (comand.equals("+"))
                    var5 = 0;
        }
        break;
        case 47:
        if (comand.equals("/")) {
            var5 = 3;
        }
        break;
        case 102:
        if (comand.equals("f")) {
            var5 = 4;
        }
    }

    switch(var5){
        case 0:
            result = firstCalcNumber + secondCalcNumber;
            break;
        case 1:
            result = firstCalcNumber - secondCalcNumber;
            break;
        case 2:
            result = firstCalcNumber * secondCalcNumber;
            break;
        case 3:
            result = getDivide(firstCalcNumber, secondCalcNumber);
            break;
        case 4:
            result = getFactorial2(firstCalcNumber, secondCalcNumber);
    }

    return result;
}

private static int getFactorial (int firstCalcNumber, int secondCalcNumber){
    if (firstCalcNumber > 100 | secondCalcNumber > 100
            || firstCalcNumber > 50 && secondCalcNumber > 50){
        System.out.println("Too big number for factorial!");
        return 0;
        }else {
        int result = 1;

        for (int step = firstCalcNumber; step != secondCalcNumber; ++step){
            result *= step;
        }

        return result;
    }
}

private static int getFactorial2 (int firstCalcNumber, secondCalcNumber){
    int result = 1;

    for (int i =firstCalcNumber; i < secondCalcNumber; ++i){
        result *=i;
        }

        return result;
}

private static int getDivide (int firsCalcNumber, int secondCalcNumber){
    if (secondCalcNumber == 0){
        System.out.println("WRONG! Zero!");
        return 0;
    } else {
        return firsCalcNumber / secondCalcNumber;
    }
    }
}