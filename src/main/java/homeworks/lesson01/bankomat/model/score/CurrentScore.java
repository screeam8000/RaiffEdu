package homeworks.lesson01.bankomat.model.score;

import homeworks.lesson01.bankomat.model.account.Account;
import homeworks.lesson01.bankomat.model.money.Money;

public class CurrentScore extends Score{
    private DebitScore debitScore;

    public CurrentScore(Money balance, Account owner, Integer number, DebitScore debitScore) {
        super(balance, owner, number);
        this.debitScore = debitScore;
    }

    @Override
    public void addMoney(Money money){
        if(money.getValue() > 1000000) {
            Money moneyToDebet = new Money(2000, money.getCurrency().getName());
            debitScore.addMoney(moneyToDebet);
        }
        super.addMoney(money);
    }

    @Override
    public Money getMoney(double balanceLess){
        if(this.getBalance().getValue() - balanceLess <= 0) {
            System.out.println("No money!");
            return null;
        }

        return super.getMoney(balanceLess);
    }

    @Override
    public Money getMoneyWithoutLess(){
        return super.getMoneyWithoutLess();
    }

    @Override
    boolean checkBefore() {
        return true;
    }
}

