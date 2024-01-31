import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookList {
	
	public static void main(String[] arrgs) {
		List<String> booksToRead = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		// Add Books To the list
		addBooks(booksToRead, scanner);
		
		// Display the list of books
		displayBooks(booksToRead);
		
		scanner.close();
	}
	
	private static void addBooks(List<String> booksToRead, Scanner scanner) {
		System.out.println("Enter the books to add to the list (type 'done' to finish): ");
		String bookTitle;
		
		do {
			System.out.print("Book title: ");
			bookTitle = scanner.nextLine();
			
			if (!bookTitle.equalsIgnoreCase("done") && !bookTitle.isEmpty()) {
				booksToRead.add(bookTitle);
			}
			
		} while (!bookTitle.equalsIgnoreCase("done"));
	}
	
	private static void displayBooks(List<String> booksToRead) {
		System.out.println("\nBooks to Read: ");
		for (int i = 0; i < booksToRead.size(); i++) {
			System.out.println((i+1) + ". " + booksToRead.get(i));
		}
	}
}

/* Output

Enter the books to add to the list (type 'done' to finish): 
Book title: think and grow rich
Book title: sapiens
Book title: done

Books to Read: 
1. think and grow rich
2. sapiens

 */
