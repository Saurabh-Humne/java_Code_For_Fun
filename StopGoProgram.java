import java.util.Scanner;

public class StopGoProgram {
	public static void main(String[] args) {
		System.out.println("Stop for 60 seconds.");
		stopForSeconds(60);
		
		System.out.println("Go for 25 sconds.");
		goForSeconds(25);
		
		System.out.println("Progran exited.");
	}
	
	private static void stopForSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);// Convert seconds to nilliseconds
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			Thread.currentThread().interrupt();
		}
	}
	
	private static void goForSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
