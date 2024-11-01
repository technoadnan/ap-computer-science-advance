import java.util.Scanner;

public class Ch1_Q3_GreetingUser {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name");
      String name = sc.nextLine();
      System.out.printf("Hello %s, have a good day",name);

   }
}
