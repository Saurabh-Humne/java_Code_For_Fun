// write a code to find the Factorial of a number

class Code24Factorial {
 public static void main(String[] args){
  int num = 8;
  long factorial = multiplyNumber(num);
  System.out.println("Factorial of "+ num +" = "+ factorial);
 }
 
 public static long multiplyNumber(int num){
  if (num >= 1){
    return num * multiplyNumber(num - 1);
  } else {
    return 1;
  }
 }
}

/* Output

Factorial of 8 = 40320

*/
