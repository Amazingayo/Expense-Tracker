package expensetracker;

import java.util.ArrayList;
import java.util.Scanner;

public class expensetracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> expenses = new ArrayList<>();
        ArrayList<Double> amounts = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n AMAZINGAYO'SEXPENSE TRACKER ");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Total Spending");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.print("Enter expense name: ");
                String name = input.nextLine();

                System.out.print("Enter amount: N");
                double amount = input.nextDouble();
                input.nextLine();

                if (amount > 0) {
                    expenses.add(name);
                    amounts.add(amount);

                    System.out.println("Expense added successfully!");
                } else {
                    System.out.println("Amount must be greater than zero.");
                }

            } else if (choice == 2) {
                if (expenses.isEmpty()) {
                    System.out.println("No expenses recorded yet.");
                } else {
                    System.out.println("\n YOUR EXPENSES ");

                    for (int i = 0; i < expenses.size(); i++) {
                        System.out.println(
                                (i + 1) + ". " + expenses.get(i)
                                        + " - N" + amounts.get(i));
                    }
                }

            } else if (choice == 3) {
                double total = 0;

                for (double amount : amounts) {
                    total += amount;
                }

                System.out.println("Total spending: N" + total);

            } else if (choice == 4) {
                System.out.println("Thank you for using Amazingayo's Expense Tracker!");

            } else {
                System.out.println("Invalid option. Please try again.");
            }

        } while (choice != 4);

        input.close();
    }
}