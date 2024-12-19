
public class RecMethodPattern {
   static String increasingPattern(int n, int m){
      // if (n == 0){
      //    return "";
      // }
      // return increasingPattern(n-1) + "*";

      if (m == 0){
         return "*\n";
      }
      System.out.print(increasingPattern(n, m-1) + "$");
      return increasingPattern(n, m-1) + "*";


   }
   public static void main(String[] args) {
      int n = 5;
      int m = n;
      increasingPattern(n, m);
      // System.out.print(increasingPattern(n, m));  
      
      
   }
}
