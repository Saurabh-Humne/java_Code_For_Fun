// write code to count vowels, consonants, digits, spaces in a given line.

class Code17CountLine {
 public static void main(String[] args){
  String line = "this is my 17th code in java for fun";
  int vowels = 0, consonants = 0, digits = 0, spaces = 0;

  line = line.toLowerCase();
  for (int i=0; i<line.length(); ++i){
   char c = line.charAt(i);

   if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
    ++vowels;
   } else if ((c >= 'a' && c <= 'z')) {
    ++consonants;
   } else if (c >= '0' && c <= '9') {
    ++digits;
   } else if (c == ' ') {
    ++spaces;
   }
  }

  System.out.println("vowels: "+ vowels);
  System.out.println("consonants: "+ consonants);
  System.out.println("digits: "+ digits);
  System.out.println("spaces: "+ spaces);
 }
}

/* Output

vowels: 9
consonants: 17
digits: 2
spaces: 8

*/