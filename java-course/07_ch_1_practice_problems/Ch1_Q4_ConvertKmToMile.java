import java.util.Scanner;

public class Ch1_Q4_ConvertKmToMile {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Kilometer: ");
      float kilometer = sc.nextInt();
      float miles = kilometer / 1.609f;
      System.out.println("Miles: " + miles);
   }
}
