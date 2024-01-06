// To creat immutable class

final class Immutable {
 private String name;
 private int date;

 Immutable(String name, int date){
  this.name = name;
  this.date = date;
 }

 public String getName(){
  return name;
 }

 public int getDate(){
  return date;
 }
}

class Code33Immutable {
 public static void main(String[] args){
  

  Immutable obj = new Immutable("New Year", 2024);

  System.out.println("Name: " + obj.getName());
  System.out.println("Date: " + obj.getDate());
 }
}

/* Output

Name: New Year
Date: 2024

*/
