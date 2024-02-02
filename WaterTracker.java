import java.util.Scanner;

public class WaterTracker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double totalWaterConsumed = 0;
	
		System.out.println("welcome to the water Tracker!");
		
		while (true) {
			System.out.print("Enter the amount of water you drink (in liters) or type 'exit' to finish: ");
			String input = scanner.nextLine();
			
			if (input.equalsIgnoreCase("exit")) {
				break;
			}
			
			try {
				double amount = Double.parseDouble(input);
				if (amount >=0) {
					totalWaterConsumed += amount;
					System.out.println("Added "+ amount + "liters/ Total water consumed: "+ totalWaterConsumed+ " liters.");
				}  else {
					System.out.println("Please enter a valid number for the amount of water.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid number or 'exit' to finish");
			}
		}
		
		System.out.println("You finished tracking for the day. Total water consumed; " + totalWaterConsumed + "liters.");
		scanner.close();
	}
}


/* Output
welcome to the water Tracker!
Enter the amount of water you drink (in liters) or type 'exit' to finish: 1
Added 1.0liters/ Total water consumed: 1.0 liters.
Enter the amount of water you drink (in liters) or type 'exit' to finish: 2
Added 2.0liters/ Total water consumed: 3.0 liters.
Enter the amount of water you drink (in liters) or type 'exit' to finish: 1
Added 1.0liters/ Total water consumed: 4.0 liters.
Enter the amount of water you drink (in liters) or type 'exit' to finish: exit
You finished tracking for the day. Total water consumed; 4.0liters.
*/
