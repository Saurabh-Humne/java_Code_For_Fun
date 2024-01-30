import java.util.Scanner;

public class PatternDrawer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter a character to draw the pattern (type 'exit'to quit): ");
			String userInput = scanner.nextLine();
			
			if (userInput.equalsIgnoreCase("exit")) {
				System.out.println("Exiting the program. goodbye!");
				break;
			}
			
			if (userInput.length() != 1) {
				System.out.println("Please enter a single character.");
			} else {
				drawPattern(userInput.charAt(0));
			}
		}
		
		scanner.close();
	}
	
	private static void drawPattern(char character) {
		// Your pattern drawing logic goes here
		for(int i=1; i<=5; i++) {
			for(int j=1; j <= i; j++) {
				System.out.print(character + " ");
			}
			System.out.println();
		}
	}
}
