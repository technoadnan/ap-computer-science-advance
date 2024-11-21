import java.util.Scanner;

public class SumFirstEvenNum {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      // int sum = 0;
      // for (int i = 0; i < n; n--) {
      //    if (n % 2 == 0) {
      //       System.out.println(n);
      //       sum += n;
      //    }
      // }
      // System.out.println(sum);

      System.out.println(n*(n+1));
   }
}
