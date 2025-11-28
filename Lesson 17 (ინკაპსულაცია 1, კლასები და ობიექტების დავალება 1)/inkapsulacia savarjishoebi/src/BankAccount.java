import java.util.Scanner;

public class BankAccount {
    private final String accountNumber;
    private int pin;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount >= 0 && amount <= 10_000) {
            balance += amount;
        } else {
            System.out.println("Amount must be positive and less than 10,000");
        }
    }

    public void withdraw(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        int pin = scanner.nextInt();
        scanner.close();

        if (this.pin == pin) {
            if (amount >= 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful: $" + amount);
            } else {
                System.out.println("Invalid amount.");
            }
        } else {
            System.out.println("Incorrect PIN");
        }
    }
}
