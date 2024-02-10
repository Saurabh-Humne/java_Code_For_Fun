import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChecklistApp {
	private Map<String, Boolean> checklist;
	
	public ChecklistApp() {
		checklist = new HashMap<>();
	}
	
	public void addItem(String item) {
		checklist.put(item, false);
		System.out.println("Item add: "+ item);
	}
	
	public void markAsDone(String item) {
		if (checklist.containsKey(item)) {
			checklist.put(item,  true);
			System.out.println("Marked as done: " + item);
		} else {
			System.out.println("Item not found in the ckecklist.");
		}
	}
	
	public void displayChecklist() {
		System.out.println("Current checklist: ");
		
		if (checklist.isEmpty()) {
			System.out.println("No item in the checklist.");
		} else {
			for (Map.Entry<String, Boolean> entry : checklist.entrySet()) {
				String item = entry.getKey();
				boolean isDone = entry.getValue();
				String status = isDone ? "[Done]" : "[Pending]";
				System.out.println(item + " " + status);
			}
		}
	}
	
	public static void main(String[] args) {
		ChecklistApp checklistApp = new ChecklistApp();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n--- Checklist App ---");
			System.out.println("1. add Item");
			System.out.println("2. Mark as Done");
			System.out.println("3. Display checklist");
			System.out.println("4. Exit");
			System.out.print("Enter your choide (1-4):");
			
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character
			
			switch (choice) {
			case 1:
				System.out.print("Enter item to add: ");
				String addItem = scanner.nextLine();
				checklistApp.addItem(addItem);
				break;
			case 2:
				System.out.print("Enter item to mark as done: ");
				String markAsDoneItem = scanner.nextLine();
				checklistApp.markAsDone(markAsDoneItem);
				break;
			case 3:
				checklistApp.displayChecklist();
				break;
			case 4:
				System.out.println("Exiting Checklist ap. Goodbye!");
				System.exit(0);
			default:
				System.out.println("Invalid choce. Please enter a number between1 and 4.");
			}
		}
	}
}

/*


--- Checklist App ---
1. add Item
2. Mark as Done
3. Display checklist
4. Exit
Enter your choide (1-4):1
Enter item to add: 1.read a book
Item add: 1.read a book

--- Checklist App ---
1. add Item
2. Mark as Done
3. Display checklist
4. Exit
Enter your choide (1-4):1
Enter item to add: 2. Write a book
Item add: 2. Write a book

--- Checklist App ---
1. add Item
2. Mark as Done
3. Display checklist
4. Exit
Enter your choide (1-4):3
Current checklist: 
1.read a book [Pending]
2. Write a book [Pending]

--- Checklist App ---
1. add Item
2. Mark as Done
3. Display checklist
4. Exit
Enter your choide (1-4):2
Enter item to mark as done: 1.read a book
Marked as done: 1.read a book

--- Checklist App ---
1. add Item
2. Mark as Done
3. Display checklist
4. Exit
Enter your choide (1-4):3
Current checklist: 
1.read a book [Done]
2. Write a book [Pending]

--- Checklist App ---
1. add Item
2. Mark as Done
3. Display checklist
4. Exit
Enter your choide (1-4):4
Exiting Checklist ap. Goodbye!

*/
