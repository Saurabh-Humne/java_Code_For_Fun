// Take String from users and remove the wite space

import java.util.Scanner;

class Code27Witespace2 {
 public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a line");

  String input = sc.nextLine();
  System.out.println("Your line "+input);

  input = input.replaceAll("\\s", "");
  System.out.println("Final line: "+ input);
 }
}

/* Output

Enter a line
He  ll  o W o r l d   !!!
Your line He  ll  o W o r l d   !!!
Final line: HelloWorld!!!

*/
