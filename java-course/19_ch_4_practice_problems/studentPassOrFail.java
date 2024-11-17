import java.util.Scanner;

public class StudentPassOrFail {

   public static void main(String[] args) {
      // sou
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the grade for 1st sub: ");
      int mark1 = sc.nextInt();
      System.out.println("Enter the grade for 2nd sub: ");
      int mark2 = sc.nextInt();
      System.out.println("Enter the grade for 3rd sub: ");
      int mark3 = sc.nextInt();

      int avg = (mark1 + mark2 + mark3)/3;

      if (mark1 >= 33 && mark2 >= 33 && mark3 >= 33) {
         if (avg >= 40) {
            System.out.println("Pass");
         }
      } else {
         System.out.println("fail");
      }
   }
}