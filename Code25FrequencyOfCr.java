// find the frequency of character in string

class Code25FrequencyOfCr {
 public static void main(String[] args){
  String str = "This line contain number$ of $ome $pecial character";
  System.out.println(str);

  char ch = '$';
  int frequency = 0;
  
  for(int i = 0; i<str.length(); i++){
   if (ch == str.charAt(i)) {
    ++frequency;
   }
  }

  System.out.println("The frequency of character "+ ch + " is "+ frequency);
 }
}

/* Output

This line contain number$ of $ome $pecial character
The frequency of character $ is 3

*/
