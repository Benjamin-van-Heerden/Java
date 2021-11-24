package Bank;

abstract public class Account {
    String accountHolder;
    double money;
    double interestRate;

    double moneyWithInterest() {
        return money * (interestRate + 1);
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
}
