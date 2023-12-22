class Code22FindLargest {
 public static void main(String[] args){
  int[] numArray = {34,56,3,4,55,6};

  int largest = numArray[0];
  
  for (int num : numArray){
   if (largest < num){ 
    largest = num ;
    }
  }
   System.out.println("largest element = :" + largest);
 }
}
