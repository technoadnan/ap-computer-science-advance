public class ArrayForEachLoop {

   public static void main(String[] args) {
      int[] marks = {98,45,78,99,89};
      // System.out.println(marks.length); // lengths

      // for loop
      for (int i = 0; i < marks.length; i++) {
         System.out.println(marks[i]);
      }

      System.out.println("----- For each -----");
      // for each loop
      for (int i : marks) {
         System.out.println(i);
      }


      System.out.println("reverse order");
      // reverse order
      for (int i = marks.length -1; i > 0; i--) {
         System.out.println(marks[i]);
      }


   }
}