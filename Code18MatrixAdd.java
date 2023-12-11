// Add Two Matrices In Java

public class Code18MatrixAdd {
 public static void main(String[] args) {
  int a[][] = {{1,2,3},{1,1,1},{7,8,9}};
  int b[][] = {{3,2,1},{4,4,4},{7,8,9}};

  int c[][] = new int[3][3];

  for(int i=0;i<3;i++){
   for(int j=0;j<3;j++){
    c[i][j] = a[i][j] + b[i][j];
    System.out.print(c[i][j]+ " ");
   }
   System.out.println();
  }
 }
}

/* Output
4 4 4
5 5 5
14 16 18
*/
