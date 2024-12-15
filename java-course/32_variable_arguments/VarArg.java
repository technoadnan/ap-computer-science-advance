// package 32_variable_arguments;

// public class VarArg {
   
// }


public class VarArg {
   static int sum(int ...arr){
      int result = 0;
      for (int i : arr) {
         result += i;
      }
      return result;
   }
   public static void main(String[] args) {
      // if we want to create unlimited parameters
      // the parameters is optional, meaning if its leaves blank there is NO ISSUE 
      System.out.println(sum(4,5,6));
      // System.out.println(sum()); // 0
   }   
   
}