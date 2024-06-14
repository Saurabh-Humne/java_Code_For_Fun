import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateTextFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter data to save in the text file (type 'exit' to stop): ");
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("data.xt"))){
			String input;
			while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
				writer.write(input);
				writer.newLine();
			}
			System.out.println("Data has been successfully saved to data.txt.");
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
