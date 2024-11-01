import java.util.Scanner;

public class GradeCalc {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the grade for Sub 1: ");
      float sub1 = sc.nextFloat();
      
      System.out.println("Enter the grade for Sub 2: ");
      float sub2 = sc.nextFloat();
      
      System.out.println("Enter the grade for Sub 3: ");
      float sub3 = sc.nextFloat();
      
      System.out.println("Enter the grade for Sub 4: ");
      float sub4 = sc.nextFloat();

      float avg = (sub1 + sub2 + sub3 + sub4)/4;

      System.out.println(avg+"%");




   }
}
