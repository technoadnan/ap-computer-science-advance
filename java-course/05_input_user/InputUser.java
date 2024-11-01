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
      
      // // returns true if isNum is int only
      // boolean isNum = sc.hasNextInt();
      // System.out.println(isNum);

      // String
      String name2 = sc.nextLine();
      System.out.println(name2);
      String name = sc.next();
      System.out.println(name);

      // next()
      /* it reads a single word (up to the first space) and leaves the newline character (from pressing Enter) in the input buffer. As a result, when you then call sc.nextLine() to read name2, it captures that leftover newline character instead of waiting for new input. */
      // use nextLine always


   }
}
