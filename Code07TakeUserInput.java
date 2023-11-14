// write a program to take user input using scanner 

import java.util.Scanner;

class Code07TakeUserInput {
 public static void main(String[] args){
  
  Scanner sc = new Scanner(System.in);  

  System.out.println("Enter Your name");
  String name = sc.nextLine();

  System.out.println("Hello "+name);
  sc.close();
 }
}

/* OutPut

Enter Your name
java
Hello java

*/