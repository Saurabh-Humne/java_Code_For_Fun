// find evem numbers from 1 to 100

class Code01FindEvenNumbers {
 public static void main(String[] args) {
  int num = 100;
  System.out.println("The even numbers from 1 to 100 is:");
  for(int i=1;i<=num;i++) {
   if (i%2==0) {
    System.out.print(" "+i);
   }
  }
 }
}

/* Output

The even numbers from 1 to 100 is:
 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100

*/