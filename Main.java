import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager expenseManager = new ExpenseManager();

        while (true) {
            System.out.println("\nExpense Tracker System");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. View Total Expenses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter expense description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter expense amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter expense category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter expense date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    expenseManager.addExpense(new Expense(description, amount, category, date));
                    System.out.println("Expense added successfully!");
                    break;
                case 2:
                    System.out.println("\nAll Expenses:");
                    for (Expense expense : expenseManager.getAllExpenses()) {
                        System.out.println(expense.getDescription() + " - $" + expense.getAmount() + " - " + expense.getCategory() + " - " + expense.getDate());
                    }
                    break;
                case 3:
                    System.out.println("\nTotal Expenses: $" + expenseManager.getTotalExpenses());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}