// print the patten of bigger to small and continue small to big

class Code11Pattrn {
 public static void main(String[] args){
  
  int num = 6;
  
  for(int i=num;i>=1;i--){
   for(int j=1;j<=i;j++){
    System.out.print(j +" ");
   }
   System.out.println();
  }

  for(int i=2;i<=num;i++){
   for(int j=1; j<=i;j++){
    System.out.print(j +" ");
   }
   System.out.println();
  }
 }
}

/* Output
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
*/