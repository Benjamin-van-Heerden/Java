package Bank;

class SavingsAccount extends Account {
    SavingsAccount(String name, double m) {
        this.setAccountHolder(name);
        this.setMoney(m);
        this.setInterestRate(0.1);
    }
}
