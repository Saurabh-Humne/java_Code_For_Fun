// Find the right age for a person to vote (using Method)

class Code13UsingMethod {
 static void FindAge(int age) {
  if(age < 18){
   System.out.println("Your are too young");
  } else {
   System.out.println("You can vote");
  }
 }
 public static void main(String[] args){
  int n = 20;
  FindAge(n);
 }
 
}
/* Output

You can vote

*/