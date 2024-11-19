import java.util.Scanner;

public class RockPaperScissors {
   // r -> p -> p
   // s -> p -> s
   // s -> r -> r
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the letter of players you want to play");
      char player1 = sc.next().charAt(0);
      System.out.println("Enter the letter of players you want to play");
      char player2 = sc.next().charAt(0);
      
      if (player1 == 'p' && player2 == 'r'){
         System.out.println("Player 1 won");
      } 
      else if (player1 == 's' && player2 == 'p'){
         System.out.println("Player 1 won");
      }
      else if (player1 == 'r' && player2 == 's'){
         System.out.println("Player 1 won");
      }
      else if (player1 == player2) {
         System.out.println("Draw");
      }
      else {
         System.out.println("Player 2 won");
      }

   }





   // System.out.println(ch);
   



}
