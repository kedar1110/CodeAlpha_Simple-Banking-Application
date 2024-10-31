import java.util.Scanner;

public class BankingApplication {
    private static double balance = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Welcome to the Simple Banking Application!");

        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit(scanner);
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the Simple Banking Application!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    private static void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}