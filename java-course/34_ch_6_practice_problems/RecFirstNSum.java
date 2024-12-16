

public class RecFirstNSum {
   
   static int sumOfN(int n){
      int cnt;
      if (n == 1){
         return 1;
      }
      // int temp = n;
      cnt = n + sumOfN(n-1);
      return cnt;
   }
   
   public static void main(String[] args) {
      System.out.println(sumOfN(5));
   }   
}
