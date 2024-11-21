import java.util.Scanner;

public class FactorialNum {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); // 4
      int sum = 1;

      
      // for (int i = 1; i <= n; i++) {
      //    sum  = sum*i;
      // }
      // System.out.println(sum);

      int i = 1;
      while (i<=n) {
         sum = sum * i;
         i++;
      }
      System.out.println(sum);

   }
}
