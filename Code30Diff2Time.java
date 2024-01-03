// Calculate Difference Bitween Two Time Periods

public class Code30Diff2Time {
 int seconds;
 int minutes;
 int hours;

 public Code30Diff2Time(int hours, int minutes, int seconds) {
  this.hours = hours;
  this.minutes = minutes;
  this.seconds = seconds;
 }

 public static void main(String[] args){
	 Code30Diff2Time start = new  Code30Diff2Time(9, 30, 20);
	 Code30Diff2Time stop = new  Code30Diff2Time(12, 30, 50);
	 Code30Diff2Time diff;

  diff = difference(start, stop);

  System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
  System.out.printf("%d:%d:%d", stop.hours, stop.minutes, stop.seconds);
  System.out.printf("+ %d:%d:%d", diff.hours, diff.minutes, diff.seconds);
 }

 public static  Code30Diff2Time difference( Code30Diff2Time start, Code30Diff2Time stop){
	 Code30Diff2Time diff = new  Code30Diff2Time(0, 0, 0);
	 
  if(start.seconds > stop.seconds) {
	  --stop.minutes;
	  stop.seconds += 60;
  }
  
  diff.seconds = stop.seconds - start.seconds;

  if(start.minutes > stop.minutes){
   --stop.hours;
   stop.minutes += 60;
  }

  diff.minutes = stop.minutes - start.minutes;
  diff.hours = stop.hours - start.hours;

  return(diff);
 }
}

/* Output

TIME DIFFERENCE: 9:30:20 - 12:30:50+ 3:0:30

*/
