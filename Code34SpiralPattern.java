// print the spiral Pattern where the largest number become outer boundry

import java.util.Scanner;
import java.lang.Math;
public class Code34SpiralPattern {
  
  public static void printPattern(int n){
    int size = 2*n-1;
    for(int i = 1;i<=size;i++) {
      for(int j= 1; j<=size;j++){
        System.out.print(Math.max(Math.abs(i-n),Math.abs(j-n))+1 +" ");
      }
      System.out.println();
    }
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = sc.nextInt();
    System.out.println();

    printPattern(n);
  }
}

/*  Output

Enter the value of n: 5

5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5

*/
