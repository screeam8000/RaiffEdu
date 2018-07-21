package homeworks.lesson01.bankomat.model.score;

import homeworks.lesson01.bankomat.model.account.Account;
import homeworks.lesson01.bankomat.model.money.Money;

public class DebitScore extends Score {

    private CreditScore creditScore;

    public DebitScore(Money balance, Account owner, Integer number, CreditScore creditScore) {
        super(balance, owner, number);
        this.creditScore = creditScore;
    }

    @Override
    public void addMoney(Money money){
        if(creditScore.getMoneyWithoutLess().getValue() < 20000) {
            System.out.println("No money on Credit score!");
            return;
        }
        super.addMoney(money);
    }

    @Override
    public Money getMoney(double balanceLess){
        if(creditScore.getMoneyWithoutLess().getValue() < 20000) {
            System.out.println("No money on Credit score!");
            return null;
        }

        if(this.getBalance().getValue() <= 0) {
            System.out.println("No money!");
            return null;
        }

        return super.getMoney(balanceLess);
    }

    @Override
    public Money getMoneyWithoutLess(){
        if(creditScore.getMoneyWithoutLess().getValue() < 20000) {
            System.out.println("No money on Credit score!");
            return null;
        }

        return super.getMoneyWithoutLess();
    }

    @Override
    boolean checkBefore() {
        return true;
    }
}

