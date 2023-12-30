// Write a code to remove all the witespaces

class Code26Witespaces {
 public static void main(String[] args){
  String sentence = "The Wa y T o Wr i te    A L   et ter";
  System.out.println("Original sentence "+ sentence);

  sentence = sentence.replaceAll("\\s","");
  System.out.println("After replecement "+ sentence);
 }
}

/* output

Original sentence The Wa y T o Wr i te    A L   et ter
After replecement TheWayToWriteALetter

*/
