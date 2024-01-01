// Check if the statement is Empty or Null

class Code28EmptyOrNull {
 public static void main(String[] args){
  

  String s1 = null;
  String s2 = "";
  String s3 = "  ";

  System.out.println("s1 is "+ isNullEmpty(s1));
  System.out.println("s2 is "+ isNullEmpty(s2));
  System.out.println("s3 is "+ isNullEmpty(s3));

 }

 public static String isNullEmpty(String s){
  
  if (s == null){
    return "NULL";
  } else if(s.isEmpty()){
    return "empty";
  } else {
    return "nither null or empty";
  }
 }
}

/* Output

s1 is NULL
s2 is empty
s3 is nither null or empty

*/
