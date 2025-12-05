import java.util.Scanner;

public class BankAccount {
    private final String accountNumber;
    private int pin;
    private double balance;
    private String[] transactions = new String[1000];
    private int transactionIndex = 0;
    private Scanner scanner = new Scanner(System.in);
    private boolean isAccountLocked = false;

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

    public void lockAccount() {
        isAccountLocked = true;
    }

    public void unlockAccount() {
        isAccountLocked = false;
    }

    public void deposit(double amount) {
        if (!isAccountLocked) {
            if (amount >= 0 && amount <= 10_000) {
                balance += amount;
                transactions[transactionIndex++] = "Deposit: $" + amount;
                System.out.println("Deposit successful: $" + amount);
            } else {
                System.out.println("Amount must be positive and less than 10,000");
            }
        } else {
            System.out.println("Account is locked");
        }
    }

    public void withdraw(double amount) {
        if (!isAccountLocked) {
            System.out.print("Enter PIN: ");
            int pin = scanner.nextInt();

            if (this.pin == pin) {
                if (amount >= 0 && amount <= balance) {
                    balance -= amount;
                    transactions[transactionIndex++] = "Withdrawal: $" + amount;
                    System.out.println("Withdrawal successful: $" + amount);
                } else {
                    System.out.println("Invalid amount.");
                }
            } else {
                System.out.println("Incorrect PIN");
            }
        } else {
            System.out.println("Account is locked");
        }
    }

    public void transferMoney(BankAccount destinationAccount, double amount) {
        if (!isAccountLocked) {
            System.out.print("Enter PIN: ");
            int pin = scanner.nextInt();

            if (this.pin == pin) {
                if (amount >= 0 && amount <= 1000 && amount <= balance) {
                    this.balance -= amount;
                    destinationAccount.deposit(amount);
                    transactions[transactionIndex++] = "Transfer: $" + amount;
                } else {
                    System.out.println("Invalid amount.");
                }
            } else {
                System.out.println("Incorrect PIN");
            }
        } else {
            System.out.println("Account is locked");
        }
    }

    public void printTransactions() {
        for (String transaction : transactions) {
            if (transaction == null) break;
            System.out.println(transaction);
        }
    }

    public double calculateInterest(double amount, int months) {
        double interest = Math.pow(1.01, months);
        return amount * interest;
    }
}
