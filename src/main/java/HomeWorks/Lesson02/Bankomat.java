package HomeWorks.Lesson02;

/*Реализовать программу «Банкомат».
        Программа дает возможность:
        •	Внести деньги на счет
        •	Вывести деньги со счета
        Дополнительно:
        •	Реализовать несколько типов счетов- «Текущий», «Дебетовый», «Кредитный».
        •	Реализовать перевод между счетами
        •	Реализовать правила связи между счетами-
        •	Снятие с любого счета более чем 30 000 за сеанс запрещено
        •	Наличие кредитного счета с балансом менее минус 20 000 запрещает работу с дебетовым счетом
        •	При пополнении текущего счета более чем на 1 000 000 за операцию- на дебетовый счет автоматически поступает +2 000*/

import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount you want to add to your balance: ");
        int refill = in.nextInt();
        System.out.println("Enter the account you want to refill: ");
        String ClientAccount = in.nextLine();
        System.out.println("Your balance is now: " + refill);
        System.out.println("Enter the sum you want to get: ");
        int getCash = in.nextInt();
        int balance = refill - getCash;

        if (getCash > refill)
            System.out.println("Not enough money");
        if (getCash == refill)
            System.out.println("Your balance is now: 0");
        if (getCash < refill)
            System.out.println("Your balance is now: " + balance);

    }

    public static int CLientAccount (int CreditAcc,
                                     String comand) {
        switch (comand) {
            case "Credit":
                return  = 0;
                break;
        }

    }


