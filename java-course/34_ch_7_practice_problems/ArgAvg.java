
public class ArgAvg {
   
   static int avg(int ...arr){
      int result = 0;
      int cnt=0;
      for (int i : arr) {
         result += i;
         cnt += 1;
      }
      return result/cnt;
   }

   
   public static void main(String[] args) {
      
      int[] nums = {10,10,10,40,20};
      System.out.println(avg(nums));

      

   }
}
