import java.util.Random;

public class RefreshingTriangle {
	public static void main(String[] args) throws InterruptedException {
		while (true) {
			printRandomTriangle();
			Thread.sleep(10000); // Sleep for 10 seconds
			clearConsole();
		}
	}
	
	private static void printRandomTriangle() {
		int height = 5; // You can adjust the height ofthe triangle
		Random random = new Random();
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i; j++) {
				System.out.print(" "); // Print space for indentation
			}
			
			char symbol = getRandomSymbol();
			for(int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(symbol);
			}
			
			System.out.println(); // Move to the next line after each row
		}
	}
	
	private static char getRandomSymbol(){
		char[] symbols = {'*', '#', '@', '$', '&', '!', '%'};
		Random random = new Random();
		return symbols[random.nextInt(symbols.length)];
	}
	
	private static void clearConsole() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
