import java.util.Scanner;

public class TaxCalc {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int salary = sc.nextInt();
      double TIER1 = 0.05;
      double TIER2 = 0.20;
      double TIER3 = 0.30;

      if (salary <= 250000) {
         System.out.println("No tax");
      }
      else if (salary > 250000 && salary < 500000) {
         System.out.printf("income is %d", (int)(salary - (salary*TIER1)));
      } 
      else if (salary > 500000 && salary < 1000000) {
         System.out.printf("income is %d", (int)(salary - (salary*TIER2)));
      }
      else if (salary > 1000000) {
         System.out.printf("income is %d", (int)(salary - (salary*TIER3)));
      }
   }   
}
