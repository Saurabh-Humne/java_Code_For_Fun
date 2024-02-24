import java.util.Random;

public class CoinTossSimulation {
	
	public static void main(String[] args) {
		// Simulate a coin toss
		String result = simulateCoinToss();
		
		// Display the result
		System.out.println("Coin toss Result: "+ result);
	}
	
	private static String simulateCoinToss() {
		// Create a Random object
		Random random = new Random();
		
		// Generate a random number between 0 and 1
		double randomValue = random.nextDouble();
		
		// Use probability to determine the outcome
		if (randomValue < 0.5) {
			return "Heads";
		} else {
			return "Tails";
		}
	}
}
