import java.util.Scanner;
	
public class AcountLockExample {
	private static final String CORRECT_PASSWORD = "password123";
	private static final String SECURITY_QUESTION_ANSWER = "security123";
	private static final int MAX_ATTEMPTS = 3;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int attempts = 0;
		
		while (attempts < MAX_ATTEMPTS) {
			System.out.print("Enter password: ");
			String passwordAttempt = scanner.nextLine();
			
			if (passwordAttempt.equals(CORRECT_PASSWORD)) {
				System.out.println("Login successful!");
				break;
			}else {
				attempts++;
				System.out.println("Incorrect password. Attempts left: " + (MAX_ATTEMPTS - attempts));
				
				if (attempts == MAX_ATTEMPTS) {
					System.out.println("Too many incorrect attempts. ");
					System.out.println("Enter the security password.");
					System.out.print("Security password");
					String securityAnswerAttempt = scanner.nextLine();
					
					if (securityAnswerAttempt.equals(SECURITY_QUESTION_ANSWER)) {
						System.out.println("Security password correct. ");
					}else {
						System.out.println("Incorrect security password. Account remain locked.");
						break;
					}
				}
			}
		}
		
		scanner.close();
	}
}

/*  Output
Enter password: wrongPassword1
Incorrect password. Attempts left: 2
Enter password: wrongPassword2
Incorrect password. Attempts left: 1
Enter password: wrongPassword3
Incorrect password. Attempts left: 0
Too many incorrect attempts. 
Enter the security password.
Security passwordwrongSecurityPassword
Incorrect security password. Account remain locked.

Enter password: password123
Login successful!
 
Enter password: wrongPassword1
Incorrect password. Attempts left: 2
Enter password: wrongPassword2
Incorrect password. Attempts left: 1
Enter password: wrongPassword3
Incorrect password. Attempts left: 0
Too many incorrect attempts. 
Enter the security password.
Security passwordsecurity123
Security password correct. 

 */
