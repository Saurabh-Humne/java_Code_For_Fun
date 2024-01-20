import java.util.Random;

public class RandomPasswordGenerator {

	public static void main(String[] args) {
		String password = generateRandomPassword();
		System.out.println("Random 8-digit Password: "+ password);
	}
	
	public static String generateRandomPassword() {
		
		int passwordLength = 8;
		
		String allowedCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		
		StringBuilder password = new StringBuilder();
		
		Random random = new Random();
		
		for (int i = 0; i< passwordLength; i++) {
			int randomIndex = random.nextInt(allowedCharacters.length());
			char randomChar = allowedCharacters.charAt(randomIndex);
			password.append(randomChar);
		}
		
		return password.toString();
	}
}
