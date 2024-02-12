import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInputToFile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter text to write to file (Type 'exit' to finish);");
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"))){
			String userInput;
			while (!(userInput = scanner.nextLine()).equalsIgnoreCase("exit")) {
				writer.write(userInput);
				writer.newLine();
			}
			
			System.out.println("Take writer to file successfully.");
		}catch (IOException e) {
			System.out.println("Error writer to file: " + e.getMessage());
		} finally {
			scanner.close();
		}
		
		System.out.println(new File("output.txt").getAbsolutePath());
	}
}
