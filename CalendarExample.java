import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		// Get current date
		Calendar calendar = Calendar.getInstance();
		
		// Set the calenda to the first day of the current month
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		
		// Get the first day of the week (e.g. , Sunday or Monday depending on your locale)
		int firstDayOfWeek = calendar.getFirstDayOfWeek();
		
		// Print the header
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		
		// Move to the first day Of the week
		int currentDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int leadingSpaces = (currentDayOfWeek - firstDayOfWeek + 7) % 7;
		
		// Print leading spaces
		for(int i = 0; i < leadingSpaces; i++) {
			System.out.print("    ");
		}
		
		// Print the days ofthe month
		while (calendar.get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH)) {
			int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
			System.out.printf(" %3d", dayOfMonth);
			
			// Move to the next day
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			
			// Move To the next line if it's the last day of the weel=k
			if(calendar.get(Calendar.DAY_OF_WEEK) == firstDayOfWeek) {
				System.out.println();
			}
		}
	}
}
