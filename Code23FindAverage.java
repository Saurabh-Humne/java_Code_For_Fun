// Find the average of given munbers of array.


class Code23FindAverage {
 public static void main(String[] args){
  double[] numArray = {23.3, 14.5, 36.7, 18.2};
  double sum = 0.0;


  for (double num: numArray){
    sum += num;
  }

  double average  = sum / numArray.length;
  System.out.println("The average is :" + average);
 }
}

/* Output

The average is :23.175

*/
