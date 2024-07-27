import java.util.Arrays;
import java.util.Scanner;

public class Train {

	private final Scanner kbScanner;
	
	public Train() {
		kbScanner = new Scanner(System.in);
	}
	
	public void process() {
		intro();
		boolean gameOver = false;
		
		do {
			double carMph = (int) (25 * Math.random() + 40);
			double hours = (int) (15 * Math.random() + 5);
			double train = (int) (19 * Math.random() + 20);
			
			System.out.println(" A CAR TRAVELING " + (int) carMph + "MPH CAN MAKE A CERTAIN TRIP IN");
			System.out.println((int) hours + " HOURS LESS THAN A TRAIN TRAVELING AT "+ (int) train + " MPH.");
			
			double howLong = Double.parseDouble(displayTextAndGetInput("HOW LONG DOES THE TRIP TAKE BY CAR? "));
			
			double hoursAnswer = hours * train / (carMph - train);
			int percentage = (int) (Math.abs((hoursAnswer - howLong) * 100 / howLong) + .5);
			if (percentage > 5) {
				System.out.println("SORRY. YOU WERE OFF BY " + percentage + " PERCENT.");
			} else {
				System.out.println("GOOD! ANSWER WITHIN " + percentage + " PERCENT.");
			}
			System.out.println("CORRECT ANSWER IS " + hoursAnswer + " HOURS.");
			
			System.out.println();
			if (!yesEntered(displayTextAndGetInput("ANOTHER PROBLEM (YES OR NO)? "))) {
				gameOver = true;
			}
		}while (!gameOver);
	}
	
	public void intro() {
		System.out.println("TRAIN");
		System.out.println("CREATIVE COMPUTING MORRISTOWN, NEW JERSEY");
		System.out.println();
		System.out.println("TIME - SPEED DISTANCE EERCISE");
		System.out.println();
	}
	
	private String displayTextAndGetInput(String text) {
		System.out.print(text);
		return kbScanner.next();
	}
	
	private boolean yesEntered(String text) {
		return stringIsAnyValue(text, "Y", "YES");
	}
	
	private boolean stringIsAnyValue(String text, String... value) {
		return Arrays.stream(value).anyMatch(str -> str.equalsIgnoreCase(text));
	}
	
	public static void main(String[] args) {
		Train train = new Train();
		train.process();
	}
	
}
