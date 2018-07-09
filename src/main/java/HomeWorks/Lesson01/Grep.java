package HomeWorks.Lesson01;

 /*
    Необходимо реализовать консольную программу,
    которая бы фильтровала поток текстовой информации
    подаваемой на вход и на выходе
    показывала лишь те строчки,
    которые содержат слово
    передаваемое программе на вход в качестве аргумента.

Дополнительно:
1.	Программа не должна учитывать регистр
2.	В аргументах может быть передано не одно слово, а несколько
3.	В качестве аргумента может быть задано не конкретное слово,
    а регулярное выражение
    * */

import java.util.Scanner;

public class Grep {
    public static void main(String[] args) {
        System.out.println(args[0]);
        Scanner scanner = new Scanner(System.in);

        workCycle(scanner, args);
    }

    public static void workCycle(Scanner scanner, String [] conditions){
        String userMessage;

        while (true){
            userMessage = scanner.next();

            for (String condition:
                    conditions){
                if (checkMessageForCondition(userMessage, condition)){
                    System.out.println(userMessage);
                }
            }
        }
    }

    public static boolean checkMessageForCondition (String userMessage,
                                                    String condition){
        if (condition.contains("\\")){
            return userMessage.matches(condition);
        } else {
            return userMessage
                    .toLowerCase()
                    .contains(condition.toLowerCase());
        }
    }
}
