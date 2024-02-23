import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transfer(BankAccount receiver, double amount) {
        if (withdraw(amount)) {
            receiver.deposit(amount);
            return true;
        }
        return false;
    }
}

public class FundTransferExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two bank accounts for demonstration
        BankAccount senderAccount = new BankAccount("123456", 1000.0);
        BankAccount receiverAccount = new BankAccount("789012", 500.0);

        System.out.println("Sender Account Balance: rupe" + senderAccount.getBalance());
        System.out.println("Receiver Account Balance: rupe" + receiverAccount.getBalance());

        // Input the amount to transfer
        System.out.print("Enter the amount to transfer: rupe");
        double transferAmount = scanner.nextDouble();

        // Perform the fund transfer
        if (senderAccount.transfer(receiverAccount, transferAmount)) {
            System.out.println("Fund transfer successful!");
            System.out.println("Sender Account Balance: rupe" + senderAccount.getBalance());
            System.out.println("Receiver Account Balance: rupe" + receiverAccount.getBalance());
        } else {
            System.out.println("Fund transfer failed. Insufficient balance or invalid amount.");
        }

        scanner.close();
    }
}
