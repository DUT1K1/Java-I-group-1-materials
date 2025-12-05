public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789");
//        account.setPin(1234);
//        account.deposit(100);
//        account.withdraw(50);
//        account.deposit(190);
//        account.deposit(210);
//        account.withdraw(150);
//
//        BankAccount destinationAccount = new BankAccount("987654321");
//        account.transferMoney(destinationAccount, 100);
//
//        account.lockAccount();
//        account.withdraw(100);
//        account.deposit(1234);
//        account.unlockAccount();
//        account.withdraw(100);
//
//        account.printTransactions();

        System.out.println(account.calculateInterest(100000, 240));
    }
}
