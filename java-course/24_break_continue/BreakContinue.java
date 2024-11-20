public class BreakContinue {

   public static void main(String[] args) {
      // continue
      for (int i = 0; i < 50; i++) {
         if (i==2) {
            System.out.println("The value of i is 2");
            continue;
         }
         System.out.println(i);
      }

      int j = 0;
      do {
         j++;
         if (j == 2) {
            System.out.println("End of the loop");
            continue;
         }
         System.out.println(j);
      } while (j<5);
      System.out.println("Loop ends here");
   }
}