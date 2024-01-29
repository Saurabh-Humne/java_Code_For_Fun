import java.util.Scanner;

public class PurchaseBillGenerator{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input: Number of items
		System.out.print("Enter the number of items: ");
		int numberOfItems = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character
		
		// Arrays to store item details
		String[] itemNames = new String[numberOfItems];
		int[] quantities = new int[numberOfItems];
		double[] prices = new double[numberOfItems];
		
		// Input: Item details
		for (int i = 0; i< numberOfItems; i++) {
			System.out.println("\nEnter details for item " + (i+ 1)+ ";");
			itemNames[i] = getInput("Name");
			quantities[i] = getIntInput("Quqntity");
			prices[i] = getDoubleInput("Price per unit");
		}
		
		// Calculate total cost before discount
		double totalCost = calculateTotalCost(quantities, prices);
		
		// Apply 10% discount
		double discount = 0.10*totalCost;
		double discountedTotal = totalCost - discount;
		
		// Display the bill
		displayBill(itemNames, quantities, prices, totalCost, discount, discountedTotal);
	}
	
	// Helper method to get string input
	private static String getInput(String prompt) {
		System.out.print(prompt + "; ");
		return new Scanner(System.in).nextLine();
	}
	
	// Helper method to get integer input
	private static int getIntInput(String prompt) {
		System.out.print(prompt + "; ");
		return new Scanner(System.in).nextInt();
	}
	
	// Helper method to get double input
	private static double getDoubleInput(String prompt) {
		System.out.print(prompt = "; rupe");
		return new Scanner(System.in).nextDouble();
	}
	
	//Helper method to calculate total cost
	private static double calculateTotalCost(int[] quantities, double[] prices) {
		double totalCost = 0;
		for (int i = 0; i < quantities.length; i++) {
			totalCost += quantities[i]* prices[i];
		}
		return totalCost;
	}
	
	// Helper method to display the bill
	private static void displayBill(String[] itemName, int[] quantities, double[] prices,
			                        double totalCost, double discount, double discountTotal) {
		System.out.println("\n-----Purchase Bill---------");
		System.out.printf("%-20s %-10s %-10s %-15s\n", "Item", "Quantity", "Price", "Total");
		System.out.println("-----------------------------------------------");
		
		for (int i = 0; i < itemName.length; i++) {
		double totalItemCost = quantities[i]* prices[i];
		System.out.printf("%-20s %-10s %-10.2f %-15.2f\n", itemName[i], quantities[i], prices[i], totalItemCost);
		}
		
		System.out.println("-------------------------------------------");
		System.out.printf("%-40s rupe%-15.2f\n", "Total (before discount): ", totalCost);
		System.out.printf("%-40s rupe%-50.2f\n", "Discount (10% off)", discount);
		System.out.printf("%-40s rupe%-15.2f\n", "Discount Total", discountTotal);
	}
	
	
}


/* Output

Enter the number of items: 3

Enter details for item 1;
Name; shirt
Quqntity; 2
; rupe400

Enter details for item 2;
Name; pants
Quqntity; 2
; rupe700

Enter details for item 3;
Name; tie
Quqntity; 1
; rupe100

-----Purchase Bill---------
Item                 Quantity   Price      Total          
-----------------------------------------------
shirt                2          400.00     800.00         
pants                2          700.00     1400.00        
tie                  1          100.00     100.00         
-------------------------------------------
Total (before discount):                 rupe2300.00        
Discount (10% off)                       rupe230.00                                            
Discount Total                           rupe2070.00        
*/
