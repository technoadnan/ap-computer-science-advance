public class MethodPattern {

   public static void increasingPattern(int n){
      for (int i = 1; i <= n; i++) {
         // System.out.println("* ");
         for (int j = 1; j <= i; j++) {
            System.out.print("* ");
         }
         System.out.println();
      } 
   }  

   public static void decreasingPattern(int n){
      for (int i = 1; i <= n; i++) {
         for (int j = i; j <= n; j++) {
            System.out.print("* ");
         }
         System.out.println();
      }
   }

   public static void main(String[] args) {
      // increasingPattern(5);
      decreasingPattern(5);
   }
}