// Find Wether The Given number is prime or not

class Code04FindPrimeNumbers {
 public static void main(String[] args){
  int num=5;
  int div= num/2;
  int flag=0;
  
  if(num==0||num==1){
   System.out.println("It Is not a Prime Number");
  } else {
	for(int i=2;i<=div;i++) {
	 if(num%i==0){
	  System.out.println(num+" is not a Prime Number");
	  flag=1;
	  break;
	 }
	}
	if(flag==0) {
	 System.out.println(num+" is Prime Number");
	}
  }
 }
}

/* Output

5 is Prime Number

*/