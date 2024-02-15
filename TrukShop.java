import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

class Truck {
	private String truckNumber;
	private LocalTime entryTime;
	private LocalTime exitTime;
	
	public Truck(String truckNumber, LocalTime entryTime) {
		this.truckNumber = truckNumber;
		this.entryTime = entryTime;
	}
	
	public void leaveShope(LocalTime exitTime) {
		this.exitTime = exitTime;
	}
	
	public String getTruckNumber() {
		return truckNumber;
	}
	
	public LocalTime getEntryTime() {
		return entryTime;
	}
	
	public LocalTime getExitTime() {
		return exitTime;
	}
	
	public long getHoursStayed() {
		return entryTime.until(exitTime, ChronoUnit.HOURS);
	}
	
	public long getMinutesStayde() {
		return entryTime.until(exitTime, ChronoUnit.MINUTES) % 60;
	}
}

public class TruckShop {
	public static void main(String[] args) {
		List<Truck> truckList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		char continueFlag;
		
		do {
			// Prompt user for truck details
			System.out.print("Enter truck number; ");
			String truckNumber = scanner.nextLine();
			
			System.out.print("Enter entry time (HH:mm): ");
			String entryTimeStr = scanner.nextLine();
			LocalTime entryTime = LocalTime.parse(entryTimeStr, DateTimeFormatter.ofPattern("HH:mm"));
			
			// Prompt user for exit time
			System.out.print("Enter exit time (HH:mm): ");
			String exitTimeStr = scanner.nextLine();
			LocalTime exitTime = LocalTime.parse(exitTimeStr, DateTimeFormatter.ofPattern("HH:mm"));
			
			
			// Simulate truck leaving the shop
			Truck truck = new Truck(truckNumber, entryTime);
			try {
				Thread.sleep(3000); // simulate 3 seconds of work in the shop
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			// Trucks leaving the shop
			truck.leaveShope(exitTime);
			truckList.add(truck);
			
			// Display the table
			System.out.println("Truck Number | Entery Time | Exit Time | Time Stayed");
			System.out.println("------------------------------------------------");
			for (Truck t : truckList) {
				System.out.printf("%12s | %11s | %9s | %d hours %d minutes%n",
						t.getTruckNumber(), t.getEntryTime(), t.getExitTime(),
						t.getHoursStayed(), t.getMinutesStayde());
			}
			
			// prompt user to continue
			System.out.print("Do you want to continue? (Y/N): ");
			continueFlag = scanner.nextLine().toUpperCase().charAt(0);
		} while (continueFlag == 'Y');
		
		// close the scanner
		scanner.close();
	}
}

/* OUTPUT
Enter truck number; MH31AB1111
Enter entry time (HH:mm): 09:00
Enter exit time (HH:mm): 10:00
Truck Number | Entery Time | Exit Time | Time Stayed
------------------------------------------------
  MH31AB1111 |       09:00 |     10:00 | 1 hours 0 minutes
Do you want to continue? (Y/N): Y
Enter truck number; MH31CD2222
Enter entry time (HH:mm): 09:00
Enter exit time (HH:mm): 11:00
Truck Number | Entery Time | Exit Time | Time Stayed
------------------------------------------------
  MH31AB1111 |       09:00 |     10:00 | 1 hours 0 minutes
  MH31CD2222 |       09:00 |     11:00 | 2 hours 0 minutes
Do you want to continue? (Y/N): N
*/
