import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Store {
	private Map<String, Integer> productInventory;
	
	public Store() {
		this.productInventory = new HashMap<>();
	}
	
	public void addProduct(String productName, int quantity) {
		productInventory.put(productName,  productInventory.getOrDefault(productName, 0) + quantity);
		System.out.println(quantity + " units of" + productName + " added to the sock: "+ productInventory.get(productName));
	}
	
	public void reduceProduct(String productName, int quantity) {
		if (productInventory.containsKey(productName)) {
			int currentStock = productInventory.get(productName);
			if (currentStock >= quantity){
				productInventory.put(productName, currentStock - quantity);
				System.out.println(quantity + " units of "+ productName+ " remove from the store. current stock : " + productInventory.get(productName));
			} else {
				System.out.println(" Insufficient stock for "+ productName+ ". Available stock: " + currentStock);
			}
		} else {
			System.out.println("Product " + productName + " not found in the store.");
		}
	}
	
	public void displayInventory() {
		System.out.println("\nCurrent Inventory: ");
		for (Map.Entry<String, Integer> entry : productInventory.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println();
	}
	
}

public class StoreManagement {
	public static void main(String[] args) {
		Store store = new Store();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Choose an option:");
			System.out.println("1. Add product to store");
			System.out.println("2. reduce product from store");
			System.out.println("3. Display current inventory");
			System.out.println("4. Exit");
			
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newLine
			
			switch (choice) {
			case 1:
				System.out.print("Enter product name: ");
				String addProductName = scanner.nextLine();
				System.out.print("enter quantity to add: ");
				int addQuantity = scanner.nextInt();
				store.addProduct(addProductName, addQuantity);
				break;
			case 2:
				System.out.print("Enter product name: ");
				String reduceProductName = scanner.nextLine();
				System.out.print("Enter quantity to reduce: ");
				int reduceQuantity = scanner.nextInt();
				store.reduceProduct(reduceProductName,  reduceQuantity);
				break;
			case 3:
				store.displayInventory();
				break;
			case 4:
				System.out.println("Exiting program. Goodbye!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}
}

/*

Choose an option:
1. Add product to store
2. reduce product from store
3. Display current inventory
4. Exit
1
Enter product name: pen
enter quantity to add: 20
20 units ofpen added to the sock: 20
Choose an option:
1. Add product to store
2. reduce product from store
3. Display current inventory
4. Exit
1
Enter product name: tape
enter quantity to add: 10
10 units oftape added to the sock: 10
Choose an option:
1. Add product to store
2. reduce product from store
3. Display current inventory
4. Exit
2
Enter product name: pen
Enter quantity to reduce: 10
10 units of pen remove from the store. current stock : 10
Choose an option:
1. Add product to store
2. reduce product from store
3. Display current inventory
4. Exit
3

Current Inventory: 
tape: 10
pen: 10

Choose an option:
1. Add product to store
2. reduce product from store
3. Display current inventory
4. Exit
4
Exiting program. Goodbye!

*/
