import java.util.Scanner;

class BankAccount {
    private String ownerName;
    private double balance;
    private String accountType;

    // Constructor
    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        this.balance = 0.0;
        this.accountType = "Savings"; // default type
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₦" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₦" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Get account type
    public String getAccountType() {
        return accountType;
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account;

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        account = new BankAccount(name);
        System.out.println("Account created successfully.");

        int choice;

        do {
            System.out.println("\n--- MINI BANK MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Show Account Type");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(scanner.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(scanner.nextDouble());
                    break;

                case 3:
                    System.out.println("Current Balance: ₦" + account.getBalance());
                    break;

                case 4:
                    System.out.println("Account Type: " + account.getAccountType());
                    break;

                case 5:
                    System.out.println("Thank you for using Mini Bank.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 5);

        scanner.close();
    }
}