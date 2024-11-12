package java_Pratice_25Oct2024;

import java.util.Scanner;

class ATMMachine {
    private float balance = 0;
    private final int PIN = 5674;
    private Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.print("Enter your PIN: ");
            if (sc.nextInt() == PIN) {
                menu();
                return;
            } else {
                System.out.println("Invalid PIN. Try again.");
            }
        }
    }

    private void menu() {
        while (true) {
            System.out.println("\n1. Check Balance\n2. Withdraw Money\n3. Deposit Money\n4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Current balance: " + balance);
                case 2 -> withdraw();
                case 3 -> deposit();
                case 4 -> {
                    System.out.println("Thank you for using the ATM.");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        float amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Money withdrawn successfully.");
        }
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        balance += sc.nextFloat();
        System.out.println("Money deposited successfully.");
    }

    public static void main(String[] args) {
        new ATMMachine().start();  // Start the ATM machine
    }
}
