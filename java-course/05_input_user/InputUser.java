import java.util.Scanner; // for input

public class InputUser {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter num 1: ");
      int num1 = sc.nextInt();
      System.out.println("Enter num 2: ");
      int num2 = sc.nextInt();
      int sum = num1 + num2;
      System.out.println(sum);
      
      // returns true if isNum is int only
      boolean isNum = sc.hasNextInt();
      System.out.println(isNum);

   }
}
