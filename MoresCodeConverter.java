import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MoresCodeConverter {
	private static final Map<Character, String> charToMorse = new HashMap<>();
	private static final Map<String, Character> morseToChar = new HashMap<>();
	
	static {
		// define Morse code mapping
		charToMorse.put('A', ".-");
		charToMorse.put('B', "-...");
		charToMorse.put('C', "-.-.");
		charToMorse.put('D', "-..");
		charToMorse.put('E', ".");
		charToMorse.put('F', "..-.");
		charToMorse.put('G', "--.");
		charToMorse.put('H', "....");
		charToMorse.put('I', "..");
		charToMorse.put('J', ".---");
		charToMorse.put('K', "-.-");
		charToMorse.put('L', ".-..");
		charToMorse.put('M', "--");
		charToMorse.put('N', "-.");
		charToMorse.put('O', "---");
		charToMorse.put('P', ".--.");
		charToMorse.put('Q', "--.-");
		charToMorse.put('R', ".-.");
		charToMorse.put('S', "...");
		charToMorse.put('T', "-");
		charToMorse.put('U', "..-");
		charToMorse.put('V', "...-");
		charToMorse.put('W', ".--");
		charToMorse.put('X', "-..-");
		charToMorse.put('Y', "-.--");
		charToMorse.put('Z', "--..");
		charToMorse.put(' ', " "); // space
		
		// Populate reverse mapping
		for (Map.Entry<Character, String> entry : charToMorse.entrySet()) {
			morseToChar.put(entry.getValue(), entry.getKey());
		}
	}
	
	public static String textToMorse(String text) {
		text = text.toUpperCase();
		StringBuilder morseCode = new StringBuilder();
		for (char c : text.toCharArray()) {
			morseCode.append(charToMorse.getOrDefault(c, ""));
			morseCode.append(" "); // Add space between letters
		}
		return morseCode.toString().trim();
	}
	
	public static String morseToText(String morseCode) {
		StringBuilder text = new StringBuilder();
		String[] words = morseCode.split("\\s{3,}"); // Split by three consecutive spaces
		for (String word : words) {
			String[] letters = word.split("\\s{1,}");
			for (String letter : letters) {
				text.append(morseToChar.getOrDefault(letter,  ' '));
			}
			text.append(" "); //add space between words
		}
		return text.toString().trim();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// get user input
		System.out.print("Enter a sentence or Morse code: ");
		String userInput = scanner.nextLine();
		
		// Determine whether the input is a sentence or Morse code
		if (userInput.matches("^[-.\\s]+$")) {
			// Input is Morse code
			String textResult = morseToText(userInput);
			System.out.println("Converted to Morse Code: "+ textResult);
		} else {
			// Input is a sentence
			String morseResult = textToMorse(userInput);
			System.out.println("Converted to Morse code: " + morseResult);
		}
		
		scanner.close();
	}
}

/* 
 Enter a sentence or Morse code: .... . .-.. .-.. ---    .-- --- .-. .-.. -..
Converted to Morse Code: HELLO WORLD
*/
