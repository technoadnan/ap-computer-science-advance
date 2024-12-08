public class MinArr {
   public static void main(String[] args) {
      int[] marks = {34,45,23,12,45};
      int min = marks[0];
      for (int i = 0; i < marks.length; i++) {
         if (marks[i] < min) {
            min = marks[i];
            // marks.
         }
      }
      System.out.println(min);
   }
}
