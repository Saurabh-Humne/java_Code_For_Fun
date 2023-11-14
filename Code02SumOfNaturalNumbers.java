// To Find the sum of Natural Numbers From 1 to 100 using for loop

class Code02SumOfNaturalNumbers {
 public static void main(String[] args) {
  int num=100,sum=0;

  for(int i=1;i<=num;i++) {
   sum = sum+i;
  }
  System.out.println("The sum of 1 to 100 is = "+sum);
 }
}

/* Output

The sum of 1 to 100 is = 5050

*/