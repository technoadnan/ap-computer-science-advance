public class MaxArr {

   public static void main(String[] args) {
      int highestMarks = 0;
      int[] marks = {345,45,4,5,45};
      for (int i = 0; i < marks.length; i++) {
         if (marks[i] > highestMarks){
            highestMarks = marks[i];
         } 
      }
      System.out.println(highestMarks);
   }
}