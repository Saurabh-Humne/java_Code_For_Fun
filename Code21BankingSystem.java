// Create a Java Program To Demonstrate the working of a banking system.
// Creat an Account Class which has deposit() and withdaw() methods
class Account {
 int acc_no;
 String name;
 float amount;

// Method to intilalize object
 void insert(int a,String n,float amt){
  acc_no=a;
  name=n;
  amount=amt;
 }
 
// deposit method
 void deposit(float amt){
  amount = amount + amt;
  System.out.println(amt+"deposited");
 }

// withdraw method
 void withdraw(float amt){
  if (amount<amt){
   System.out.println("insufficient Balance");
  } else {
   amount = amount-amt;
   System.out.println(amt+"withdrawn");
  }
 }

// method to check the balance of the account
 void checkBalance(){
  System.out.println("Balance is "+ amount);
 }

 void display(){
  System.out.println(acc_no+ " " + name + " " + amount);
 }
 
}

// Creating a test class to deposite and withdraw amount

class Code21BankingSystem {
 public static void main(String[] args){
  Account a1 = new Account();

  a1.insert(000034,"Amit",1000);
  a1.display();
  a1.checkBalance();
  a1.deposit(2000);
  a1.checkBalance();
  a1.withdraw(500);
  a1.checkBalance();
 }
}

/* Output

28 Amit 1000.0
Balance is 1000.0
2000.0deposited
Balance is 3000.0
500.0withdrawn
Balance is 2500.0

*/
