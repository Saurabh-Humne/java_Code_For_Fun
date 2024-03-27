import java.util.ArrayList;
import java.util.Scanner;

class Bookmark {
	private String bookTitle;
	private int pageNumber;
	private String location;
	
	public Bookmark(String bookTitle, int pageNumber, String location) {
		this.bookTitle = bookTitle;
		this.pageNumber = pageNumber;
		this.location = location;
	}
	
	public String getBooktitle() {
		return bookTitle;
	}
	
	public int getPageNumber() {
		return pageNumber;
	}
	
	public String getLocation() {
		return location;
	}
	
	@Override
	public String toString() {
		return "Book: " + bookTitle + ", Page: "+ pageNumber + ", Location: "+ location;
	}
}

public class BookmarkManager {
	private static ArrayList<Bookmark> bookmarks = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean running = true;
		
		while (running) {
			System.out.println("1. Add Bookmark");
			System.out.println("2. List Bookmarks");
			System.out.println("3. Search Bookmarks");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 1:
				addBookmark();
				break;
			case 2: 
				listBookmark();
				break;
			case 3:
				searchBookmarks();
				break;
			case 4:
				running = false;
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
	
	private static void addBookmark() {
		System.out.println("Enter book title: ");
		String bookTitle = scanner.nextLine();
		System.out.println("Enter page number: ");
		int pageNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Location: ");
		String location = scanner.nextLine();
		
		Bookmark bookmark = new Bookmark(bookTitle, pageNumber, location);
		bookmarks.add(bookmark);
		System.out.println("Bookmark added sucessfully! ");
	}
	
	private static void listBookmark() {
		if (bookmarks.isEmpty()) {
			System.out.println("no Bookmarks aviable.");
		} else {
			System.out.println("Bookmarks");
			for (Bookmark bookmark : bookmarks) {
				System.out.println(bookmark);
			}
		}
	} 
	
	private static void searchBookmarks() {
		System.out.print("enter book title to search: ");
		String searchTitle = scanner.nextLine();
				
		boolean found = false;
		for (Bookmark bookmark : bookmarks) {
			if (bookmark.getBooktitle().equalsIgnoreCase(searchTitle)) {
				System.out.println("Bookmark found: ");
				System.out.println(bookmark);
				found = true;
			}
		}
		
		if(!found) {
			System.out.println("Bookmark no found for book: " + searchTitle);
		}
	}
}
