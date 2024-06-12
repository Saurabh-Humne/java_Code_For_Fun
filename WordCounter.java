import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {

	public static Map<String, Integer> countWords(String text){
		String[] words = text.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");
		
		Map<String, Integer> wordCount = new HashMap<>();
		for (String word : words) {
			if(word.length() > 0) {
				wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
			}
		}
		
		return wordCount;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a text: ");
		String text = scanner.nextLine();
		
		Map<String, Integer> wordCount = countWords(text);
		
		System.out.println("Word Count: ");
		for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println(entry.getKey() + ": "+ entry.getValue());
		}
		
		scanner.close();
	}
}
