public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789");
        account.deposit(100);
        System.out.println( account.getBalance());
        account.setPin(1234);
        account.withdraw(50);
        System.out.println( account.getBalance());
    }
}
