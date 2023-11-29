// Creat a simple calculator Can perform +, -, *, or /

import java.util.Scanner;

class Code16SimpleCalculator {
 public static void main(String[] args){
  char operator;
  double num1,num2,result;

  Scanner sc = new Scanner(System.in);

  System.out.println("Input an Operator : +, -, *, or /");
  operator = sc.next().charAt(0);

  System.out.println("Enter first number");
  num1 = sc.nextDouble();

  System.out.println("Enter second Number");
  num2 = sc.nextDouble();

  switch(operator){
   case '*':
   result = num1 * num2;
   System.out.println(num1 + " * " +num2+ " = " + result);
   break;

   case '-':
   result = num1 - num2;
   System.out.println(num1 + " - " + num2 +" = "+ result);
   break;

   case '+':
   result = num1 + num2;
   System.out.println(num1 + " + " + num2 +" + "+ result);
   break;
  
   case '/':
   result = num1 + num2;
   System.out.println(num1 +" / "+ num2 +" = "+ result);
   break;

   default:
   System.out.println("Enter valid operator");
   break;
  }  
  sc.close();
 }
}

/* Output

Input an Operator : +, -, *, or /
*
Enter first number
3
Enter second Number
10
3.0 * 10.0 = 30.0

*/