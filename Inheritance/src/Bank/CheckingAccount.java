package Bank;

class CheckingAccount extends Account {
    CheckingAccount(String name, double m) {
        this.setAccountHolder(name);
        this.setMoney(m);
        this.setInterestRate(0.05);
    }
}
