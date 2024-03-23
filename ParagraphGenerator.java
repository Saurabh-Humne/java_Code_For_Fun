import java.util.Random;

public class ParagraphGenerator {
	
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	private static final int MIN_WORD_LENGTH = 3;
	private static final int MAX_WORD_LENGTH = 10;
	private static final int MIN_SENTENCE_LENGTH = 5;
	private static final int MAX_SENTENCE_LENGTH = 15;
	private static final int NUM_SENTENCES = 5;
	
	public static void main(String[] args) {
		Random random = new Random();
		StringBuilder paragraph = new StringBuilder();
		
		for (int i = 0; i < NUM_SENTENCES; i++) {
			int sentenceLength = random.nextInt(MAX_SENTENCE_LENGTH - MIN_SENTENCE_LENGTH + 1) + MIN_SENTENCE_LENGTH;
			paragraph.append(generateSentence(random, sentenceLength)).append(" ");
		}
		
		System.out.println("random Paragraph:");
		System.out.println(paragraph.toString());
	}
	
	public static String generateSentence(Random random, int length) {
		StringBuilder sentence = new StringBuilder();
		
		for (int i =0; i < length; i++) {
			int wordLength = random.nextInt(MAX_WORD_LENGTH  - MIN_WORD_LENGTH + 1) + MIN_WORD_LENGTH;
			sentence.append(generateWord(random, wordLength)).append(" ");
		}
		
		return sentence.toString().trim() + ".";
	}
	
	public static String generateWord(Random random, int length) {
		StringBuilder word = new StringBuilder();
		
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(ALPHABET.length());
			char letter = ALPHABET.charAt(index);
			word.append(letter);
		}
		
		return word.toString();
	}
}
