// find the number is present in an given array

class Code15FindNumInArray {
 public static void main(String[] args){
  
  int[] num = {1,2,3,4,5,6,7,8,9,0};
  int find = 9;
  boolean found = false;

  for(int n : num){
   if (n == find){
    found = true;
    break;
   }
  }
  
  if(found){
   System.out.println(find + " is present in array");
  } else {
   System.out.println(find + " is not present in array");
  }
 }
}

/* Output

9 is present in array

*/