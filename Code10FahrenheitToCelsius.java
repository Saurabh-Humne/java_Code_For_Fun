// Convert temperature fahrenheit to celsius

import java.util.Scanner;

class Code10FahrenheitToCelsius {
 public static void main(String[] args){
  float temperatue;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter temperature in fahrenheit");
  temperatue = sc.nextInt();

  temperatue = ((temperatue - 32)*5)/9;

  System.out.println("Temperatue in celsius = "+ temperatue);
  
 }
}

/* Output
Enter temperature in fahrenheit
100
Temperatue in celsius = 37.77778
*/