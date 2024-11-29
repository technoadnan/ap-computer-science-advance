public class FindInt {
   public static void main(String[] args) {
      int numToFind = 43;
      int[] nums = {34,323,34,33,43,56,778};
      boolean status = false;
      for (int i = 0; i < nums.length; i++) {
         if (numToFind == nums[i]) {
            status = true;
            // System.out.println("Num found");
         }
      }
      System.out.println(status);
   }
}
