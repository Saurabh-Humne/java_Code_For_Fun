//Display Prime Numbers between Tow Intervels

class Code31PrimeInTwo {
 public static void main(String[] args){
  int low = 20, high = 50;

  while(low < high) {
   boolean flag = false;

   for(int i = 2; i<=low/2; ++i) {
    if (low % i == 0) {
     flag = true;
     break;
    }
   }

   if (!flag && low != 0 && low != 1){
     System.out.print(low + " ");
     }
     ++low;
  }
 }
}

/* Output

23 29 31 37 41 43 47

*/
