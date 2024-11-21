public class SumOfNumIn8 {
   public static void main(String[] args) {
      int n = 8;
      int sum = 0;
      for (int i = 1; i <= 10; i++) {
         sum = (n*i) + sum;
         System.out.println(sum);
         // System.out.printf("%d x %d = %d\n",n,i,n*i);
      }
      // System.out.println(sum);
   }   
}
