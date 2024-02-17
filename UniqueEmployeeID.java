import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueEmployeeID {
	
	public static void main(String[] args) {
		Set<String> employeeIDs = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter employee ID (or 'exit' to quit): ");
			String input = scanner.nextLine();
			
			if (input.equalsIgnoreCase("exit")) {
				System.out.println("Exiting program.");
				break;
			}
			
			if (isValidEmployeeID(input, employeeIDs)) {
				employeeIDs.add(input);
				System.out.println("Employee ID '"+ input + "' created successfully.");
			} else {
				System.out.println(" Employee ID '"+ input + "' already exits. Please choose a different one.");
			}
		}
		
		scanner.close();
	}
	
	private static boolean isValidEmployeeID(String employeeID, Set<String> exitingIDs) {
		return !exitingIDs.contains(employeeID);
	}
}
