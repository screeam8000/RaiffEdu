package homeworks.lesson01.bankomat;

import homeworks.lesson01.bankomat.model.constants.CurrencyHolder;
import homeworks.lesson01.bankomat.model.money.Money;
import homeworks.lesson01.bankomat.model.score.CreditScore;
import homeworks.lesson01.bankomat.model.score.CurrentScore;
import homeworks.lesson01.bankomat.model.score.DebitScore;

public class ATM {

    private CurrentScore currentScore;
    private DebitScore debetScore;
    private CreditScore creditScore;

    public ATM() {
        this.creditScore =
                new CreditScore(
                        new Money(1000.0d,
                                CurrencyHolder.getCurrencyByName("RUR").getName()
                        ), null, 1);
        this.debetScore =
                new DebitScore(
                        new Money(1000.0d,
                                CurrencyHolder.getCurrencyByName("RUR").getName()
                        ), null, 1, this.creditScore);
        this.currentScore =
                new CurrentScore(
                        new Money(1000.0d,
                                CurrencyHolder.getCurrencyByName("RUR").getName()
                        ), null, 1, this.debetScore);
    }

    public CurrentScore getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(CurrentScore currentScore) {
        this.currentScore = currentScore;
    }

    public DebitScore getDebetScore() {
        return debetScore;
    }

    public void setDebetScore(DebitScore debetScore) {
        this.debetScore = debetScore;
    }

    public CreditScore getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(CreditScore creditScore) {
        this.creditScore = creditScore;
    }
}

