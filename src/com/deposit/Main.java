package com.deposit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose deposit type:");
        System.out.println("1: Loan Deposit");
        System.out.println("2: Long-Term Deposit");
        System.out.println("3: Short-Term Deposit");
        int choice = scanner.nextInt();

        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();

        Deposit deposit = null;
        switch (choice) {
            case 1:
                deposit = new LoanDeposit(amount);
                break;
            case 2:
                deposit = new LongTermDeposit(amount);
                break;
            case 3:
                deposit = new ShortTermDeposit(amount);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        if (deposit != null) {
            System.out.println("Deposit amount: " + deposit.getAmount());
            System.out.println("Calculated profit: " + deposit.calculateProfit());
        }
    }
}
