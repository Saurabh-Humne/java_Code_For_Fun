import java.util.Scanner;

public class PurchaseSystem {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input item details
		System.out.print("Enter the item name: ");
		String itemName = scanner.nextLine();
		
		System.out.print("enter the quantity: ");
		int quantity = scanner.nextInt();
		
		System.out.print("Enter the price per item: rupe");
		double pricePerItem = scanner.nextDouble();
		
		// Calculate total price with 5% tax
		double totalPrice = calculateTotalPrice(quantity, pricePerItem);
		
		// display the purchase details
		System.out.println("\nPurchese Details:");
		System.out.println("Item: "+ itemName);
		System.out.println("Quantity: "+ quantity);
		System.out.println("Price per item: rups " + pricePerItem);
		System.out.println("Tax (5%): rups "+ calculateTax(quantity, pricePerItem));
		System.out.println("Total Price: rups "+ totalPrice);
		
		scanner.close();
	}
	
	// Method to calculate tax
	private static double calculateTax(int quantity, double pricePerItem) {
		return 0.05 * quantity * pricePerItem;
	}
	
	// Method to calculate total price with tax
	private static double calculateTotalPrice(int quantity, double pricePerItem) {
		return quantity * pricePerItem + calculateTax(quantity, pricePerItem);
	}
}

/* Output
Enter the item name: watch
enter the quantity: 2
Enter the price per item: rupe1095

Purchese Details:
Item: watch
Quantity: 2
Price per item: rups 1095.0
Tax (5%): rups 109.5
Total Price: rups 2299.5
*/
