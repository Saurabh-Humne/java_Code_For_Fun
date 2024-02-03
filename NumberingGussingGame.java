import java.util.Random;
import java.util.Scanner;

public class NumberingGuessingGame {

	public static void main(String[] args) {
		// Generate a random number between 1 and 100
		Random random = new Random();
		int randomNumber = random.nextInt(100) +1;
		
		// Initialize varibles
		int userGuess;
		int attempts = 0;
		boolean hasGuessedCorrectly = false;
		
		// Create Scanner object for user input
		Scanner scanner = new Scanner(System.in);
		
		// Game loop
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("Try to guess the number between 1 and 100.");
		
		while (!hasGuessedCorrectly) {
			System.out.print("Enter your guess: ");
			
			while (!scanner.hasNextInt()) {
				System.out.println("Invalid input. Please enter a valid number.");
				scanner.next(); // Consume the invalid input
			}
			
			userGuess = scanner.nextInt();
			attempts++;
			
			// Check the user's guess
			if (userGuess == randomNumber) {
				hasGuessedCorrectly = true;
				System.out.println("Congratulation! you guessed the correct number in "+ attempts + " attempts.");
			} else if (userGuess < randomNumber) {
				System.out.println("Too low. try again!");
			} else {
				System.out.println("Too high. Try again!");
			}
		}
		
		// Close the scanner
		scanner.close();
	}
}

/* Output

Welcome to the Number Guessing Game!
Try to guess the number between 1 and 100.
Enter your guess: 50
Too low. try again!
Enter your guess: 80
Too low. try again!
Enter your guess: 100
Too high. Try again!
Enter your guess: 90
Too low. try again!
Enter your guess: 95
Too low. try again!
Enter your guess: 97
Too low. try again!
Enter your guess: 99
Too high. Try again!
Enter your guess: 98
Congratulation! you guessed the correct number in 8 attempts.

*/
