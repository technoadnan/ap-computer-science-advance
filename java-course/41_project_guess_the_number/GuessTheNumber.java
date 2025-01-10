
import java.util.Scanner;

public class GuessTheNumber {
   
   public static void main(String[] args) {
      GuessNum p1 = new GuessNum();

      while (true) {
         int userInput = p1.takeUserInput();
         if (p1.isCorrectNumber(userInput)) {
            break;
         }
      }
   }

}

class GuessNum {
   private final int randInt; // what is final
   private int userInput;
   private int noOfGuesses = 1;

   public GuessNum(){
      randInt = (int)(Math.random()*101);
   }

   public int takeUserInput(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      this.userInput = sc.nextInt();
      // sc.close();
      return userInput;
   }

   public int getUserInput(){
      return userInput;
   }

   public boolean isCorrectNumber(int n){
      if (this.userInput > this.randInt) {
         // this.noOfGuesses++;
         System.out.println("Your number is greater");
         System.out.println("number of guesses: "+noOfGuesses++);
         return false;
      }
      else if (this.userInput < this.randInt) {
         // return "Your number is smaller";
         System.out.println("Your number is smaller");
         System.out.println("number of guesses: "+noOfGuesses++);
         return false;
      }
      System.out.println("Number is same");
      return true;
   }



   
}
