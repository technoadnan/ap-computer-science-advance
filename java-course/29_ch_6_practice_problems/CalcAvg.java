public class CalcAvg {
   public static void main(String[] args) {
      int[] marks = new int[3];
      marks[0] = 56;
      marks[1] = 91;
      marks[2] = 99;


      int sum = 0;
      for (int i = 0; i < marks.length; i++) {
         // System.out.println();
         sum = sum + marks[i];
      }
      System.out.println(sum/marks.length);

   }
}
