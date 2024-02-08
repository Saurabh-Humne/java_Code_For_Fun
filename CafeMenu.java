import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CafeMenu {
	
	public static void main(String[] args) {
	// Create a cafe menu
	Map<String, Double> menu = new HashMap<>();
	menu.put("Coffee", 150.00);
	menu.put("Tea", 50.00);
	menu.put("Sandwich", 200.00);
	menu.put("Cake", 250.00);
	
	// Display the menu
	System.out.println("Cafe Menu: ");
	for (Map.Entry<String, Double> entry : menu.entrySet()) {
		System.out.println(entry.getKey() + " - rupes" + entry.getValue());
	}
	
	// Select items and calculate the bill
	double totalBill = 0.0;
	Scanner scanner = new Scanner(System.in);
	boolean orderMore = true;
	
	while (orderMore) {
		System.out.print("Entry the item you want to order (or 'done' to finish): ");
		String selectedItem = scanner.nextLine().trim();
		
		if (selectedItem.equalsIgnoreCase("done")) {
			orderMore = false;
		} else if (menu.containsKey(selectedItem)) {
			totalBill += menu.get(selectedItem);
			System.out.println(selectedItem = " add to the Bill, Current total: " + totalBill + " rupes");
		} else {
			System.out.println("Invalid item. Please selec a valid item fromthe menu.");
		}
	}
	
	// Print the final bill
	System.out.println("Your total bill is : "+ totalBill + " rups");
	
	// Close the scanner
	scanner.close();
	}
}

/* Output

Cafe Menu: 
Sandwich - rupes200.0
Tea - rupes50.0
Cake - rupes250.0
Coffee - rupes150.0
Entry the item you want to order (or 'done' to finish): tea
Invalid item. Please selec a valid item fromthe menu.
Entry the item you want to order (or 'done' to finish): Tea
 add to the Bill, Current total: 50.0 rupes
Entry the item you want to order (or 'done' to finish): Tea
 add to the Bill, Current total: 100.0 rupes
Entry the item you want to order (or 'done' to finish): Cake
 add to the Bill, Current total: 350.0 rupes
Entry the item you want to order (or 'done' to finish): done
Your total bill is : 350.0 rups

*/
