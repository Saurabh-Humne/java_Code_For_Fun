import java.util.Scanner;

public class BudgetTracker {
	private double budget;
	private double expenses;
	
	public BudgetTracker(double initialBudget) {
		this.budget = initialBudget;
		this.expenses = 0;
	}
	
	public void addExpense(double amount) {
		if (amount > 0) {
			expenses += amount;
			System.out.println("Expense added: rupe" + amount);
		} else {
			System.out.println("Invalid expense amount.");
		}
	}
	
	public double getRemainingBudget() {
		return budget - expenses;
	}
	
	public void displayBudgetSummary() {
		System.out.println("\n--- Buget Summary ---");
		System.out.println("Initial Budget: rupe" + budget);
		System.out.println("Total Experience: rupe" + expenses);
		System.out.println("Remaining Budget: rupe" + getRemainingBudget());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your initial budget: rupe");
		double initialBudget = scanner.nextDouble();
		
		BudgetTracker budgetTracker = new BudgetTracker(initialBudget);
		
		while (true) {
			System.out.println("\n--- Budget Tracking Menu ---");
			System.out.println("1. Add Expense");
			System.out.println("2. Display Budget Summary");
			System.out.println("3. Exit");
			System.out.print("Enter your choice (1-3): ");
			
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("Enter expense amount: rupe");
				double expenseAmount = scanner.nextDouble();
				budgetTracker.addExpense(expenseAmount);
				break;
			case 2:
				budgetTracker.displayBudgetSummary();
				break;
			case 3:
				System.out.println("Exiting Budget Tracker.");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 3.");
			}
		}
	} 
}

/* Output

Enter your initial budget: rupe100

--- Budget Tracking Menu ---
1. Add Expense
2. Display Budget Summary
3. Exit
Enter your choice (1-3): 1
Enter expense amount: rupe10
Expense added: rupe10.0

--- Budget Tracking Menu ---
1. Add Expense
2. Display Budget Summary
3. Exit
Enter your choice (1-3): 2

--- Buget Summary ---
Initial Budget: rupe100.0
Total Experience: rupe10.0
Remaining Budget: rupe90.0

--- Budget Tracking Menu ---
1. Add Expense
2. Display Budget Summary
3. Exit
Enter your choice (1-3): 3
Exiting Budget Tracker.

*/
