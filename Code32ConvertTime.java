// Convert Milliseconds to Seconds

import java.util.concurrent.TimeUnit;

class Code32ConvertTime {
 public static void main(String[] args){
  long milliseconds = 1000000;

 long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
 System.out.println(milliseconds + "Milliseconds = " + seconds + "Seconds");


 long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
 System.out.println(milliseconds + " Milliseconds = "+ minutes + " Minutes");
 }
}

/* Output 

1000000Milliseconds = 1000Seconds
1000000 Milliseconds = 16 Minutes

*/
