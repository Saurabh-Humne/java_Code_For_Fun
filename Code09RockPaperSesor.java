import java.util.Scanner;
import java.util.Random;

class Code09RockPaperSesor {
 public static void main(String[] args){
  System.out.println("To start the game press 0 for rock, 1 for paper, 2 for Seasor");

  Scanner scanner = new Scanner(System.in);
  Random random = new Random();

  int user = scanner.nextInt();
  int computer = random.nextInt(3);

  if(user == computer){
   System.out.println("Draw");
  }
  else if(user == 0 && computer == 2 || user == 1 && computer == 0 || user == 2 && computer == 1){
   System.out.println("You Win");
  }
  else{
   System.out.println("Computer Win");
  }
 }
}