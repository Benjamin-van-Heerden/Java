package Bank;

class BankDemo {
    public static void main(String[] args) {
        // the only difference between savings and checking is in this case the interest rate
        SavingsAccount aliceSave = new SavingsAccount("Alice", 100);
        CheckingAccount bobCheck = new CheckingAccount("Bob", 100);

        System.out.println("Alice:");
        System.out.println(aliceSave.money);
        System.out.println(aliceSave.moneyWithInterest());

        System.out.println("Bob:");
        System.out.println(bobCheck.money);
        System.out.println(bobCheck.moneyWithInterest());
    }
}
