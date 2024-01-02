// java Program to implement Bubble Sort Algorithm

import java.util.Arrays;
import java.util.Scanner;

class Code29BubbleSort {
 Scanner input = new Scanner(System.in);

 void bubbleSort(int array[]){
  int size = array.length;

  System.out.println("Choose Sort Order: \n1 for Assending \n2 for Decending");
  int sortOrder = input.nextInt();

  for (int i =0; i< size-1; i++){
   for (int j =0; j<size-i-1; j++){
    if(sortOrder == 1){
     if(array[j]> array[j+1]){
      int temp = array[j];
      array[j] = array[j+1];
      array[j+1] = temp;
     }
    } else {
     if (array[j] < array[j+1]){
      int temp = array[j];
      array[j] = array[j+1];
      array[j+1] = temp;
     }
    }
   }
  }
   
 }

 public static void main(String[] args){
  int[] data = {-9, 20,45,35,8};

  Code29BubbleSort bubble = new Code29BubbleSort();
  
  bubble.bubbleSort(data);
  System.out.println("Sort According to Asceding Order: ");

  System.out.println(Arrays.toString(data));
 }
}

/* Output

Choose Sort Order:
1 for Assending
2 for Decending
1
Sort According to Asceding Order:
[-9, 8, 20, 35, 45]

*/
