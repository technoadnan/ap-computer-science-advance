import java.util.Scanner;
public class Ch1_Q1_SumOfThreeNum {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Num 1: ");
      int num1 = sc.nextInt();
      
      System.out.println("Num 2: ");
      int num2 = sc.nextInt();
      
      System.out.println("Num 3: ");
      int num3 = sc.nextInt();

      System.out.println("Sum of three numbers: " + (num1 + num2 + num3));
   }
}
