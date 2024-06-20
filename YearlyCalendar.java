import java.time.*;
import java.time.format.*;
import java.util.Locale;

public class YearlyCalendar {

	public static void main(String[] args) {
		int year = Year.now().getValue();
		
		for (int month = 1; month <= 12; month++) {
			printMonthCalendar(year, month);
			System.out.println();
		}
	}
	
	public static void printMonthCalendar(int year, int month) {
		LocalDate date = LocalDate.of(year, month, 1);
		
		String monthName = date.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
		System.out.println(monthName + " " + year);
		
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		
		int startDayOfWeek = date.getDayOfWeek().getValue();
		
		for(int i = 1; i < startDayOfWeek; i++) {
			System.out.print("    ");
		}
		
		while (date.getMonthValue() == month) {
			System.out.printf("%3d", date.getDayOfMonth());
			
			date = date.plusDays(1);
			
			if(date.getDayOfWeek() == DayOfWeek.MONDAY) {
				System.out.println();
			}
		}
		
		System.out.println();
	}
}
